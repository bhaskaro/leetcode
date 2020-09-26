/**
 * 
 */
package com.oggu.lc.easy;

/**
 * https://leetcode.com/problems/hamming-distance/
 * 
 * @author Bhaskar
 *
 */
public class HammingDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x = 1;
		int y = 4;
		System.out.println(x + ", " + y + " hammingDistance -- " + hammingDistance(x, y));

		x = 3;
		y = 1;
		System.out.println(x + ", " + y + " hammingDistance -- " + hammingDistance(x, y));

		x = 300;
		y = 15555;
		System.out.println(x + ", " + y + " hammingDistance -- " + hammingDistance(x, y));
	}

	public static int hammingDistance(int x, int y) {

		int ctr = 0;

		while (x > 0 && y > 0) {
			if (x % 2 != y % 2)
				ctr++;
			x >>= 1;
			y >>= 1;
		}

		while (x > 0) {
			if (x % 2 != 0)
				ctr++;
			x >>= 1;
		}

		while (y > 0) {
			if (y % 2 != 0)
				ctr++;
			y >>= 1;
		}

		return ctr;
	}
}
