package com.oggu.lc.medium;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

/**
 *
 */
public class SearchInRotatedSortedArray {

    public static void main(String... args) {

        Random random = new SecureRandom();
        int[] nums = {4, 5, 6, 7, 8, 9, 10, 11, 0, 1, 2, 3};
        int target = nums[random.nextInt(nums.length)];
        System.out.println("num : " + Arrays.toString(nums) + "w/ target : " + target + " search idx : " + search(nums, target));

        nums = new int[]{5, 6, 7, 4};
        target = nums[random.nextInt(nums.length)];
        System.out.println("num : " + Arrays.toString(nums) + "w/ target : " + target + " search idx : " + search(nums, target));
    }

    public static int search(int[] nums, int target) {

        if (nums == null) return -1;

        int length = nums.length;

        if (length < 3) {
            for (int i = 0; i < length; i++)
                if (nums[i] == target)
                    return i;
            return -1;
        }

        int endIdx = findPivot(nums);

        int left = 0;
        int right = length - 1;

        if (target >= nums[0] && target <= nums[endIdx]) right = endIdx;
        else left = endIdx + 1;


        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    private static int findPivot(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int mid = -1;

        while (left < right) {

            mid = left + (right - left) / 2;

            //sequence
            if (nums[left] < nums[mid])
                left = mid;
            else
                right = mid;
        }
        return mid;
    }

}
