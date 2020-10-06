package com.oggu.lc.medium;

import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedSortedArrayTest {

    int[] nums = {4, 5, 6, 7, 8, 9, 10, 11, 0, 1, 2, 3};
    int result = 7;

    @Test
    public void search() {

        int out = SearchInRotatedSortedArray.search(nums, nums[result]);
        Assert.assertEquals(result, out);
    }
}