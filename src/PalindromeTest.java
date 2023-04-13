package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void testIsPalindrome() {
        assertTrue(Palindrome.isPalindrome("racecar"));
        assertFalse(Palindrome.isPalindrome("hello"));
        assertTrue(Palindrome.isPalindrome(""));
    }
}
