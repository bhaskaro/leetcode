package com.oggu.lc.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MajorityElementIITest {

    @Test
    public void testMain() {
        //only for coverage
        MajorityElementII.main(null);
    }

    @Test
    public void testMajorityElement1() {
        int[] nums = new int[]{3, 2, 3};
        List<Integer> majorityElement = MajorityElementII.majorityElement(nums);
        Assert.assertEquals(majorityElement.toArray(new Integer[0]), new int[]{3});
    }

    @Test
    public void testMajorityElement2() {
        int[] nums = new int[]{1};
        List<Integer> majorityElement = MajorityElementII.majorityElement(nums);
        Assert.assertEquals(majorityElement.toArray(new Integer[0]), new int[]{1});
    }

    @Test
    public void testMajorityElement3() {
        int[] nums = new int[]{1, 2};
        List<Integer> majorityElement = MajorityElementII.majorityElement(nums);
        Assert.assertEquals(majorityElement.toArray(new Integer[0]), new int[]{1, 2});
    }

    @Test
    public void testMajorityElement4() {
        int[] nums = new int[]{3, 3, 4};
        List<Integer> majorityElement = MajorityElementII.majorityElement(nums);
        Assert.assertEquals(majorityElement.toArray(new Integer[0]), new int[]{3});
    }

    @Test
    public void testMajorityElement5() {
        int[] nums = new int[]{2, 2, 1, 3};
        List<Integer> majorityElement = MajorityElementII.majorityElement(nums);
        Assert.assertEquals(majorityElement.toArray(new Integer[0]), new int[]{2});
    }

    @Test
    public void testMajorityElement6() {
        int[] nums = new int[]{1, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1, 1};
        List<Integer> majorityElement = MajorityElementII.majorityElement(nums);
        Assert.assertEquals(majorityElement.toArray(new Integer[0]), new int[]{1});
    }
}