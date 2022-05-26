package xtext.factoryLang.generator.subgenerators

import org.eclipse.xtext.generator.IFileSystemAccess2

class LoggingGenerator {
	
	def static generate(IFileSystemAccess2 fsa, String rootFolder) {
		fsa.generateFile(
			rootFolder + '/Logging.cs',
			'''
				using System;
				using Entities;
				using Mqtt;
				
				namespace Logging
				{
					public static class LoggingService
					{
						private readonly IMqttService _mqttService;
						
						public void LogCraneInfo(Crane crane, IMqttService mqttService)
						{
							_mqttService = mqttService;
						    await WaitTillIdle();
							await _mqttService.SendMessage(MqttTopics.Crane(_name).Moving, "Log");
							await _mqttService.SendMessage(MqttTopics.Crane(_name).Angle, "Log");
							await WaitTillIdle();
						}
						
						public void LogCraneWarnings(Crane crane, IMqttService mqttService)
						{
						    _mqttService = mqttService;
						    await WaitTillIdle();
							await _mqttService.SendMessage(MqttTopics.Crane(_name).Elevation, "Log");
							await WaitTillIdle();
						}
						
						public void LogCraneErrors(Crane crane, IMqttService mqttService)
						{
						    _mqttService = mqttService;
						    await WaitTillIdle();
							await _mqttService.SendMessage(MqttTopics.Crane(_name).Magnet, "Log");
							await WaitTillIdle();
						}
						
						public void LogCraneAll(Crane crane, IMqttService mqttService)
						{
							_mqttService = mqttService;
							LogCraneInfo(crane, mqttService);
							LogCraneWarnings(crane, mqttService);
							LogCraneErrors(crane, mqttService);
						}
						
						public void LogDiskInfo(Disk disk, IMqttService mqttService)
						{
						    _mqttService = mqttService;
						    await WaitTillIdle();
							await _mqttService.SendMessage(MqttTopics.Disk(_name).Moving, "Log");
							await _mqttService.SendMessage(MqttTopics.Disk(_name).Zone, "Log");
							await WaitTillIdle();
						}
						
						public void LogDiskWarnings(Disk disk, IMqttService mqttService)
						{
						    _mqttService = mqttService;
						    await WaitTillIdle();
							await _mqttService.SendMessage(MqttTopics.Disk(_name).Moving, "Log");
							await WaitTillIdle();
						}
						
						public void LogDiskErrors(Disk disk, IMqttService mqttService)
						{
						    _mqttService = mqttService;
						    await WaitTillIdle();
							await _mqttService.SendMessage(MqttTopics.Disk(_name).Zone, "Log");
							await WaitTillIdle();
						}
						
						public void LogDiskAll(Disk disk, IMqttService mqttService)
						{
							_mqttService = mqttService;
							LogDiskInfo(disk, mqttService);
							LogDiskWarnings(disk, mqttService);
							LogDiskErrors(disk, mqttService);
						}
						
						public void LogCameraInfo(Camera camera, IMqttService mqttService)
						{
							_mqttService = mqttService;
							await WaitTillIdle();
							await _mqttService.SendMessage(MqttTopics.Camera(_name).Color, "Log");
							await _mqttService.SendMessage(MqttTopics.Camera(_name).Scan, "Log");
							await WaitTillIdle();
						}
						
						public void LogCameraWarnings(Camera camera, IMqttService mqttService)
						{
						    _mqttService = mqttService;
						    await WaitTillIdle();
							await _mqttService.SendMessage(MqttTopics.Camera(_name).Color, "Log");
							await WaitTillIdle();
						}
						
						public void LogCameraErrors(Camera camera, IMqttService mqttService)
						{
						    _mqttService = mqttService;
						    await WaitTillIdle();
							await _mqttService.SendMessage(MqttTopics.Camera(_name).Scan, "Log");
							await WaitTillIdle();
						}
						
						public void LogCameraAll(Camera camera, IMqttService mqttService)
						{
							_mqttService = mqttService;
							LogCameraInfo(camera, mqttService);
							LogCameraWarnings(camera, mqttService);
							LogCameraErrors(camera, mqttService);
						}
					}
				}
			'''
		)
	}
}