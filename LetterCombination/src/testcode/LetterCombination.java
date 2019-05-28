package com.testcode;

public class LetterCombination extends Combination{

	@Override
	public String doMultiConbine(String[] input) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < input.length; i++){
        	for(int j = i+1; j < input.length; j++){
        		sb.append(conbinationByString(
        				numberLetter[Integer.parseInt(input[i])], 
        				numberLetter[Integer.parseInt(input[j])]));
        	}
        }
		
		return sb.toString();
	}
	
	@Override
	public String doSingleConbine(String input) {
		return numberLetter[Integer.parseInt(input)];
	}

}
