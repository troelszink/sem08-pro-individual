using System;
using Entities;
using Mqtt;
using Logging;

#region Variables
IMqttService mqtt = new MqttService();
Logging


Dictionary<string, Crane> cranes = new();
Dictionary<string, Disk> disks = new();
Dictionary<string, Camera> cameras = new();

bool running = true;
#endregion

#region Main
Setup();
Run().GetAwaiter().GetResult();
#endregion

void Setup()
{
	cranes.Add("crane1", new Crane("crane1", new Dictionary<string, int>()
	{
		{"pickupDisk", 0},
		{"outRed", 30},
		{"outGreen", 60},
		{"outBlue", 90}
	}, mqtt));
	disks.Add("disk1", new Disk("disk1", 8, new Dictionary<string, int>()
	{
		{"craneZone", 1},
		{"cameraZone", 3},
		{"intakeZone", 6}
	}, mqtt));
	cameras.Add("camera1", new Camera("camera1", new List<string>()
	{
		"blue",
		"green",
		"red"
	}, mqtt));
}

async Task Run()	
{
	var crane1 = cranes["crane1"];
	var disk1 = disks["disk1"];
	var camera1 = cameras["camera1"];

	LoggingService.LogCraneErrors(crane1, mqtt);
	LoggingService.LogCraneInfo(camera1, mqtt);

	while (running)
	{
		foreach (var aSlot in disk1.GetSlotsWithMark(SlotState.Complete))
		{
			await disk1.MoveSlot(aSlot.Number, "craneZone");
			await crane1.GoTo("pickupDisk");
			await crane1.PickupItem();
			if (aSlot.HasMark("RED"))
			{
				await crane1.GoTo("outRed");
				await crane1.DropItem();
			}
			if (aSlot.HasMark("GREEN"))
			{
				await crane1.GoTo("outGreen");
				await crane1.DropItem();
			}
			if (aSlot.HasMark("BLUE"))
			{
				await crane1.GoTo("outBlue");
				await crane1.DropItem();
			}
			disk1.MarkSlot("craneZone", SlotState.Empty);
		}
		if (!disk1.IsFull())
		{
			await disk1.MoveSlot(disk1.GetEmptySlotNumber(), "intakeZone");
			await disk1.WaitForIntake();
			disk1.MarkSlot("intakeZone", SlotState.InProgress);
			await disk1.MoveSlot("intakeZone", "cameraZone");
			var aColor = await camera1.Scan();
			disk1.MarkSlot("cameraZone", aColor);
			if (aColor == "RED")
			{
				Task.Run(async () =>
				{
					await Task.Delay(10000);
					disk1.MarkSlot("cameraZone", SlotState.Complete);
				});
			}
			if (aColor == "GREEN")
			{
				Task.Run(async () =>
				{
					await Task.Delay(20000);
					disk1.MarkSlot("cameraZone", SlotState.Complete);
				});
			}
			if (aColor == "BLUE")
			{
				Task.Run(async () =>
				{
					await Task.Delay(30000);
					disk1.MarkSlot("cameraZone", SlotState.Complete);
				});
			}
		}
	}
}
