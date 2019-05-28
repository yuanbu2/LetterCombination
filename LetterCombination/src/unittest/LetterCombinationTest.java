package com.unittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import com.testcode.LetterCombination;

public class LetterCombinationTest {

	@Test
	public void testCombinationByString_single_empty() {
		LetterCombination lc = new LetterCombination();
		String[] testStr = {"", "abc"};
		StringBuffer sb = lc.conbinationByString(testStr[0], testStr[1]);
		assertEquals(sb.toString(), "abc");
	}

	@Test
	public void testCombinationByString_double_empty() {
		LetterCombination lc = new LetterCombination();
		String[] testStr = {"", ""};
		StringBuffer sb = lc.conbinationByString(testStr[0], testStr[1]);
		assertEquals(sb.toString(), "");
	}

	@Test
	public void testCombinationByString_double_full() {
		LetterCombination lc = new LetterCombination();
		String[] testStr = {"abc", "def"};
		StringBuffer sb = lc.conbinationByString(testStr[0], testStr[1]);
		assertEquals(sb.toString(), " ad ae af bd be bf cd ce cf");
	}

	@Test
	public void testDoMultiConbine_single_empty() {
		LetterCombination lc = new LetterCombination();
		String[] testStr = {"1", "2"};
		String str = lc.doMultiConbine(testStr);
		assertEquals(str, "abc");
	}
	
	@Test
	public void testDoMultiConbine_double_empty() {
		LetterCombination lc = new LetterCombination();
		String[] testStr = {"0", "1"};
		String str = lc.doMultiConbine(testStr);
		assertEquals(str, "");
	}
	
	@Test
	public void testDoMultiConbine_double_full() {
		LetterCombination lc = new LetterCombination();
		String[] testStr = {"2", "3"};
		String str = lc.doMultiConbine(testStr);
		assertEquals(str, " ad ae af bd be bf cd ce cf");
	}
	
	@Test
	public void testDoSingleCombine_full() {
		LetterCombination lc = new LetterCombination();
		String testStr = "2";
		String str = lc.doSingleConbine(testStr);
		assertEquals(str, "abc");
	}
	
	@Test
	public void testDoSingleCombine_empty() {
		LetterCombination lc = new LetterCombination();
		String testStr = "1";
		String str = lc.doSingleConbine(testStr);
		assertEquals(str, "");
	}
}
