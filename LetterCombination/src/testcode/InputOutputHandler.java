package com.testcode;

public class InputOutputHandler {
	
	public static String[] inputHandler(String line) {
		String[] ret = {};
		if(line.trim().isEmpty()) {
			return ret;
		}
		ret = line.replace("{", "").replace("}", "").split(",");
		return ret;
	}
	
	public static void outputHandler(String line, String result) {
		System.out.println("Input: arr = " + line);
		System.out.println("Output: "+result.toString().trim());
	}
}
