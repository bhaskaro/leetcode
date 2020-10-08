package com.oggu.lc.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberComplementTest {

    @Test
    public void testMain() {

        NumberComplement.main(null);
    }

    @Test
    public void testFindComplement() {

        int num = 5;
        int out = NumberComplement.findComplement(num);
        Assert.assertEquals(out, 2);
    }
}