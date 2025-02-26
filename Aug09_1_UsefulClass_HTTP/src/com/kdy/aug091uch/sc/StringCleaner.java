package com.kdy.aug091uch.sc;

public class StringCleaner {
	public static String clean(String s) {
		s = s.replace("<b>", "");
		s = s.replace("</b>", "");
		
		s = s.replace("&lt;b&gt;", "");
		s = s.replace("&lt;/b&gt;", "");
		
		s = s.replace("&quot;", "");
		s = s.replace("&apos;", "");
		return s;
	}
}
