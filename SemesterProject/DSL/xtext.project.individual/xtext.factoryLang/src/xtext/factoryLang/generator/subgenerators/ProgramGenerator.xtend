package xtext.factoryLang.generator.subgenerators

import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import xtext.factoryLang.factoryLang.Camera
import xtext.factoryLang.factoryLang.CameraColorParameter
import xtext.factoryLang.factoryLang.Crane
import xtext.factoryLang.factoryLang.CranePositionParameter
import xtext.factoryLang.factoryLang.Device
import xtext.factoryLang.factoryLang.Disk
import xtext.factoryLang.factoryLang.DiskSlotParameter
import xtext.factoryLang.factoryLang.DiskZoneParameter
import xtext.factoryLang.factoryLang.Statement
import xtext.factoryLang.factoryLang.ForEach
import xtext.factoryLang.factoryLang.DeviceConditional
import xtext.factoryLang.parsers.ValueParser
import xtext.factoryLang.factoryLang.VariableConditional
import xtext.factoryLang.factoryLang.DiskMoveVariableSlotOperation
import xtext.factoryLang.factoryLang.CranePickupOperation
import xtext.factoryLang.factoryLang.DiskMarkSlotOperation
import xtext.factoryLang.factoryLang.CraneDropOperation
import xtext.factoryLang.factoryLang.DiskMoveEmptySlotOperation
import xtext.factoryLang.factoryLang.DiskMoveSlotOperation
import xtext.factoryLang.factoryLang.CameraScanOperation
import xtext.factoryLang.factoryLang.impl.GlobalVariableImpl
import xtext.factoryLang.parsers.EnumParser
import xtext.factoryLang.factoryLang.DiskWaitOperation
import xtext.factoryLang.factoryLang.DeviceS
import xtext.factoryLang.factoryLang.CraneS
import xtext.factoryLang.factoryLang.DiskS
import xtext.factoryLang.factoryLang.CameraS
import xtext.factoryLang.factoryLang.CraneZoneS
import xtext.factoryLang.factoryLang.DiskHandlingS
import xtext.factoryLang.factoryLang.DiskZoneS
import xtext.factoryLang.factoryLang.CameraColorS
import xtext.factoryLang.factoryLang.LoopS
import xtext.factoryLang.factoryLang.StatementS
import xtext.factoryLang.factoryLang.COMPARISON_OPERATOR_S
import xtext.factoryLang.factoryLang.ConditionS
import xtext.factoryLang.factoryLang.ConditionDeviceS
import xtext.factoryLang.factoryLang.ConditionVariableS
import xtext.factoryLang.factoryLang.ConditionSlotS
import xtext.factoryLang.factoryLang.MoveCraneS
import xtext.factoryLang.factoryLang.CRANE_ACTION_S
import xtext.factoryLang.factoryLang.MarkVariableValueS
import xtext.factoryLang.factoryLang.MoveDiskS
import xtext.factoryLang.factoryLang.MoveAnySlotS
import xtext.factoryLang.factoryLang.MarkCameraValueS
import xtext.factoryLang.factoryLang.WaitS
import xtext.factoryLang.factoryLang.LoopVariableS
import xtext.factoryLang.factoryLang.LoopSlotS

class ProgramGenerator {

	def static generateShort(IFileSystemAccess2 fsa, String rootFolder, List<DeviceS> devices, List<DiskHandlingS> diskHandlings) {
		fsa.generateFile(
			rootFolder + '/Program.cs',
			'''
				using System;
				using Entities;
				using Mqtt;
				
				�generateVariables�
				
				�generateMainLoop�
				
				�generateSetupMethodShort(devices)�
				
				�generateRunMethodShort(devices, diskHandlings)�
			'''
		)
	}
	
	def static generateLong(IFileSystemAccess2 fsa, String rootFolder, List<Device> devices, List<Statement> statements) {
		fsa.generateFile(
			rootFolder + '/Program.cs',
			'''
				using System;
				using Entities;
				using Mqtt;
				
				�generateVariables�
				
				�generateMainLoop�
				
				�generateSetupMethodLong(devices)�
				
				�generateRunMethodLong(devices, statements)�
			'''
		)
	}

