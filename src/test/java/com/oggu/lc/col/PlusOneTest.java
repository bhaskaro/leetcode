package com.oggu.lc.col;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlusOneTest {

    int[] digits = {9, 9, 9, 9};
    int[] result = {1, 0, 0, 0, 0};

    @Test
    public void testPlusOne() {

        int[] out = PlusOne.plusOne(digits);
        Assert.assertEquals(out, result);
    }
}