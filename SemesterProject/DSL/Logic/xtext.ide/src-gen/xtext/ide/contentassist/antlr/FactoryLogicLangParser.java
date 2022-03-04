/*
 * generated by Xtext 2.25.0
 */
package xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import xtext.ide.contentassist.antlr.internal.InternalFactoryLogicLangParser;
import xtext.services.FactoryLogicLangGrammarAccess;

public class FactoryLogicLangParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(FactoryLogicLangGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, FactoryLogicLangGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
			builder.put(grammarAccess.getBOOLEAN_OPERATORAccess().getAlternatives(), "rule__BOOLEAN_OPERATOR__Alternatives");
			builder.put(grammarAccess.getConditionalAccess().getGroup(), "rule__Conditional__Group__0");
			builder.put(grammarAccess.getLoopAccess().getGroup(), "rule__Loop__Group__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_4(), "rule__Loop__Group_4__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_8(), "rule__Loop__Group_8__0");
			builder.put(grammarAccess.getModelAccess().getDeclarationsAssignment(), "rule__Model__DeclarationsAssignment");
			builder.put(grammarAccess.getConditionalAccess().getVariableAssignment_1(), "rule__Conditional__VariableAssignment_1");
			builder.put(grammarAccess.getConditionalAccess().getOperatorAssignment_3(), "rule__Conditional__OperatorAssignment_3");
			builder.put(grammarAccess.getConditionalAccess().getComparisonAssignment_4(), "rule__Conditional__ComparisonAssignment_4");
			builder.put(grammarAccess.getLoopAccess().getLoopvarAssignment_1(), "rule__Loop__LoopvarAssignment_1");
			builder.put(grammarAccess.getLoopAccess().getVariableAssignment_3(), "rule__Loop__VariableAssignment_3");
			builder.put(grammarAccess.getLoopAccess().getSTRING1Assignment_4_1(), "rule__Loop__STRING1Assignment_4_1");
			builder.put(grammarAccess.getLoopAccess().getOperatorAssignment_6(), "rule__Loop__OperatorAssignment_6");
			builder.put(grammarAccess.getLoopAccess().getComparisonAssignment_7(), "rule__Loop__ComparisonAssignment_7");
			builder.put(grammarAccess.getLoopAccess().getSTRING2Assignment_8_1(), "rule__Loop__STRING2Assignment_8_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private FactoryLogicLangGrammarAccess grammarAccess;

	@Override
	protected InternalFactoryLogicLangParser createParser() {
		InternalFactoryLogicLangParser result = new InternalFactoryLogicLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FactoryLogicLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FactoryLogicLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}