	protected def static CharSequence generateVariables() '''
		#region Variables
		IMqttService mqtt = new MqttService();
		
		Dictionary<string, Crane> cranes = new();
		Dictionary<string, Disk> disks = new();
		Dictionary<string, Camera> cameras = new();
		
		bool running = true;
		#endregion
	'''
	protected def static CharSequence generateMainLoop() '''
		#region Main
		Setup();
		Run().GetAwaiter().GetResult();
		#endregion
	'''
	protected def static CharSequence generateSetupMethodShort(List<DeviceS> devices) '''
		void Setup()
		{
			�generateCranesShort(devices.filter[it instanceof CraneS].map[it as CraneS].toList)�
			�generateDisksShort(devices.filter[it instanceof DiskS].map[it as DiskS].toList)�
			�generateCamerasShort(devices.filter[it instanceof CameraS].map[it as CameraS].toList)�
		}
	'''
	protected def static CharSequence generateSetupMethodLong(List<Device> devices) '''
		void Setup()
		{
			�generateCranesLong(devices.filter[it instanceof Crane].map[it as Crane].toList)�
			�generateDisksLong(devices.filter[it instanceof Disk].map[it as Disk].toList)�
			�generateCamerasLong(devices.filter[it instanceof Camera].map[it as Camera].toList)�
		}
	'''
	protected def static CharSequence generateCranesShort(List<CraneS> cranes) '''
		�IF cranes.size > 0� 
			�FOR crane:cranes�
				cranes.Add("�crane.name�", new Crane("�crane.name�", new Dictionary<string, int>()
				{
					�FOR target:crane.targets.map[it as CraneZoneS] SEPARATOR ","�
						{"�target.name�", �target.zoneValue�}
					�ENDFOR�
				}, mqtt));
			�ENDFOR�
		�ENDIF�
	'''
	protected def static CharSequence generateCranesLong(List<Crane> cranes) '''
		�IF cranes.size > 0� 
			�FOR crane:cranes�
				cranes.Add("�crane.name�", new Crane("�crane.name�", new Dictionary<string, int>()
				{
					�FOR target:crane.targets.map[it as CranePositionParameter] SEPARATOR ","�
						{"�target.name�", �target.degree�}
					�ENDFOR�
				}, mqtt));
			�ENDFOR�
		�ENDIF�
	'''
	protected def static CharSequence generateDisksShort(List<DiskS> disks) '''
		�IF disks.size > 0�
			�FOR disk:disks�
				disks.Add("�disk.name�", new Disk("�disk.name�", �disk.NSlots�, new Dictionary<string, int>()
				{
					�FOR target:disk.targets.map[it as DiskZoneS] SEPARATOR ","�
						{"�target.name�", �target.slot�}
					�ENDFOR�
				}, mqtt));
			�ENDFOR�
		�ENDIF�
	'''
	protected def static CharSequence generateDisksLong(List<Disk> disks) '''
		�IF disks.size > 0�
			�FOR disk:disks�
				disks.Add("�disk.name�", new Disk("�disk.name�", �(disk.slotParameter as DiskSlotParameter).size�, new Dictionary<string, int>()
				{
					�FOR target:disk.targets.map[it as DiskZoneParameter] SEPARATOR ","�
						{"�target.name�", �target.slot�}
					�ENDFOR�
				}, mqtt));
			�ENDFOR�
		�ENDIF�
	'''
	protected def static CharSequence generateCamerasShort(List<CameraS> cameras) '''
		�IF cameras.size > 0�
			�FOR camera:cameras�
				cameras.Add("�camera.name�", new Camera("�camera.name�", new List<string>()
				{
					�FOR target:camera.targets.map[it as CameraColorS] SEPARATOR ","�
						"�target.color�"
					�ENDFOR�
				}, mqtt));
			�ENDFOR�
		�ENDIF�
	'''
	protected def static CharSequence generateCamerasLong(List<Camera> cameras) '''
		�IF cameras.size > 0�
			�FOR camera:cameras�
				cameras.Add("�camera.name�", new Camera("�camera.name�", new List<string>()
				{
					�FOR target:camera.targets.map[it as CameraColorParameter] SEPARATOR ","�
						"�target.color�"
					�ENDFOR�
				}, mqtt));
			�ENDFOR�
		�ENDIF�
	'''
	protected def static CharSequence generateRunMethodShort(List<DeviceS> devices, List<DiskHandlingS> diskHandlings) {
		'''
			async Task Run()	
			{
				�FOR crane : devices.filter[it instanceof CraneS].map[it as CraneS].toList�
					var �crane.name� = cranes["�crane.name�"];
				�ENDFOR�
				�FOR disk : devices.filter[it instanceof DiskS].map[it as DiskS].toList�
					var �disk.name� = disks["�disk.name�"];
				�ENDFOR�
				�FOR camera : devices.filter[it instanceof CameraS].map[it as CameraS].toList�
					var �camera.name� = cameras["�camera.name�"];
				�ENDFOR�
			
				while (running)
				{
					�FOR diskHandling : diskHandlings�
						�generateDiskHandling(diskHandling)�
					�ENDFOR�
				}
			}
		'''
	}
	protected def static CharSequence generateDiskHandling(DiskHandlingS diskHandling) {
		'''
			�FOR statement : diskHandling.statements�
				�generateStatementShort(diskHandling, statement)�
			�ENDFOR�
		'''
	}
	protected def static CharSequence generateRunMethodLong(List<Device> devices, List<Statement> statements) {
		'''
			async Task Run()	
			{
				�FOR crane : devices.filter[it instanceof Crane].map[it as Crane].toList�
					var �crane.name� = cranes["�crane.name�"];
				�ENDFOR�
				�FOR disk : devices.filter[it instanceof Disk].map[it as Disk].toList�
					var �disk.name� = disks["�disk.name�"];
				�ENDFOR�
				�FOR camera : devices.filter[it instanceof Camera].map[it as Camera].toList�
					var �camera.name� = cameras["�camera.name�"];
				�ENDFOR�
			
				while (running)
				{
					�FOR statement : statements�
						�generateStatementLong(statement)�
					�ENDFOR�
				}
			}
		'''
	}
	protected def static CharSequence generateStatementShort(DiskHandlingS diskHandling, StatementS statement) {
		switch statement {
			LoopVariableS: {
				val optionalNotOperator = '''�IF statement.comparisonOperator == COMPARISON_OPERATOR_S.NOT�!�ENDIF�'''
				val methodCalledOnBoundVariable = optionalNotOperator +
					ValueParser.parseVariableValueShort(statement.variableValue, statement.getClass())
				val filteredDisk = '''�diskHandling.disk.name�.�methodCalledOnBoundVariable�'''
				'''
					foreach (var �statement.ordinaryVariable.name� in �filteredDisk�)
					{
						�FOR nestedStatement : statement.statements�
							�generateStatementShort(diskHandling, nestedStatement)�
						�ENDFOR�
					}
				'''
			}
			LoopSlotS: {
				val optionalNotOperator = '''�IF statement.comparisonOperator == COMPARISON_OPERATOR_S.NOT�!�ENDIF�'''
				val methodCalledOnBoundVariable = optionalNotOperator +
					ValueParser.parseDiskSlotValueShort(statement.slotValue, statement.getClass())
				val filteredDisk = '''�diskHandling.disk.name�.�methodCalledOnBoundVariable�'''
				'''
					foreach (var �statement.slotVariable.name� in �filteredDisk�)
					{
						�FOR nestedStatement : statement.statements�
							�generateStatementShort(diskHandling, nestedStatement)�
						�ENDFOR�
					}
				'''
			}
			ConditionDeviceS: {
				val optionalNotOperator = '''�IF statement.comparisonOperator == COMPARISON_OPERATOR_S.NOT�!�ENDIF�'''
				val deviceName = statement.device.name
				val methodCalledOnBoundVariable = ValueParser.parseDeviceValueShort(statement.deviceValue,
					statement.getClass())
				'''
					if (�optionalNotOperator��deviceName�.�methodCalledOnBoundVariable�)
					{
						�FOR nestedStatement : statement.statements�
							�generateStatementShort(diskHandling, nestedStatement)�
						�ENDFOR�
					}
				'''
			}
			ConditionVariableS: {
				val variableName = statement.ordinaryVariable.name
				val variableType = statement.ordinaryVariable.getClass()
				val dotOrComparisonOperator = variableType == GlobalVariableImpl ? " " +
						EnumParser.parseComparisonOperatorShort(statement.comparisonOperator) + " " : "."
				val conditionalQuotationMark = variableType == GlobalVariableImpl ? '"' : ''
				val variableValue = ValueParser.parseVariableValueShort(statement.variableValue, variableType)
				'''
					if (�variableName��dotOrComparisonOperator��conditionalQuotationMark��variableValue��conditionalQuotationMark�)
					{
						�FOR nestedStatement : statement.statements�
							�generateStatementShort(diskHandling, nestedStatement)�
						�ENDFOR�
					}
				'''
			}
			ConditionSlotS: {
				val variableName = statement.slotVariable.name
				val variableType = statement.slotVariable.getClass()
				val dotOrComparisonOperator = variableType == GlobalVariableImpl ? " " +
						EnumParser.parseComparisonOperatorShort(statement.comparisonOperator) + " " : "."
				val conditionalQuotationMark = variableType == GlobalVariableImpl ? '"' : ''
				val variableValue = ValueParser.parseDiskSlotValueShort(statement.slotValue, variableType)
				'''
					if (�variableName��dotOrComparisonOperator��conditionalQuotationMark��variableValue��conditionalQuotationMark�)
					{
						�FOR nestedStatement : statement.statements�
							�generateStatementShort(diskHandling, nestedStatement)�
						�ENDFOR�
					}
				'''
			}
			MoveCraneS: {
				val craneName = statement.crane.name
				val targetName = (statement.craneZone as CraneZoneS).name
				val actionValue = statement.craneAction.value
				
				if (actionValue == CRANE_ACTION_S.PICKUP) {
					'''
						await �craneName�.GoTo("�targetName�");
						await �craneName�.PickupItem();
					'''		
				}
				else {
					'''
						await �craneName�.GoTo("�targetName�");
						await �craneName�.DropItem();
					'''
				}
			}
			MarkVariableValueS: {
				val diskName = diskHandling.disk.name
				val diskZone = (statement as MoveDiskS).diskZone
				//val targetName = statement.target.name
				val diskSlotValue = ValueParser.parseDiskSlotValueShort(statement.slotValue, statement.getClass())
				val time = statement.time
				
				'''
					�IF time > 0�
						Task.Run(async () =>
						{
							await Task.Delay(�time * 1000�);
							�diskName�.MarkSlot("�diskZone�", �diskSlotValue�);
						});
					�ELSE�
						�diskName�.MarkSlot("�diskZone�", �diskSlotValue�);
					�ENDIF�	
				'''
			}
			MoveDiskS: {
				val diskName = diskHandling.disk.name
				val slotName = statement.slot.name
				val zoneName = statement.diskZone.name
				'''
					await �diskName�.MoveSlot(�slotName�.Number, "�zoneName�");
				'''
			}
			MoveAnySlotS: {
				val diskName = diskHandling.disk.name
				val zoneName = statement.diskZone.name
				// maybe add for full slot?
				'''
					await �diskName�.MoveSlot(�diskName�.GetEmptySlotNumber(), "�zoneName�");
				'''
			}
			// maybe add to MoveDiskS
			/*DiskMoveSlotOperation: {
				val deviceName = statement.device.name
				val sourceName = statement.source.name
				val targetName = statement.target.name
				'''
					await �deviceName�.MoveSlot("�sourceName�", "�targetName�");
				'''
			}*/
			WaitS: {
				val diskName = diskHandling.disk.name
				'''
					await �diskName�.WaitForIntake();
				'''
			}
			MarkCameraValueS: {
				val cameraName = statement.camera.name
				val variableName = statement.ordinaryVariable.name
				'''
					var �variableName� = await �cameraName�.Scan();
				'''
			}
		}
	}
	
