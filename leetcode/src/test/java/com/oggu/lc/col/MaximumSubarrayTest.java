package com.oggu.lc.col;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarrayTest {

    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int target = 6;

    @Test
    public void maxSubArray() {

        int out = MaximumSubarray.maxSubArray(nums);
        Assert.assertEquals(out, target);
    }
}