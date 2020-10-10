package com.oggu.lc.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongestPalindromicSubstringTest {

    String s = "abccbadbabad";
    String result = "abccba";

    @Test
    public void testMain() {

        LongestPalindromicSubstring.main(null);
    }

    @Test
    public void longestPalindrome() {

        String palindrome = LongestPalindromicSubstring.longestPalindrome(s);
        Assert.assertEquals(result, palindrome);
    }
}