/**
 * 
 */
package com.oggu.lc.easy;

/**
 * https://leetcode.com/problems/range-sum-query-immutable/
 * 
 * @author Bhaskar
 *
 */
public class NumArray {

	private int[] sums = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = new int[] { -2, 0, 3, -5, 2, -1 };
		NumArray numArray = new NumArray(nums);

		System.out.println("numArray : " + numArray.sumRange(0, 2));
		System.out.println("numArray : " + numArray.sumRange(2, 5));
		System.out.println("numArray : " + numArray.sumRange(0, 5));
	}

	public NumArray(int[] nums) {

		int length = nums.length;

		if (length > 1)
			for (int i = 1; i < length; i++)
				nums[i] = nums[i] + nums[i - 1];

		sums = nums;
	}

	public int sumRange(int i, int j) {

		return i > 0 ? sums[j] - sums[i - 1] : sums[j];
	}

}
