package com.oggu.lc.medium;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    String str = "abcabcbb";
    int result = 3;

    @Test
    public void lengthOfLongestSubstring() {

        int out = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(str);
        Assert.assertEquals(out, result);
    }
}