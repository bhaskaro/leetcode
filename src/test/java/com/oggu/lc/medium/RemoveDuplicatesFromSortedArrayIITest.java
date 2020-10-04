package com.oggu.lc.medium;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayIITest {

    int[] nums = new int[]{1, 1, 1, 2, 2, 3};
    int newLength = 5;

    @Test
    public void removeDuplicates() {

        int out = RemoveDuplicatesFromSortedArrayII.removeDuplicates(nums);
        Assert.assertEquals(out, newLength);
    }
}