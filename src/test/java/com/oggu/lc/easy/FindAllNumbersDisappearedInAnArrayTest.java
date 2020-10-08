package com.oggu.lc.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArrayTest {

    @Test
    public void testMain() {

        FindAllNumbersDisappearedInAnArray.main(null);
    }

    @Test
    public void testFindDisappearedNumbers() {

        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> out = FindAllNumbersDisappearedInAnArray.findDisappearedNumbers(nums);
        Assert.assertEquals(out, Arrays.asList(5, 6));
    }
}