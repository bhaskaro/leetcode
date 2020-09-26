/**
 * 
 */
package com.oggu.lc.nums;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/palindrome-number/ <br>
 * <br>
 * Determine whether an integer is a palindrome. An integer is a palindrome when
 * it reads the same backward as forward.
 * 
 * @author Bhaskar
 *
 */
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x = 1221;
		System.out.format("%s is palindrome : %s\n", x, isPalindrome(x));
		x = 12212;
		System.out.format("%s is palindrome : %s\n", x, isPalindrome(x));
	}

	public static boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		} else if (x < 10) {
			return true;
		}

		int orig = x;
		int rem = 0;
		int rev = 0;

		while (x > 0) {

			rem = x % 10;
			rev = rev * 10 + rem;
			x = x / 10;
		}

		return orig == rev;
	}

	public static boolean isPalindrome2(int x) {

		if (x < 0) {
			return false;
		} else if (x < 10) {
			return true;
		}

		List<Integer> list = new ArrayList<Integer>();

		while (x > 0) {
			list.add(x % 10);
			x = x / 10;
		}

		int left = 0;
		int right = list.size() - 1;

		while (left <= list.size() / 2) {

			if (list.get(left++) != list.get(right--)) {
				return false;
			}
		}

		return true;
	}

}
