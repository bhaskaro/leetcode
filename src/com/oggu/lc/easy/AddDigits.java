/**
 * 
 */
package com.oggu.lc.easy;

/**
 * https://leetcode.com/problems/add-digits/
 * 
 * @author Bhaskar
 *
 */
public class AddDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 28;
		System.out.println(num + " addDigits : " + addDigits(num));
	}

	public static int addDigits(int num) {

		if (num < 9)
			return num;

		if (num % 9 == 0)
			return 9;
		else
			return num % 9;
	}

	public static int addDigitsOld(int num) {

		while (num > 9) {

			int temp = 0;

			while (num > 0) {
				temp += (num % 10);
				num /= 10;
			}

			num = temp;
		}

		return num;
	}
}
