using System;
using Entities;
using Mqtt;
using Logging;

#region Variables
IMqttService mqtt = new MqttService();

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
		{"outBlue", 130}
	}, mqtt));
	disks.Add("disk1", new Disk("disk1", 8, new Dictionary<string, int>()
	{
		{"craneZone", 4},
		{"cameraZone", 3},
		{"intakeZone", 6}
	}, mqtt));
	disks.Add("disk2", new Disk("disk2", 4, new Dictionary<string, int>()
	{
		{"zone1", 1},
		{"zone2", 4}
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
	var disk2 = disks["disk2"];
	var camera1 = cameras["camera1"];

	LogCraneInfo(crane1, mqtt);
	LogCraneWarnings(disk1, mqtt);
	LogCraneAll(disk2, mqtt);

	while (running)
	{
		foreach (var aSlot in disk1.null)
		{
			await disk1.MoveSlot(aSlot.Number, "craneZone");
			await crane1.GoTo("pickupDisk");
			await crane1.PickupItem();
			if (aSlot == "")
			{
				await crane1.GoTo("outRed");
				await crane1.DropItem();
			}
			if (aSlot == "")
			{
				await crane1.GoTo("outGreen");
				await crane1.DropItem();
			}
			if (aSlot == "")
			{
				await crane1.GoTo("outBlue");
				await crane1.DropItem();
			}
			disk1.MarkSlot("xtext.factoryLang.factoryLang.impl.DiskZoneSImpl@164b54a5 (name: craneZone, slot: 4)", );
		}
		if (!disk1.IsFull())
		{
			await disk1.MoveSlot(disk1.GetEmptySlotNumber(), "intakeZone");
			await disk1.WaitForIntake();
			disk1.MarkSlot("xtext.factoryLang.factoryLang.impl.DiskZoneSImpl@25b33cd4 (name: intakeZone, slot: 6)", );
			await disk1.MoveSlot(aSlot.Number, "cameraZone");
			var aColor = await camera1.Scan();
			if (aColor.)
			{
				Task.Run(async () =>
				{
					await Task.Delay(10000);
					disk1.MarkSlot("xtext.factoryLang.factoryLang.impl.DiskZoneSImpl@31d24777 (name: cameraZone, slot: 3)", );
				});
			}
			if (aColor.)
			{
				Task.Run(async () =>
				{
					await Task.Delay(20000);
					disk1.MarkSlot("xtext.factoryLang.factoryLang.impl.DiskZoneSImpl@31d24777 (name: cameraZone, slot: 3)", );
				});
			}
			if (aColor.)
			{
				Task.Run(async () =>
				{
					await Task.Delay(30000);
					disk1.MarkSlot("xtext.factoryLang.factoryLang.impl.DiskZoneSImpl@31d24777 (name: cameraZone, slot: 3)", );
				});
			}
		}
	}
}
