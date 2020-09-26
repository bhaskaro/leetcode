/**
 * 
 */
package com.oggu.lc.easy;

/**
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 * 
 * @author Bhaskar
 *
 */
public class GuessNumberHigherOrLower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("guessNumber : " + guessNumber(10));
		System.out.println("guessNumber : " + guessNumber(1));
		System.out.println("guessNumber : " + guessNumber(2));
	}

	public static int guessNumber(int n) {

		int left = 0;
		int right = n;

		while (left < right) {

			int mid = left + (right - left) / 2;

			if (guess(mid) == 0)
				return mid;
			else if (guess(mid) == 1)
				left = mid + 1;
			else
				right = mid - 1;
		}

		return right;
	}

	private static int guess(int num) {

		int n = 6;

		if (num == n)
			return 0;
		else if (num < n)
			return 1;
		else
			return -1;
	}
}
