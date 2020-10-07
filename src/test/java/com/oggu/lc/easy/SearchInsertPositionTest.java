package com.oggu.lc.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.stream.IntStream;

public class SearchInsertPositionTest {

    int[] nums = IntStream.rangeClosed(0, 1000).toArray();
    Random random = new Random();

    @BeforeMethod
    public void setUp() {
        SearchInsertPosition.main(null);
    }

    @Test(invocationCount = 5)
    public void testSearchInsert() {

        int searchItm = random.nextInt(nums.length);
        int insertIdx = SearchInsertPosition.searchInsert(nums, searchItm);

        Assert.assertEquals(insertIdx, searchItm);
    }

}