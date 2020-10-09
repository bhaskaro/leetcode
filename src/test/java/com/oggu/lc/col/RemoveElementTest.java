package com.oggu.lc.col;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveElementTest {

    int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
    int val = 2;

    @Test
    public void testMain() {

        RemoveElement.main(null);
    }

    @Test
    public void testRemoveElement() {

        int newIdx = RemoveElement.removeElement(nums, val);
        Assert.assertEquals(5, newIdx);
    }
}