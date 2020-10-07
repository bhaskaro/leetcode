package com.oggu.lc.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTrailingZeroesTest {

    @Test
    public void testMain() {

        FactorialTrailingZeroes.main(null);
    }

    @Test
    public void testTrailingZeroes() {

        int out = FactorialTrailingZeroes.trailingZeroes(30);
        Assert.assertEquals(out, 7);
    }
}