package com.oggu.lc.medium;

import org.junit.Assert;
import org.junit.Test;

public class FindPeakElementTest {

    int[] nums1 = new int[]{1, 2, 3, 1};
    int result1 = 2;

    int[] nums2 = new int[]{1, 2, 1, 3, 5, 6, 4};
    int result2 = 1;

    @Test
    public void findPeakElement1() {

        int out = FindPeakElement.findPeakElement(nums1);
        Assert.assertEquals(result1, out);
    }

    @Test
    public void findPeakElement2() {

        int out = FindPeakElement.findPeakElement(nums2);
        Assert.assertEquals(result2, out);
    }
}