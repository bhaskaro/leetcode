package com.oggu.lc.col;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

    int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
    int target = 2;

    @Test
    public void majorityElement() {

        int out = MajorityElement.majorityElement(nums);
        Assert.assertEquals(out, target);
    }

    @Test
    public void majorityElementSort() {

        int out = MajorityElement.majorityElementSort(nums);
        Assert.assertEquals(out, target);
    }
}