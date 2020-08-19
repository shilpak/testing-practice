package com.shilpak.testingpractice.stringtools;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
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
    
    //Single word which is not a palindrome
    @Test
    public void aSingleWordWhichIsNotAPalindromeReturnsFalse() {   	
    	assertFalse(Palindrome.isPalindrome("roof"));        
    }
    
    //sentence with extra spaces which is palindrome 
    @Test
    public void aSingleSentenceWhichIsAPalindromeReturnsTrue() {
    	assertTrue(Palindrome.isPalindrome("Do geese  see God?"));        
    }
    
  //sentence with extra characters which is not a palindrome
    @Test
    public void aSingleSentenceWhichIsNotAPalindromeReturnsFalse() {
    	assertFalse(Palindrome.isPalindrome("You lucky duck!"));        
    }
    
    //test the null value is a not palindrome
    @Test
    public void emptyStringWhichIsNotAPalindromeReturnsFalse() {    	
        assertFalse(Palindrome.isPalindrome(""));
    }

    //number which is a palindrome
    @Test
    public void numberWhichIsPalindromeReturnsTrue() {    	
        assertTrue(Palindrome.isPalindrome("1221"));
    }
    
    @Test
    public void negativeNumberWhichIsNotAPalindromeReturnsFalse() {    	
        assertFalse(Palindrome.isPalindrome("-121"));
    }
    
    @Test
    public void numberWithZeroIsNotAPalindromeReturnsFalse() {    	
        assertFalse(Palindrome.isPalindrome("200"));
    }
    
    //test zero is a palindrome
    @Test
    public void zeroIsAPalindromeReturnsTrue() {    	
        assertTrue(Palindrome.isPalindrome("0"));
    }
    
    //test number which is not a palindrome
    @Test
    public void numberWhichIsNotAPalindromeReturnsFalse() {    	
        assertFalse(Palindrome.isPalindrome("12111"));
    }
    
    //test the float number
    @Test
    public void floatNumberWhichIsPalindromeReturnsTrue() {    	
        assertTrue(Palindrome.isPalindrome("432.234"));
    }
    
    //test the float number which is not palindrome
    @Test
    public void floatNumberWhichIsNotPalindromeReturnsFalse() {    	
        assertFalse(Palindrome.isPalindrome("432.23"));
    }
}