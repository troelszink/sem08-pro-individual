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
import xtext.factoryLang.shortDSL.shortDSL.DeviceValueS;
import xtext.factoryLang.shortDSL.shortDSL.Disk;
import xtext.factoryLang.shortDSL.shortDSL.DiskHandlingS;
import xtext.factoryLang.shortDSL.shortDSL.LoopVariable;
import xtext.factoryLang.shortDSL.shortDSL.MarkCameraValue;
import xtext.factoryLang.shortDSL.shortDSL.Model;
import xtext.factoryLang.shortDSL.shortDSL.MoveCrane;
import xtext.factoryLang.shortDSL.shortDSL.MoveS;
import xtext.factoryLang.shortDSL.shortDSL.ShortDSLPackage;
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
    boolean _matched = false;
    if (Objects.equal(reference, ShortDSLPackage.Literals.MOVE_DISK__ZONE)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(reference, ShortDSLPackage.Literals.MOVE_ANY_SLOT__ZONE)) {
        _matched=true;
      }
    }
    if (_matched) {
      return this.getDiskTargetScope(((MoveS) context));
    }
    if (!_matched) {
      if (Objects.equal(reference, ShortDSLPackage.Literals.MOVE_CRANE__ZONE)) {
        _matched=true;
        return this.getCraneTargetScope(((MoveS) context));
      }
    }
    if (!_matched) {
      if (Objects.equal(reference, ShortDSLPackage.Literals.DEVICE_VALUE_S__CONFIGURATION_VALUE)) {
        _matched=true;
        return this.getDeviceValueRefScope(((DeviceValueS) context));
      }
    }
    if (!_matched) {
      if (Objects.equal(reference, ShortDSLPackage.Literals.CONDITION_VARIABLE__VARIABLE)) {
        _matched=true;
        return this.getVariableScope(context, context);
      }
    }
    return super.getScope(context, reference);
  }
  
  public IScope getVariableScope(final EObject currentContext, final EObject context) {
    final EObject parent = currentContext.eContainer();
    final LoopVariable nextForEach = EcoreUtil2.<LoopVariable>getContainerOfType(parent, LoopVariable.class);
    if ((nextForEach != null)) {
      VariableS _ordinaryVariable = nextForEach.getOrdinaryVariable();
      return Scopes.scopeFor(Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(_ordinaryVariable)), this.getVariableScope(nextForEach, context));
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
  
  public IScope getDeviceValueRefScope(final DeviceValueS deviceValue) {
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
