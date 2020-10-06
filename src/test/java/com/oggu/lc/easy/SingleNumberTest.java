package com.oggu.lc.easy;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SingleNumberTest {

    int[] nums = new int[]{4, 1, 2, 1, 2};
    int target = 4;

    @Test
    public void singleNumber() {

        int out = SingleNumber.singleNumber(nums);
        Assert.assertEquals(target, out);
    }

    @Test
    public void singleNumberWithSort() {

        int out = SingleNumber.singleNumberWithSort(nums);
        Assert.assertEquals(target, out);
    }

    @Test
    public void singleNumberWithSets() {

        int out = SingleNumber.singleNumberWithSets(nums);
        Assert.assertEquals(target, out);
    }

}