package org.stjs.bridge.cldr;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.annotation.Template;

@SyntheticType
public class CldrAttributes {
	public String bundle;
	public String minLanguageId;
	public String maxLanguageId;
	public String language;
	public String script;
	public String territory;
	public String region;

	@Template("prefix(u-)")
	public String nu;

	@Template("prefix(u-)")
	public String cu;
}
