/**
 * 
 */
package com.oggu.lc.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problemset/all/?difficulty=Easy
 * 
 * @author Bhaskar
 *
 */
public class MoveZeroes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = new int[] { 0, 1, 0, 3, 12 };
		System.out.println("before moving zeros : " + Arrays.toString(nums));
		moveZeroes(nums);
		System.out.println("after  moving zeros : " + Arrays.toString(nums));

		nums = new int[] { 0 };
		System.out.println("before moving zeros : " + Arrays.toString(nums));
		moveZeroes(nums);
		System.out.println("after  moving zeros : " + Arrays.toString(nums));

		nums = new int[] { 1, 0 };
		System.out.println("before moving zeros : " + Arrays.toString(nums));
		moveZeroes(nums);
		System.out.println("after  moving zeros : " + Arrays.toString(nums));

		nums = new int[] { 0, 0, 1 };
		System.out.println("before moving zeros : " + Arrays.toString(nums));
		moveZeroes(nums);
		System.out.println("after  moving zeros : " + Arrays.toString(nums));

		nums = new int[] { 1, 0, 1 };
		System.out.println("before moving zeros : " + Arrays.toString(nums));
		moveZeroes(nums);
		System.out.println("after  moving zeros : " + Arrays.toString(nums));

		nums = new int[] { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0 };
		System.out.println("before moving zeros : " + Arrays.toString(nums));
		moveZeroes(nums);
		System.out.println("after  moving zeros : " + Arrays.toString(nums));
	}

	public static void moveZeroes(int[] nums) {
		int i = 0;
		for (int n : nums)
			if (n != 0)
				nums[i++] = n;
		while (i < nums.length)
			nums[i++] = 0;
	}

	public static void moveZeroesOld(int[] nums) {

		int left = 0;
		int right = 1;

		while (left < nums.length && right < nums.length) {

			while (left < nums.length && nums[left] != 0)
				left++;

			if (right < left)
				right = left + 1;

			while (right < nums.length && nums[right] == 0)
				right++;

			System.out.println(left + " ------------------- " + right);
			if (left < right && right < nums.length) {
				nums[left] = nums[right];
				nums[right] = 0;
			}
			left++;
			right++;
		}
	}
}
