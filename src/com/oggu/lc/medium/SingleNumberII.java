/**
 * 
 */
package com.oggu.lc.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Bhaskar
 *
 */
public class SingleNumberII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = new int[] { 2, 2, 3, 2 };
		System.out.println(Arrays.toString(nums) + " -- singleNumber : " + singleNumber(nums));

		nums = new int[] { 0, 1, 0, 1, 0, 1, 99 };
		System.out.println(Arrays.toString(nums) + " -- singleNumber : " + singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {

		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			if (i < nums.length - 2 && nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
				i += 2;
			} else {
				return nums[i];
			}
		}
		return 0;
	}

	public static int[] singleNumberOld(int[] nums) {

		Set<Integer> set = new HashSet<>();

		for (int i : nums)
			if (set.contains(i))
				set.remove(i);
			else
				set.add(i);

		Integer[] array = set.stream().toArray(Integer[]::new);

		return new int[] { array[0], array[1] };
	}

}
