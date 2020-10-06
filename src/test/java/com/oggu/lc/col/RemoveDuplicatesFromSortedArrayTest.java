package com.oggu.lc.col;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    @Test
    public void testRemoveDuplicates() {

        int out = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        Assert.assertEquals(out, 5);
    }
}