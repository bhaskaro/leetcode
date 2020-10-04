package com.oggu.lc.medium;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstringTest {

    String s = "abccbadbabad";
    String result = "abccba";

    @Test
    public void longestPalindrome() {

        String palindrome = LongestPalindromicSubstring.longestPalindrome(this.s);
        Assert.assertEquals(palindrome, result);
    }
}