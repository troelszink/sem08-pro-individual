/*
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.shortDSL.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ShortDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("xtext/factoryLang/shortDSL/parser/antlr/internal/InternalShortDSLParser.tokens");
	}
}