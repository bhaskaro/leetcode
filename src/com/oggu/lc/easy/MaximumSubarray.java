/**
 * 
 */
package com.oggu.lc.easy;

import java.util.Arrays;

/**
 * @author Bhaskar
 *
 */
public class MaximumSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(Arrays.toString(nums) + " --- maxSubArray : " + maxSubArray(nums));

		nums = new int[] { 1 };
		System.out.println(Arrays.toString(nums) + " --- maxSubArray : " + maxSubArray(nums));

		nums = new int[] { 0 };
		System.out.println(Arrays.toString(nums) + " --- maxSubArray : " + maxSubArray(nums));

		nums = new int[] { -1 };
		System.out.println(Arrays.toString(nums) + " --- maxSubArray : " + maxSubArray(nums));

		nums = new int[] { -2147483647 };
		System.out.println(Arrays.toString(nums) + " --- maxSubArray : " + maxSubArray(nums));

		nums = new int[] { 1, 2 };
		System.out.println(Arrays.toString(nums) + " --- maxSubArray : " + maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {

		int max = nums[0];
		int tot = 0;

		for (int i = 0; i < nums.length; i++) {
			tot += nums[i];
			max = max > tot ? max : tot;
			tot = tot < 0 ? 0 : tot;
		}

		return max;
	}

	public static int maxSubArrayKadannes(int[] nums) {
		int maximumValue = Integer.MIN_VALUE;

		// Kadane's Algorithm
		// Initialize curr_max = 0, and maximumValue = minimum integer value.
		// Iterate over the array by adding each element to the curr_max, If the sum at
		// any time is less than zero, make curr_max = 0.
		// If the sum at any time more than the maximumValue then replace maximumValue
		// with curr_max value.
		// Finally, we will have the required max value in the maximumValue. O(n)
		int currentSubArraySum = 0;
		for (int i = 0; i < nums.length; i++) {
			currentSubArraySum = currentSubArraySum + nums[i];
			// If the currentSubArraySum is more than maxValue, we have to replace maxValue
			// with currentSubArraySum.
			if (currentSubArraySum > maximumValue) {
				maximumValue = currentSubArraySum;
			}
			// If the currentSubArraySum is less than 0, it is a negative value , it will
			// reduce the sum if keep it.
			// just make it zero to not consider the currentSubArraySum until now and start
			// afresh.
			if (currentSubArraySum < 0) {
				currentSubArraySum = 0;
			}
		}

		// TODO divide and conquer approach

		return maximumValue;
	}

	public static int maxSubArrayOld(int[] nums) {

		int max = nums[0];
		int length = nums.length;

		for (int i = 0; i < length; i++) {

			int tot = 0;

			for (int j = i; j < length; j++) {
				tot += nums[j];
				if (tot < 0 && max > tot)
					break;
				max = max < tot ? tot : max;
			}
		}

		return max;
	}
}
