package com.oggu.lc.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void testMain() {
        ProductOfArrayExceptSelf.main(null);
    }

    @Test
    public void testProductExceptSelf() {

        int[] nums = new int[]{1, 2, 3, 4};
        int[] out = ProductOfArrayExceptSelf.productExceptSelf(nums);
        Assert.assertEquals(out, new int[]{24, 12, 8, 6});
    }
}