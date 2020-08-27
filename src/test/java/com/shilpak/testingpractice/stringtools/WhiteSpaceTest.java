package com.shilpak.testingpractice.stringtools;

import org.junit.jupiter.api.Test;

public class WhiteSpaceTest {

	@Test
	public void aSingleWordWithWhiteSpace() {
		Palindrome.removeWhiteSpace("bo b"); 
	}

	@Test
	public void aSingleSentenceWithWhiteSpace() {
		Palindrome.removeWhiteSpace("Do gee  se see   God");
	}

	@Test
	public void IntegersWithWhiteSpace() {
		Palindrome.removeWhiteSpace("123  34  45678 90");
	}
}