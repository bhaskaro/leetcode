package com.oggu.lc.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveZeroesTest {

    @Test
    public void testMain() {

        MoveZeroes.main(null);
    }

    @Test
    public void testMoveZeroes() {

        int[] nums = new int[]{0, 1, 0, 3, 12};
        MoveZeroes.moveZeroes(nums);
        Assert.assertEquals(nums, new int[]{1, 3, 12, 0, 0});
    }


    @Test
    public void testMoveZeroesOld() {

        int[] nums = new int[]{4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        MoveZeroes.moveZeroesOld(nums);
        Assert.assertEquals(nums, new int[]{4, 2, 4, 3, 5, 1, 0, 0, 0, 0});
    }
}