	protected def static CharSequence generateStatementLong(Statement statement) {
		// remember scope for local variables
		switch statement {
			ForEach: {
				val optionalNotOperator = '''�IF !statement.operator.isNullOrEmpty�!�ENDIF�'''
				val methodCalledOnBoundVariable = optionalNotOperator +
					ValueParser.parseVariableValueLong(statement.variableValue, statement.getClass())
				val filteredDevice = '''�statement.device.name�.�methodCalledOnBoundVariable�'''
				'''
					foreach (var �statement.variable.name� in �filteredDevice�)
					{
						�FOR nestedStatement : statement.statements�
							�generateStatementLong(nestedStatement)�
						�ENDFOR�
					}
				'''
			}
			DeviceConditional: {
				val optionalNotOperator = '''�IF !statement.not_operator.isNullOrEmpty�!�ENDIF�'''
				val deviceName = statement.device.name
				val methodCalledOnBoundVariable = ValueParser.parseDeviceValueLong(statement.deviceValue,
					statement.getClass())
				'''
					if (�optionalNotOperator��deviceName�.�methodCalledOnBoundVariable�)
					{
						�FOR nestedStatement : statement.statements�
							�generateStatementLong(nestedStatement)�
						�ENDFOR�
					}
				'''
			}
			VariableConditional: {
				val variableName = statement.variable.name
				val variableType = statement.variable.getClass()
				val dotOrComparisonOperator = variableType == GlobalVariableImpl ? " " +
						EnumParser.parseComparisonOperatorLong(statement.comparison_operator) + " " : "."
				val conditionalQuotationMark = variableType == GlobalVariableImpl ? '"' : ''
				val variableValue = ValueParser.parseVariableValueLong(statement.variableValue, variableType)
				'''
					if (�variableName��dotOrComparisonOperator��conditionalQuotationMark��variableValue��conditionalQuotationMark�)
					{
						�FOR nestedStatement : statement.statements�
							�generateStatementLong(nestedStatement)�
						�ENDFOR�
					}
				'''
			}
			CranePickupOperation: {
				val deviceName = statement.device.name
				val targetName = (statement.target as CranePositionParameter).name
				'''
					await �deviceName�.GoTo("�targetName�");
					await �deviceName�.PickupItem();
				'''
			}
			CraneDropOperation: {
				val deviceName = statement.device.name
				val targetName = (statement.target as CranePositionParameter).name
				'''
					await �deviceName�.GoTo("�targetName�");
					await �deviceName�.DropItem();
				'''
			}
			DiskMarkSlotOperation: {
				val deviceName = statement.device.name
				val targetName = statement.target.name
				val diskSlotValue = ValueParser.parseDiskSlotValueLong(statement.diskSlotValue, statement.getClass())
				val quantity = statement.quantity
				
				'''
					�IF quantity > 0�
						Task.Run(async () =>
						{
							await Task.Delay(�quantity * 1000�);
							�deviceName�.MarkSlot("�targetName�", �diskSlotValue�);
						});
					�ELSE�
						�deviceName�.MarkSlot("�targetName�", �diskSlotValue�);
					�ENDIF�	
				'''
			}
			DiskMoveVariableSlotOperation: {
				val deviceName = statement.device.name
				val variableName = statement.variable.name
				val targetName = statement.target.name
				'''
					await �deviceName�.MoveSlot(�variableName�.Number, "�targetName�");
				'''
			}
			DiskMoveEmptySlotOperation: {
				val deviceName = statement.device.name
				val targetName = statement.target.name
				'''
					await �deviceName�.MoveSlot(�deviceName�.GetEmptySlotNumber(), "�targetName�");
				'''
			}
			DiskMoveSlotOperation: {
				val deviceName = statement.device.name
				val sourceName = statement.source.name
				val targetName = statement.target.name
				'''
					await �deviceName�.MoveSlot("�sourceName�", "�targetName�");
				'''
			}
			DiskWaitOperation: {
				val deviceName = statement.device.name
				'''
					await �deviceName�.WaitForIntake();
				'''
			}
			CameraScanOperation: {
				val deviceName = statement.device.name
				val variableName = statement.variable.name
				'''
					var �variableName� = await �deviceName�.Scan();
				'''
			}
		}
	}
}