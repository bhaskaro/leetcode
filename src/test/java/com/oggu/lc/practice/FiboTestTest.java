package com.oggu.lc.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FiboTestTest {

    @Test
    public void testMain() {
        FiboTest.main(null);
    }

    @Test
    public void testGetFibRecur() {

        int n = 5;
        int out = FiboTest.getFibRecur(n);
        Assert.assertEquals(out, 8);
    }

    @Test
    public void testGetFibDyno() {

        int n = 5;
        int out = FiboTest.getFibDyno(n);
        Assert.assertEquals(out, 8);
    }
}