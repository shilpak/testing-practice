package com.shilpak.testingpractice.stringtools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    public void aSingleWordWhichIsAPalindromeReturnsTrue() {
        assertTrue(Palindrome.isPalindrome("bob"));
    }

}