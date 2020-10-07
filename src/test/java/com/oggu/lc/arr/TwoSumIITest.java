package com.oggu.lc.arr;

import com.oggu.lc.easy.TwoSumII;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSumIITest {

    int[] numbers = new int[]{2, 7, 11, 15};
    int target = 9;

    @Test
    public void testTwoSum() {

        int[] twoSum = TwoSumII.twoSum(numbers, target);
        Assert.assertEquals(twoSum, new int[]{1, 2});
    }
}