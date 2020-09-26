/**
 * 
 */
package com.oggu.lc.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/missing-number/
 * 
 * @author Bhaskar
 *
 */
public class MissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = new int[] { 3, 0, 1 };
		System.out.println(Arrays.toString(nums) + " = missingNumber : " + missingNumber(nums));

		nums = new int[] { 0 };
		System.out.println(Arrays.toString(nums) + " = missingNumber : " + missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {

		int actSum = (nums.length * (nums.length + 1)) / 2;

		for (int i : nums)
			actSum -= i;

		return actSum;
	}

	public static int missingNumberOld(int[] nums) {

		if (nums != null) {
			Arrays.sort(nums);
			int n = nums.length;
			for (int i = 0; i <= n; i++)
				if ((i < n && nums[i] != i) || i == n)
					return i;
		}
		return 0;
	}
}
