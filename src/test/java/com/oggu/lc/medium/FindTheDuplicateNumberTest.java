package com.oggu.lc.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindTheDuplicateNumberTest {

    int[] nums = new int[]{1, 3, 4, 2, 2};
    int target = 2;

    @Test
    public void findDuplicate() {

        int out = FindTheDuplicateNumber.findDuplicate(nums);
        Assert.assertEquals(target, out);
    }
}