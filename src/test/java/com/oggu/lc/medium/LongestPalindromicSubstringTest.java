package com.oggu.lc.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongestPalindromicSubstringTest {

    String s = "abccbadbabad";
    String result = "abccba";

    @Test
    public void longestPalindrome() {

        String palindrome = LongestPalindromicSubstring.longestPalindrome(this.s);
        Assert.assertEquals(result, palindrome);
    }
}