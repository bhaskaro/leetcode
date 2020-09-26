/**
 * 
 */
package com.oggu.lc.easy;

import java.util.Random;

/**
 * @author Bhaskar
 *
 */
public class AddStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random random = new Random();

		String num1 = String.valueOf(random.nextInt(10000));
		String num2 = String.valueOf(random.nextInt(10000));
		System.out.println(num1 + " + " + num2 + " = " + addStrings(num1, num2));
		System.out.println(num1 + " + " + num2 + " = " + (Integer.parseInt(num1) + Integer.parseInt(num2)));
	}

	public static String addStrings(String num1, String num2) {

		char[] num1chars = num1.toCharArray();
		char[] num2chars = num2.toCharArray();

		int num1len = num1chars.length;
		int num2len = num2chars.length;

		int maxLen = num1len > num2len ? num1len : num2len;
		int rem = 0;

		StringBuilder sb = new StringBuilder(maxLen + 1);

		while (maxLen-- > 0) {

			int temp = rem;

			if (num1len-- > 0)
				temp = temp + Character.getNumericValue(num1chars[num1len]);

			if (num2len-- > 0)
				temp = temp + Character.getNumericValue(num2chars[num2len]);

			if (temp > 9)
				rem = temp / 10;
			else
				rem = 0;

			sb.append(temp % 10);
		}

		if (rem > 0)
			sb.append(rem);

		return sb.reverse().toString();
	}

	public String addStringsOld(String num1, String num2) {

		String bigNum = null;
		String smallNum = null;

		if (num1.length() >= num2.length()) {
			bigNum = num1;
			smallNum = num2;
		} else {
			bigNum = num2;
			smallNum = num1;
		}

		int bigLen = bigNum.length() - 1;
		int smallLen = smallNum.length() - 1;

		int rem = 0;
		int out = 0;

		StringBuilder sb = new StringBuilder();

		while (bigLen >= 0 && smallLen >= 0) {

			out = rem + (bigNum.charAt(bigLen--) - '0') + (smallNum.charAt(smallLen--) - '0');

			if (out >= 10) {
				rem = out / 10;
				out = out - 10;
			} else {
				rem = 0;
			}

			sb.insert(0, out);
		}

		while (bigLen >= 0) {

			out = rem + (bigNum.charAt(bigLen--) - '0');

			if (out >= 10) {
				rem = out / 10;
				out = out - 10;
			} else {
				rem = 0;
			}

			sb.insert(0, out);
		}

		if (rem > 0) {
			sb.insert(0, rem);
		}

		return sb.toString();
	}

}
