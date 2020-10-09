package com.oggu.lc.utils;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Bhaskar
 */
public class BinarySearch {

    private static final Random random = new SecureRandom();

    /**
     * @param args arguments
     */
    public static void main(String[] args) {

        int[] nums = NumberUtils.uniqRandomNumsSorted(10);
        int target = nums[random.nextInt(nums.length)];

        System.out.println(target + " found at idx " + binarySearch(nums, target) + ", for : " + Arrays.toString(nums));
        nums = NumberUtils.uniqRandomNumsSorted(10);
        target = nums[random.nextInt(nums.length)];
        System.out.println(target + " found at idx " + binarySearch(nums, target) + ", for : " + Arrays.toString(nums));
        nums = NumberUtils.uniqRandomNumsSorted(10);
        target = nums[random.nextInt(nums.length)];
        System.out.println(target + " found at idx " + binarySearch(nums, target) + ", for : " + Arrays.toString(nums));
    }

    private static int binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length;

        int mid = 0;

        while (left < right) {

            mid = (left + right) / 2;

            if (nums[mid] == target) break;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid;
        }

        return nums[mid] == target ? mid : -1;
    }

}
