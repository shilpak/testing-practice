package com.shilpak.testingpractice.stringtools;

public class Palindrome {
    
    /**
    * {@link https://en.wikipedia.org/wiki/Palindrome}
    * A palindrome is a word or phrase which is identical
    * forward and backward.  For example "foof" is a palindrome, while 
    * "roof" is not.  This can also be applied to phrases, sentences or 
    * multiple words when puncutation and capitalization is ignored.
    * "Do geese see God?" is a palindrome, while "You lucky duck!" is not.
    * Palindromes can also be numbers or groups of numbers 
    * and numeric representations of dates.
    * @param s The String to test for a palindrome.
    * @return True if the given string is a palindrome, false if not.
    */
    public static boolean isPalindrome(String s) {
        boolean result = false;
        if (s != null) {
            s = s.toLowerCase();
            s = removeWhiteSpace(s);
            s = removePunctuation(s);
            if (s.length() == 1) {
                result = true;
            }
            int startPosition = 0;
            int endPosition = s.length()-1;
            while (startPosition < endPosition) {
                result = s.charAt(startPosition) == s.charAt(endPosition);
                startPosition++;
                endPosition--;
                if (!result) {
                    break;
                }
            }
        }
        return result;
    }

    public static String removeWhiteSpace(String s) {
        return s.replaceAll("\\s", "");
    }

    public static String removePunctuation(String s) {
        return s.replaceAll("[^-a-zA-Z0-9]", "");
    }

}