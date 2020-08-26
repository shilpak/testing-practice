package com.shilpak.testingpractice.stringtools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

	@Test 
	public void aSingleWordWhichIsAPalindromeReturnsTrue() {
		assertTrue(Palindrome.isPalindrome("bob")); 
	}

	@Test 
	public void aSingleWordWithCapitalWhichIsAPalindromeReturnsTrue() {
		assertTrue(Palindrome.isPalindrome("Bob")); 
	}

	@Test 
	public void charactersWhichIsAPalindromeReturnsTrue() {
		assertTrue(Palindrome.isPalindrome("#*#*#")); 
	}

	@Test 
	public void aSingleWordWhichIsNotAPalindromeReturnsFalse() {
		assertFalse(Palindrome.isPalindrome("roof")); 
	}

	@Test 
	public void aSingleSentenceWhichIsAPalindromeReturnsTrue() {
		assertTrue(Palindrome.isPalindrome("Do geese see God?")); 
	}

	@Test 
	public void aSingleSentenceWithSpacesWhichIsAPalindromeReturnsTrue() {
		assertTrue(Palindrome.isPalindrome("Do  geese see   God?")); 
	}

	@Test 
	public void aSingleSentenceWhichIsNotAPalindromeReturnsFalse() {
		assertFalse(Palindrome.isPalindrome("You lucky duck!")); 
	}

	@Test 
	public void emptyStringWhichIsNotAPalindromeReturnsFalse() {
		assertFalse(Palindrome.isPalindrome("")); 
	}

	@Test 
	public void nullValueWhichIsNotAPalindromeReturnsFalse() {
		assertFalse(Palindrome.isPalindrome(null)); 
	}

	@Test 
	public void numberWhichIsPalindromeReturnsTrue() {
		assertTrue(Palindrome.isPalindrome("1221")); 
	}

	@Test 
	public void negativeNumberWhichIsNotAPalindromeReturnsFalse() {
		assertFalse(Palindrome.isPalindrome("-121")); 
	}

	@Test 
	public void numberEndingWithZerosIsNotAPalindromeReturnsFalse() {
		assertFalse(Palindrome.isPalindrome("200")); 
	}

	@Test 
	public void zeroIsNotAPalindromeReturnsFalse() {
		assertFalse(Palindrome.isPalindrome("0")); 
	}

	@Test 
	public void numberWhichIsNotAPalindromeReturnsFalse() {
		assertFalse(Palindrome.isPalindrome("12111")); 
	}

	@Test 
	public void floatNumberWhichIsPalindromeReturnsTrue() {
		assertTrue(Palindrome.isPalindrome("432.234")); 
	}

	@Test 
	public void floatNumberWhichIsNotPalindromeReturnsFalse() {
		assertFalse(Palindrome.isPalindrome("432.23")); 
	}

}