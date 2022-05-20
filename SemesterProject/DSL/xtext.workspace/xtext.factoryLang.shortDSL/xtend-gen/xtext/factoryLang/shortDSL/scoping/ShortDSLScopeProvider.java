/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.scoping;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import xtext.factoryLang.shortDSL.shortDSL.ConditionDevice;
import xtext.factoryLang.shortDSL.shortDSL.ConfigurationValueS;
import xtext.factoryLang.shortDSL.shortDSL.Crane;
import xtext.factoryLang.shortDSL.shortDSL.DSLProgram;
import xtext.factoryLang.shortDSL.shortDSL.DSLShort;
import xtext.factoryLang.shortDSL.shortDSL.DeviceS;
import xtext.factoryLang.shortDSL.shortDSL.Disk;
import xtext.factoryLang.shortDSL.shortDSL.DiskHandlingS;
import xtext.factoryLang.shortDSL.shortDSL.Loop;
import xtext.factoryLang.shortDSL.shortDSL.MarkCameraValue;
import xtext.factoryLang.shortDSL.shortDSL.Model;
import xtext.factoryLang.shortDSL.shortDSL.MoveCrane;
import xtext.factoryLang.shortDSL.shortDSL.MoveS;
import xtext.factoryLang.shortDSL.shortDSL.VariableS;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class ShortDSLScopeProvider extends AbstractShortDSLScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nDeviceValue cannot be resolved to a type."
      + "\nThe method or field DEVICE_VALUE__CONFIGURATION_VALUE is undefined for the type Class<Literals>"
      + "\nThe method getDeviceValueRefScope(DeviceValue) from the type ShortDSLScopeProvider refers to the missing type DeviceValue");
  }
  
  public IScope getVariableScope(final EObject currentContext, final EObject context) {
    final EObject parent = currentContext.eContainer();
    final Loop nextForEach = EcoreUtil2.<Loop>getContainerOfType(parent, Loop.class);
    if ((nextForEach != null)) {
      VariableS _variable = nextForEach.getVariable();
      return Scopes.scopeFor(Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(_variable)), this.getVariableScope(nextForEach, context));
    }
    return this.getGlobalRefValueScope(context);
  }
  
  public IScope getDiskTargetScope(final MoveS move) {
    EObject _rootContainer = EcoreUtil2.getRootContainer(move);
    final Model root = ((Model) _rootContainer);
    DSLProgram _dslProgram = root.getDslProgram();
    final DSLShort dsl = ((DSLShort) _dslProgram);
    final DiskHandlingS diskHandling = EcoreUtil2.<DiskHandlingS>getContainerOfType(move, DiskHandlingS.class);
    final Disk diskRef = diskHandling.getDisk();
    final String diskName = diskRef.getName();
    final Function1<DeviceS, Boolean> _function = (DeviceS it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, diskName));
    };
    final Function1<DeviceS, Disk> _function_1 = (DeviceS it) -> {
      return diskRef;
    };
    final List<Disk> device = IterableExtensions.<Disk>toList(IterableExtensions.<DeviceS, Disk>map(IterableExtensions.<DeviceS>filter(dsl.getConfiguration().getDevices(), _function), _function_1));
    final EList<ConfigurationValueS> targets = device.get(0).getTargets();
    return Scopes.scopeFor(targets);
  }
  
  public IScope getCraneTargetScope(final MoveS move) {
    EObject _rootContainer = EcoreUtil2.getRootContainer(move);
    final Model root = ((Model) _rootContainer);
    DSLProgram _dslProgram = root.getDslProgram();
    final DSLShort dsl = ((DSLShort) _dslProgram);
    final MoveCrane moveCrane = EcoreUtil2.<MoveCrane>getContainerOfType(move, MoveCrane.class);
    final Crane craneRef = moveCrane.getCrane();
    final String craneName = craneRef.getName();
    final Function1<DeviceS, Boolean> _function = (DeviceS it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, craneName));
    };
    final Function1<DeviceS, Crane> _function_1 = (DeviceS it) -> {
      return craneRef;
    };
    final List<Crane> device = IterableExtensions.<Crane>toList(IterableExtensions.<DeviceS, Crane>map(IterableExtensions.<DeviceS>filter(dsl.getConfiguration().getDevices(), _function), _function_1));
    final EList<ConfigurationValueS> targets = device.get(0).getTargets();
    return Scopes.scopeFor(targets);
  }
  
  public IScope getGlobalRefValueScope(final EObject context) {
    EObject _rootContainer = EcoreUtil2.getRootContainer(context);
    final Model root = ((Model) _rootContainer);
    final DSLProgram dsl = root.getDslProgram();
    final Function1<MarkCameraValue, VariableS> _function = (MarkCameraValue it) -> {
      return it.getVariable();
    };
    final List<VariableS> cameraScanOperations = IterableExtensions.<VariableS>toList(ListExtensions.<MarkCameraValue, VariableS>map(EcoreUtil2.<MarkCameraValue>getAllContentsOfType(dsl, MarkCameraValue.class), _function));
    return Scopes.scopeFor(cameraScanOperations);
  }
  
  public IScope getDeviceValueRefScope(final /* DeviceValue */Object deviceValue) {
    final ConditionDevice deviceConditional = EcoreUtil2.<ConditionDevice>getContainerOfType(deviceValue, ConditionDevice.class);
    final DeviceS deviceRef = deviceConditional.getDevice();
    final String deviceName = deviceRef.getName();
    EObject _rootContainer = EcoreUtil2.getRootContainer(deviceValue);
    final Model root = ((Model) _rootContainer);
    DSLProgram _dslProgram = root.getDslProgram();
    final DSLShort dsl = ((DSLShort) _dslProgram);
    final Function1<DeviceS, Boolean> _function = (DeviceS it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, deviceName));
    };
    final Function1<DeviceS, DeviceS> _function_1 = (DeviceS it) -> {
      return deviceRef;
    };
    final DeviceS device = ((DeviceS[])Conversions.unwrapArray(IterableExtensions.<DeviceS, DeviceS>map(IterableExtensions.<DeviceS>filter(dsl.getConfiguration().getDevices(), _function), _function_1), DeviceS.class))[0];
    EList<ConfigurationValueS> targets = device.getTargets();
    return Scopes.scopeFor(targets);
  }
}
