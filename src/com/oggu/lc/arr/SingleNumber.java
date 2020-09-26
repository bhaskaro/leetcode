/**
 * 
 */
package com.oggu.lc.arr;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/single-number/ <br>
 * <br>
 * 136. Single Number
 * 
 * @author Bhaskar
 *
 */
public class SingleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = { 2, 2, 1 };
		System.out.println(Arrays.toString(nums) + " -- singleNumber : " + singleNumber(nums));

		nums = new int[] { 4, 1, 2, 1, 2 };
		System.out.println(Arrays.toString(nums) + " -- singleNumber : " + singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {

		if (nums.length == 1)
			return nums[0];

		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++)
			if (i == nums.length - 1) {
				return nums[i];
			} else if (nums[i] == nums[i + 1]) {
				i++;
			} else {
				return nums[i];
			}

		return 0;
	}
}
