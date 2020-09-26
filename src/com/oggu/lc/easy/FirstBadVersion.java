/**
 * 
 */
package com.oggu.lc.easy;

/**
 * https://leetcode.com/problems/first-bad-version/
 * 
 * @author Bhaskar
 *
 */
public class FirstBadVersion {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println("firstBadVersion : " + firstBadVersion(2126753390));
	}

	public static int firstBadVersion(int n) {

		int left = 0;
		int right = n;

		while (left < right) {

			int mid = left + (right - left) / 2;
			System.out.println(left + "    ======== " + mid + " ========   " + right);

			if (isBadVersion(mid))
				right = mid;
			else
				left = mid + 1;
		}

		return right;
	}

	private static boolean isBadVersion(int n) {

		return n >= 1702766719;
	}
}
