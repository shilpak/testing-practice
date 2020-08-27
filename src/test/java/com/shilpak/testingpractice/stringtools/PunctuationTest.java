package com.shilpak.testingpractice.stringtools;

import org.junit.jupiter.api.Test;

public class PunctuationTest {

	@Test
	public void aSingleWordwithpunctuation() {
		Palindrome.removePunctuation(":bo!{}=b;"); 
	}

	@Test
	public void aSingleSentencewithpunctuation() {
		Palindrome.removePunctuation("You:'; lucky ==duck!"); 		
	}

	@Test
	public void Integerswithpunctuation() {
		Palindrome.removePunctuation("324===13!56879"); 		
	}
}
