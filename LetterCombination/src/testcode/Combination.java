package com.testcode;

public abstract class Combination {
	public static final String EMPTY_STRING = "";
	
	public static final String[] numberLetter = 
		{"", "", "abc", "def", "ghi", 
		 "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public StringBuffer conbinationByString(String a, String b) {
		if(a == null || b == null)
			return new StringBuffer(EMPTY_STRING);
		if(a.equals(EMPTY_STRING) || b.equals(EMPTY_STRING))
			return new StringBuffer(a+b);

		StringBuffer cl = new StringBuffer(EMPTY_STRING);
		for(int i = 0; i < a.length(); i++) {
			for(int j = 0; j < b.length(); j++) {
				cl.append(" ").append(a.charAt(i)).append(b.charAt(j));
			}
		}
		return cl;
	}
	
	public abstract String doMultiConbine(String[] input);
	
	public abstract String doSingleConbine(String input);
}
