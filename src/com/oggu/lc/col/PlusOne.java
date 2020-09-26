/**
 * 
 */
package com.oggu.lc.col;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/plus-one/ <br>
 * <br>
 * 66. Plus One <br>
 * 
 * <pre>
 * Given a non-empty array of digits representing a non-negative integer,
 * increment one to the integer.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list, and each element in the array contains a single digit.
 * 
 * You may assume the integer does not contain any leading zero, except the
 * number 0 itself.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: digits = [1,2,3] Output: [1,2,4] Explanation: The array represents the
 * integer 123.
 * </pre>
 * 
 * @author Bhaskar
 *
 */
public class PlusOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] digits = { 1, 2, 3 };
		System.out.println("plusOne : " + Arrays.toString(plusOne(digits)));

		digits = new int[] { 1, 2, 9 };
		System.out.println("plusOne : " + Arrays.toString(plusOne(digits)));

		digits = new int[] { 1, 9, 9 };
		System.out.println("plusOne : " + Arrays.toString(plusOne(digits)));

		digits = new int[] { 9, 9, 9 };
		System.out.println("plusOne : " + Arrays.toString(plusOne(digits)));
	}

	public static int[] plusOne(int[] digits) {

		int len = digits.length;

		int rem = 0;

		if (digits[len - 1] == 9) {
			digits[len - 1] = ((digits[len - 1]) + 1) % 10;
			rem = 1;
		} else {
			digits[len - 1]++;
		}

		if (rem > 0)
			for (int i = digits.length - 2; i >= 0; i--)

				if (digits[i] + rem > 9)
					digits[i] = (digits[i] + rem) % 10;
				else {
					digits[i] = digits[i] + rem;
					rem = 0;
				}

		if (rem > 0) {

			int[] temp = new int[len + 1];
			temp[0] = rem;
			System.arraycopy(digits, 0, temp, 1, len - 1);
			digits = temp;
		}

		return digits;
	}

	public int[] plusOneOld(int[] digits) {

		if (digits == null || digits.length == 0) {
			return null;
		}

		int rem = 0;

		for (int i = digits.length - 1; i >= 0; i--) {

			if (digits[i] < 9) {

				if (rem > 0) {
					digits[i] = digits[i] + rem;
					rem = 0;
				} else {
					digits[i] = digits[i] + 1;

				}
				rem = 0;
				break;
			} else {
				rem = 1;
				digits[i] = 0;
			}
		}

		if (rem > 0) {
			int[] temp = new int[digits.length + 1];
			temp[0] = rem;
			System.arraycopy(digits, 0, temp, 1, digits.length);
			digits = temp;
		}

		return digits;

	}

}
