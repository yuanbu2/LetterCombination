package com.testcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CombinationMain {
	public static final int SINGLE_NUMBER = 1;
	public static StringBuffer lc_result = new StringBuffer();
	
	public static void main(String[] args) {
		try {
			String filePath = LetterCombination.class.getResource("test_input.txt").getPath();
			File f = new File(filePath); 
			FileReader fileReader = new FileReader(f);
			BufferedReader br = new BufferedReader(fileReader);
			LetterCombination lc = new LetterCombination();
			String lineContent = null;
			while((lineContent = br.readLine()) != null){
				String[] input = InputOutputHandler.inputHandler(lineContent);
				if(input.length == SINGLE_NUMBER) {
					lc_result.append(lc.doSingleConbine(input[0]));
				}else {
					lc_result.append(lc.doMultiConbine(input));
				}
				InputOutputHandler.outputHandler(lineContent, lc_result.toString());
				lc_result.setLength(0);
            }
			
			br.close();
			fileReader.close();

		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
}
