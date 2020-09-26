/**
 * 
 */
package com.oggu.lc.col;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-element/ <br>
 * <br>
 * 
 * <pre>
 * Given an array nums and a value val, remove all instances of that value
 * in-place and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 * 
 * Example 1:
 * 
 * Given nums = [3,2,2,3], val = 3,
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 2.
 * 
 * It doesn't matter what you leave beyond the returned length.
 * </pre>
 * 
 * @author Bhaskar
 *
 */
public class RemoveElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = { 3, 2, 2, 3 };
		int removeElement = removeElement(nums, 3);
		System.out.println("removeElement : " + removeElement + " -- " + Arrays.toString(nums));

		nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
		removeElement = removeElement(nums, 2);
		System.out.println("removeElement : " + removeElement + " -- " + Arrays.toString(nums));
	}

	public static int removeElement(int[] nums, int val) {

		if (nums == null)
			return 0;

		if (nums.length == 1) {
			if (nums[0] == val)
				return 0;
			else
				return 1;
		}

		int lidx = 0;
		int ridx = nums.length - 1;

		while (lidx < ridx && lidx < nums.length) {

			if (nums[lidx] != val) {
				lidx++;
			} else {

				while (ridx > 0 && nums[ridx] == val)
					ridx--;

				if (lidx < ridx)
					// swap elements
					nums[lidx] = nums[ridx];

				lidx++;
				ridx--;
			}

		}

		return lidx > 0 ? lidx + 1 : lidx;
	}

	public int removeElementOld(int[] nums, int val) {

		if (nums.length == 0) {
			return 0;
		}

		if (nums.length == 1) {
			if (nums[0] == val) {
				return 0;
			} else {
				return 1;
			}
		}

		int left = -1;
		int right = nums.length - 1;

		while (left < right) {

			if (nums[left + 1] != val) {
				left++;
			} else {
				if (nums[right] != val) {
					int temp = nums[++left];
					nums[left] = nums[right];
					nums[right--] = temp;
				} else {
					right--;
				}
			}
		}

		if (left != -1) {
			left++;
		} else {
			left = 0;
		}

		return left;
	}
}
