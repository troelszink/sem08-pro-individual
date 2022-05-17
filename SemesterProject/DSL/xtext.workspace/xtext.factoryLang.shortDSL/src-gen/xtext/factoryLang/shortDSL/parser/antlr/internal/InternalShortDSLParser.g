/*
 * generated by Xtext 2.25.0
 */
parser grammar InternalShortDSLParser;

options {
	tokenVocab=InternalShortDSLLexer;
	superClass=AbstractInternalAntlrParser;
}

@header {
package xtext.factoryLang.shortDSL.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.factoryLang.shortDSL.services.ShortDSLGrammarAccess;

}

@members {

 	private ShortDSLGrammarAccess grammarAccess;

    public InternalShortDSLParser(TokenStream input, ShortDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected ShortDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Use
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getUseKeyword_0());
		}
		otherlv_1=Dsl
		{
			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getDslKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getTypeDSL_ShortParserRuleCall_2_0());
				}
				lv_type_2_0=ruleDSL_Short
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"xtext.factoryLang.shortDSL.ShortDSL.DSL_Short");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDSL_Short
entryRuleDSL_Short returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDSL_ShortRule()); }
	iv_ruleDSL_Short=ruleDSL_Short
	{ $current=$iv_ruleDSL_Short.current; }
	EOF;

// Rule DSL_Short
ruleDSL_Short returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDSL_ShortAccess().getDSLShortAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDSL_ShortAccess().getConfigurationConfiguration_ShortParserRuleCall_1_0());
				}
				lv_configuration_1_0=ruleConfiguration_Short
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDSL_ShortRule());
					}
					set(
						$current,
						"configuration",
						lv_configuration_1_0,
						"xtext.factoryLang.shortDSL.ShortDSL.Configuration_Short");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDSL_ShortAccess().getDeviceHandlingsDeviceHandling_ShortParserRuleCall_2_0());
				}
				lv_deviceHandlings_2_0=ruleDeviceHandling_Short
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDSL_ShortRule());
					}
					add(
						$current,
						"deviceHandlings",
						lv_deviceHandlings_2_0,
						"xtext.factoryLang.shortDSL.ShortDSL.DeviceHandling_Short");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleConfiguration_Short
entryRuleConfiguration_Short returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfiguration_ShortRule()); }
	iv_ruleConfiguration_Short=ruleConfiguration_Short
	{ $current=$iv_ruleConfiguration_Short.current; }
	EOF;

// Rule Configuration_Short
ruleConfiguration_Short returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Devices
		{
			newLeafNode(otherlv_0, grammarAccess.getConfiguration_ShortAccess().getDevicesKeyword_0());
		}
		otherlv_1=LeftCurlyBracket
		{
			newLeafNode(otherlv_1, grammarAccess.getConfiguration_ShortAccess().getLeftCurlyBracketKeyword_1());
		}
		this_BEGIN_2=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_2, grammarAccess.getConfiguration_ShortAccess().getBEGINTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfiguration_ShortAccess().getDevicesDevice_ShortParserRuleCall_3_0());
				}
				lv_devices_3_0=ruleDevice_Short
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfiguration_ShortRule());
					}
					add(
						$current,
						"devices",
						lv_devices_3_0,
						"xtext.factoryLang.shortDSL.ShortDSL.Device_Short");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_END_4=RULE_END
		{
			newLeafNode(this_END_4, grammarAccess.getConfiguration_ShortAccess().getENDTerminalRuleCall_4());
		}
		otherlv_5=RightCurlyBracket
		{
			newLeafNode(otherlv_5, grammarAccess.getConfiguration_ShortAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleDevice_Short
entryRuleDevice_Short returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDevice_ShortRule()); }
	iv_ruleDevice_Short=ruleDevice_Short
	{ $current=$iv_ruleDevice_Short.current; }
	EOF;

// Rule Device_Short
ruleDevice_Short returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDevice_ShortAccess().getCrane_ShortParserRuleCall_0());
		}
		this_Crane_Short_0=ruleCrane_Short
		{
			$current = $this_Crane_Short_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDevice_ShortAccess().getDisk_ShortParserRuleCall_1());
		}
		this_Disk_Short_1=ruleDisk_Short
		{
			$current = $this_Disk_Short_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDevice_ShortAccess().getCamera_ShortParserRuleCall_2());
		}
		this_Camera_Short_2=ruleCamera_Short
		{
			$current = $this_Camera_Short_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCrane_Short
entryRuleCrane_Short returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCrane_ShortRule()); }
	iv_ruleCrane_Short=ruleCrane_Short
	{ $current=$iv_ruleCrane_Short.current; }
	EOF;

// Rule Crane_Short
ruleCrane_Short returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getCrane_ShortAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCrane_ShortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getCrane_ShortAccess().getColonKeyword_1());
		}
		this_BEGIN_2=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_2, grammarAccess.getCrane_ShortAccess().getBEGINTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCrane_ShortAccess().getPositionsCranePosition_ShortParserRuleCall_3_0());
				}
				lv_positions_3_0=ruleCranePosition_Short
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCrane_ShortRule());
					}
					add(
						$current,
						"positions",
						lv_positions_3_0,
						"xtext.factoryLang.shortDSL.ShortDSL.CranePosition_Short");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_END_4=RULE_END
		{
			newLeafNode(this_END_4, grammarAccess.getCrane_ShortAccess().getENDTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleCranePosition_Short
entryRuleCranePosition_Short returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCranePosition_ShortRule()); }
	iv_ruleCranePosition_Short=ruleCranePosition_Short
	{ $current=$iv_ruleCranePosition_Short.current; }
	EOF;

