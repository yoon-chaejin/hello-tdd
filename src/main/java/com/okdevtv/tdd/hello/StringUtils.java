package com.okdevtv.tdd.hello;

import java.text.DecimalFormat;

public class StringUtils {
	
	private StringUtils() {}
	
	public static String comma(int i) {
		DecimalFormat df = new DecimalFormat("###,###");
		return df.format(i);
	}
	
}
