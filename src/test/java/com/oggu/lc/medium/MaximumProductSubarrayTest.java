package com.oggu.lc.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaximumProductSubarrayTest {

    private int[] nums1 = new int[]{2, 3, -2, 4};
    private int result1 = 6;

    private int[] nums2 = new int[]{-2, 0, -1};
    private int result2 = 0;

    private int[] nums3 = new int[]{-2};
    private int result3 = -2;

    private int[] nums4 = new int[]{0, 2};
    private int result4 = 2;


    @Test(invocationCount = 1)
    public void testMain() {

        MaximumProductSubarray.main(null);
    }

    @Test
    public void maxProduct1() {
        int result = MaximumProductSubarray.maxProduct(nums1);
        Assert.assertEquals(result1, result);
    }

    @Test
    public void maxProduct2() {
        int result = MaximumProductSubarray.maxProduct(nums2);
        Assert.assertEquals(result2, result);
    }

    @Test
    public void maxProduct3() {
        int result = MaximumProductSubarray.maxProduct(nums3);
        Assert.assertEquals(result3, result);
    }

    @Test
    public void maxProduct4() {
        int result = MaximumProductSubarray.maxProduct(nums4);
        Assert.assertEquals(result4, result);
    }
}