// Rule CranePosition_Short
ruleCranePosition_Short returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getCranePosition_ShortAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCranePosition_ShortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getCranePosition_ShortAccess().getColonKeyword_1());
		}
		(
			(
				lv_position_2_0=RULE_INT
				{
					newLeafNode(lv_position_2_0, grammarAccess.getCranePosition_ShortAccess().getPositionINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCranePosition_ShortRule());
					}
					setWithLastConsumed(
						$current,
						"position",
						lv_position_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			otherlv_3=Comma
			{
				newLeafNode(otherlv_3, grammarAccess.getCranePosition_ShortAccess().getCommaKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleDisk_Short
entryRuleDisk_Short returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDisk_ShortRule()); }
	iv_ruleDisk_Short=ruleDisk_Short
	{ $current=$iv_ruleDisk_Short.current; }
	EOF;

// Rule Disk_Short
ruleDisk_Short returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getDisk_ShortAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDisk_ShortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=LeftParenthesis
		{
			newLeafNode(otherlv_1, grammarAccess.getDisk_ShortAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_nSlots_2_0=RULE_INT
				{
					newLeafNode(lv_nSlots_2_0, grammarAccess.getDisk_ShortAccess().getNSlotsINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDisk_ShortRule());
					}
					setWithLastConsumed(
						$current,
						"nSlots",
						lv_nSlots_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3=RightParenthesis
		{
			newLeafNode(otherlv_3, grammarAccess.getDisk_ShortAccess().getRightParenthesisKeyword_3());
		}
		otherlv_4=Colon
		{
			newLeafNode(otherlv_4, grammarAccess.getDisk_ShortAccess().getColonKeyword_4());
		}
		this_BEGIN_5=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_5, grammarAccess.getDisk_ShortAccess().getBEGINTerminalRuleCall_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDisk_ShortAccess().getZonesDiskZone_ShortParserRuleCall_6_0());
				}
				lv_zones_6_0=ruleDiskZone_Short
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDisk_ShortRule());
					}
					add(
						$current,
						"zones",
						lv_zones_6_0,
						"xtext.factoryLang.shortDSL.ShortDSL.DiskZone_Short");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_END_7=RULE_END
		{
			newLeafNode(this_END_7, grammarAccess.getDisk_ShortAccess().getENDTerminalRuleCall_7());
		}
	)
;

// Entry rule entryRuleDiskZone_Short
entryRuleDiskZone_Short returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDiskZone_ShortRule()); }
	iv_ruleDiskZone_Short=ruleDiskZone_Short
	{ $current=$iv_ruleDiskZone_Short.current; }
	EOF;

// Rule DiskZone_Short
ruleDiskZone_Short returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getDiskZone_ShortAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDiskZone_ShortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getDiskZone_ShortAccess().getColonKeyword_1());
		}
		(
			(
				lv_slot_2_0=RULE_INT
				{
					newLeafNode(lv_slot_2_0, grammarAccess.getDiskZone_ShortAccess().getSlotINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDiskZone_ShortRule());
					}
					setWithLastConsumed(
						$current,
						"slot",
						lv_slot_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			otherlv_3=Comma
			{
				newLeafNode(otherlv_3, grammarAccess.getDiskZone_ShortAccess().getCommaKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleCamera_Short
entryRuleCamera_Short returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCamera_ShortRule()); }
	iv_ruleCamera_Short=ruleCamera_Short
	{ $current=$iv_ruleCamera_Short.current; }
	EOF;

// Rule Camera_Short
ruleCamera_Short returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getCamera_ShortAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCamera_ShortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getCamera_ShortAccess().getColonKeyword_1());
		}
		this_BEGIN_2=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_2, grammarAccess.getCamera_ShortAccess().getBEGINTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCamera_ShortAccess().getColorsCameraColor_ShortParserRuleCall_3_0());
				}
				lv_colors_3_0=ruleCameraColor_Short
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCamera_ShortRule());
					}
					add(
						$current,
						"colors",
						lv_colors_3_0,
						"xtext.factoryLang.shortDSL.ShortDSL.CameraColor_Short");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_END_4=RULE_END
		{
			newLeafNode(this_END_4, grammarAccess.getCamera_ShortAccess().getENDTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleCameraColor_Short
entryRuleCameraColor_Short returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCameraColor_ShortRule()); }
	iv_ruleCameraColor_Short=ruleCameraColor_Short
	{ $current=$iv_ruleCameraColor_Short.current; }
	EOF;

// Rule CameraColor_Short
ruleCameraColor_Short returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getCameraColor_ShortAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCameraColor_ShortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_1=Comma
			{
				newLeafNode(otherlv_1, grammarAccess.getCameraColor_ShortAccess().getCommaKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleDeviceHandling_Short
entryRuleDeviceHandling_Short returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeviceHandling_ShortRule()); }
	iv_ruleDeviceHandling_Short=ruleDeviceHandling_Short
	{ $current=$iv_ruleDeviceHandling_Short.current; }
	EOF;

// Rule DeviceHandling_Short
ruleDeviceHandling_Short returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Test
		{
			newLeafNode(otherlv_0, grammarAccess.getDeviceHandling_ShortAccess().getTestKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDeviceHandling_ShortAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeviceHandling_ShortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;
