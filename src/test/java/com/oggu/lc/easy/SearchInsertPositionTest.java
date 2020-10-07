package com.oggu.lc.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.stream.IntStream;

public class SearchInsertPositionTest {

    int[] nums = IntStream.rangeClosed(0, 1000).toArray();
    Random random = new Random();

    @Test(invocationCount = 10)
    public void testSearchInsert() {

        int searchItm = random.nextInt(nums.length);
        int insertIdx = SearchInsertPosition.searchInsert(nums, searchItm);

        Assert.assertEquals(insertIdx, searchItm);
    }

}