/**
 * 
 */
package com.oggu.lc.col;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/search-insert-position/ <br>
 * <br>
 * 35. Search Insert Position<br>
 * 
 * <pre>
 * Given a sorted array and a target value, return
 * the index if the target is found. If not, return the index where it would be
 * if it were inserted in order.
 * </pre>
 * 
 * @author Bhaskar
 *
 */
public class SearchInsertPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = new int[] { 1, 3, 5, 6 };
		int target = 5;
		System.out.println(target + " can be inserted at searchInsert : " + searchInsert(nums, target) + " for "
				+ Arrays.toString(nums));

		target = 2;
		System.out.println(target + " can be inserted at searchInsert : " + searchInsert(nums, target) + " for "
				+ Arrays.toString(nums));

		target = 7;
		System.out.println(target + " can be inserted at searchInsert : " + searchInsert(nums, target) + " for "
				+ Arrays.toString(nums));

		target = 0;
		System.out.println(target + " can be inserted at searchInsert : " + searchInsert(nums, target) + " for "
				+ Arrays.toString(nums));

		nums = new int[] { 1, 3 };
		target = 0;
		System.out.println(target + " can be inserted at searchInsert : " + searchInsert(nums, target) + " for "
				+ Arrays.toString(nums));

		nums = new int[] { 1, 2, 4, 6, 7 };
		target = 3;
		System.out.println(target + " can be inserted at searchInsert : " + searchInsert(nums, target) + " for "
				+ Arrays.toString(nums));

	}

	public static int searchInsert(int[] nums, int target) {

		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (nums[mid] == target)
				return mid;
			else if (target < nums[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return low;
	}

	// not working
	public int searchInsertOld(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;

		int mid = 0;

		while (start <= end) {

			mid = (start + end) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		if (mid == nums.length - 1) {

			if (nums[mid] > target) {
				mid++;
			} else {
				mid--;
			}
		} else if (mid == 0) {

			if (nums[mid] < target) {
				mid++;
			} else {
				mid--;
			}
		}

		return mid;
	}
}
