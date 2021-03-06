package com.oggu.lc.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    String str = "abcabcbb";
    int result = 3;

    @Test
    public void lengthOfLongestSubstring() {

        int out = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(str);
        Assert.assertEquals(result, out);
    }
}