/**
 * 
 */
package com.oggu.lc.col;

import java.util.Arrays;

/**
 * @author Bhaskar
 *
 */
public class RemoveDuplicatesFromSortedArrayII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };

		System.out.println("removeDuplicates : " + removeDuplicates(nums) + "\t" + Arrays.toString(nums));
	}

	public static int removeDuplicates(int[] nums) {

		if (nums == null) {
			return 0;
		} else if (nums.length == 1) {
			return 1;
		}

		int cnt = 1;
		int lidx = 0;

		for (int i = 0; i < nums.length - 1; i++) {

			while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
				cnt++;
				i++;
				i++;

				if (cnt == 2) {
					lidx = i + 1;
				}
			}

			if (cnt > 2) {
				// swapt i
				System.out.println("swappint  : " + lidx + "\t" + i);
				nums[lidx] = nums[i];
				i++;
			}

		}

		return 0;
	}

}
