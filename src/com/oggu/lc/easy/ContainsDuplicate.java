/**
 * 
 */
package com.oggu.lc.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/contains-duplicate/
 * 
 * @author Bhaskar
 *
 */
public class ContainsDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 3, 1 };
		System.out.println(Arrays.toString(nums) + " containsDuplicate : " + containsDuplicate(nums));

		nums = new int[] { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(nums) + " containsDuplicate : " + containsDuplicate(nums));

		nums = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println(Arrays.toString(nums) + " containsDuplicate : " + containsDuplicate(nums));
	}

	public static boolean containsDuplicate(int[] nums) {

		if (nums == null || nums.length <= 1)
			return false;

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 1; i++)
			if (nums[i] == nums[i + 1])
				return true;

		return false;
	}

}
