package com.oggu.lc.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleNumberIITest {

    int[] nums = null;

    @Test
    public void testMain() {

        SingleNumberII.main(null);
    }

    @Test
    public void testSingleNumber() {

        nums = new int[]{2, 2, 3, 2};
        int out = SingleNumberII.singleNumber(nums);
        Assert.assertEquals(out, 3);
    }

    @Test
    public void testSingleNumberBitManipulation() {

        nums = new int[]{2, 2, 3, 2};
        int out = SingleNumberII.singleNumberBitManipulation(nums);
        Assert.assertEquals(out, 3);
    }
}