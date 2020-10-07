package com.oggu.lc.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleNumberIIITest {

    int[] nums = null;

    @Test
    public void testSingleNumber1() {

        nums = new int[]{1, 2, 1, 3, 2, 5};
        int[] out = SingleNumberIII.singleNumber(nums);
        Assert.assertEquals(out, new int[]{3, 5});
    }

    @Test
    public void testSingleNumber2() {

        nums = new int[]{-1, 0};
        int[] out = SingleNumberIII.singleNumber(nums);
        Assert.assertEquals(out, new int[]{-1, 0});
    }

    @Test
    public void testSingleNumber3() {

        nums = new int[]{0, 1};
        int[] out = SingleNumberIII.singleNumber(nums);
        Assert.assertEquals(out, new int[]{0, 1});
    }

    @Test
    public void testSingleNumber4() {

        nums = new int[]{0, 1, 1, 2};
        int[] out = SingleNumberIII.singleNumber(nums);
        Assert.assertEquals(out, new int[]{0, 2});
    }
}