package com.sparta.rb;

import java.util.ArrayList;
import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        String bob = "bob";
        System.out.println(isPalindrome(bob));
        String[] sentence = {"this", "is", "a", "sentence"};
        String[] sentence2 = {"bob", "is", "on", "a", "kayak"};
        System.out.println(getLongestPalindromeInSentence(sentence));
        System.out.println(getLongestPalindromeInSentence(sentence2));

    }
    
    static boolean isPalindrome(String word)
    {
        char[] charArray = word.toCharArray();
        char[] reverseCharArray = new char[charArray.length];

        for (int counter = charArray.length - 1; counter >= 0; counter--) {
            reverseCharArray[counter] = charArray[charArray.length -1 -counter];
        }

        return Arrays.equals(reverseCharArray, charArray);
    }

    private static boolean isPalindromeStringBuilder(String word)
    {
        StringBuilder reverseWord = new StringBuilder(word).reverse();
        return reverseWord.toString().equals(word);
    }

    static String getLongestPalindromeInSentence(String[] sentence)
    {
        ArrayList<String> allPalindromes = getAllPalindromes(sentence);
        return getLongestPalindrome(allPalindromes);
    }

    private static ArrayList<String> getAllPalindromes(String[] sentence)
    {
        ArrayList<String> arrayOfPalindromes = new ArrayList<String>();

        for (int i = 0; i <= sentence.length -1; i++) {
            if (isPalindromeStringBuilder(sentence[i]) && sentence[i].length() > 2)
            {
                arrayOfPalindromes.add(sentence[i]);
            }
        }
        return arrayOfPalindromes;
    }

    private static String getLongestPalindrome(ArrayList<String> palindromes)
    {
        String longestPalindrome = "There are no palindromes in this sentence.";

        for (String palindrome : palindromes) {
            if (palindrome.length() > longestPalindrome.length() || longestPalindrome.equals("There are no palindromes in this sentence.")) {
                longestPalindrome = palindrome;
            }
        }
        return longestPalindrome;
    }
}
