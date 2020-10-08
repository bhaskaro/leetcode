package com.oggu.lc.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrangingCoinsTest {

    @Test
    public void testMain() {

        ArrangingCoins.main(null);
    }

    @Test
    public void testArrangeCoins() {
        int n = 5;
        int out = ArrangingCoins.arrangeCoins(n);
        Assert.assertEquals(out, 2);
    }

    @Test
    public void testArrangeCoinsRecur() {
        int n = 5;
        int out = ArrangingCoins.arrangeCoins(n);
        Assert.assertEquals(out, 2);
    }
}