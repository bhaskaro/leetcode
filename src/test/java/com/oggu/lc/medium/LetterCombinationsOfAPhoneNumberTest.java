package com.oggu.lc.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfAPhoneNumberTest {

    @Test
    public void testMain() {

        LetterCombinationsOfAPhoneNumber.main(null);
    }

    @Test
    public void testLetterCombinations() {

        String digits = "23";
        List<String> out = LetterCombinationsOfAPhoneNumber.letterCombinations(digits);
        Assert.assertEquals(out, Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    }


}