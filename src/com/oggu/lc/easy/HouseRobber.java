/**
 * 
 */
package com.oggu.lc.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/house-robber/ <br>
 * <br>
 * 198. House Robber<br>
 * 
 * @author Bhaskar
 *
 */
public class HouseRobber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 3, 1 };
		System.out.println(Arrays.toString(nums) + " - rob sum : " + rob(nums));

		nums = new int[] { 2, 7, 9, 3, 1 };
		System.out.println(Arrays.toString(nums) + " - rob sum : " + rob(nums));

		nums = new int[] { 1, 2 };
		System.out.println(Arrays.toString(nums) + " - rob sum : " + rob(nums));
	}

	public static int rob(int[] nums) {

		int out1 = 0;
		int out2 = 0;

		if (nums == null || nums.length == 0)
			return out1;

		for (int i = 0; i < nums.length; i += 2)
			out1 = out1 + nums[i];

		for (int i = 1; i < nums.length; i += 2)
			out2 = out2 + nums[i];

		return out1 > out2 ? out1 : out2;
	}
}
