package com.sparta.rb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest 
{

    @Test
    public void checkBobReturnsTrue()
    {
        Assertions.assertEquals(true, App.isPalindrome("bob"));
    }

    @Test
    public void checkBobIsInAKayakReturnsKayak()
    {
        String[] sentence = {"bob", "is", "in", "a", "kayak"};
        Assertions.assertEquals("kayak", App.getLongestPalindromeInSentence(sentence));
    }

    @Test
    public void checkThisIsASentenceReturnsThereAreNoPalindromesInThisSentence()
    {
        String[] sentence = {"this", "is", "a", "sentence"};
        Assertions.assertEquals("There are no palindromes in this sentence.", App.getLongestPalindromeInSentence(sentence));
    }
}
