/**
 *
 */
package com.oggu.lc.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/rotate-array/ <br>
 * <br>
 * 189. Rotate Array
 *
 * <br>
 *
 * <pre>
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 *
 * <b>Follow up:</b>
 *
 * Try to come up as many solutions as you can, there are at least 3 different
 * ways to solve this problem. Could you do it in-place with O(1) extra space?
 * </pre>
 *
 * @author Bhaskar
 *
 */
public class RotateArray {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println("before rotate : " + Arrays.toString(nums));
        rotate(nums, k);
        System.out.println("after  rotate : " + Arrays.toString(nums));

        nums = new int[]{-1, -100, 3, 99};
        k = 2;
        System.out.println("before rotate : " + Arrays.toString(nums));
        rotate(nums, k);
        System.out.println("after  rotate : " + Arrays.toString(nums));
    }

    public static void rotateNew(int[] nums, int k) {

        int left = 0;
        int len = nums.length - 1;
        int x = k;

        int kthele = nums[k];

        while (left < x && k < len) {

            System.out.println(x + " =========== left : " + left);
            nums[k] = nums[left];
            nums[left++] = nums[++k];
        }
        nums[len] = kthele;
    }

    public static void rotate(int[] nums, int k) {

        int len = nums.length - 1;

        while (k-- > 0) {

            int last = nums[len];

            for (int i = len; i > 0; i--)
                nums[i] = nums[i - 1];

            nums[0] = last;
        }
    }

}
