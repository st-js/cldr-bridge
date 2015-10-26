package org.stjs.bridge.cldr;

import org.stjs.javascript.Array;

public class Cldr {
	/**
	 * Only available with the supplemental module
	 */
	public Supplemental supplemental;

	public CldrAttributes attributes;

	public String locale;

	public String localeSep;

	public static native void load(Object... data);

	public native Object main(Array<String> path);

	public native Object main(String path);

	public native Object get(Array<String> path);

	public native Object get(String path);

	public native void init(String locale);

}
