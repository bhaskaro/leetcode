/**
 * 
 */
package com.oggu.lc.col;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element/ <br>
 * <br>
 * 169. Majority Element
 * 
 * 
 * <br>
 * 
 * <pre>
 * * Given an array of size n, find the majority element. The majority element
 * is the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * Example 1:
 * 
 * Input: [3,2,3] Output: 3
 * </pre>
 * 
 * @author Bhaskar
 *
 */
public class MajorityElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = new int[] { 3, 2, 3 };
		System.out.println(Arrays.toString(nums) + " - majorityElement : " + majorityElement(nums));

		nums = new int[] { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(Arrays.toString(nums) + " - majorityElement : " + majorityElement(nums));

		nums = new int[] { 3, 2, 3 };
		System.out.println(Arrays.toString(nums) + " - majorityElementSort : " + majorityElementSort(nums));

		nums = new int[] { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(Arrays.toString(nums) + " - majorityElementSort : " + majorityElementSort(nums));
	}

	public static int majorityElement(int[] nums) {

		if (nums.length == 1)
			return nums[0];

		int max = 0;
		int ele = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			Integer val = map.get(nums[i]);

			if (val != null) {

				map.put(nums[i], ++val);

				if (max < val + 1) {
					max = val + 1;
					ele = nums[i];
				}
			} else {
				map.put(nums[i], 1);
			}

		}

		return ele;
	}

	// using sort
	public static int majorityElementSort(int[] nums) {

		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

}
