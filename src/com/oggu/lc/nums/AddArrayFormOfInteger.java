/**
 * 
 */
package com.oggu.lc.nums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/add-to-array-form-of-integer/ <br>
 * <br>
 * <code>For a non-negative integer X, the array-form of X is an array of its digits in left to right order.  
 * For example, if X = 1231, then the array form is [1,2,3,1].
 * Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.</code>
 * 
 * @author Bhaskar
 *
 */
public class AddArrayFormOfInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] A = new int[] { 1, 2, 0, 0 };
		int K = 34;

		List<Integer> out = addToArrayForm(A, K);
		System.out.println("out : " + out);

		System.out.println("===========================================");
		A = new int[] { 2, 7, 4 };
		K = 181;

		out = addToArrayForm(A, K);
		System.out.println("out : " + out);
		System.out.println("===========================================");
		A = new int[] { 2, 1, 5 };
		K = 806;

		out = addToArrayForm(A, K);
		System.out.println("out : " + out);
	}

	public static List<Integer> addToArrayForm(int[] A, int K) {

		List<Integer> out = new ArrayList<Integer>();

		int rem = 0;
		int aLen = A.length;

		while (aLen > 0 || K > 0) {

			int temp = rem;
			rem = 0;

			if (K > 0) {
				temp = temp + (K % 10);
				K = K / 10;
			}

			if (aLen > 0)
				temp = temp + A[--aLen];

			if (temp >= 10) {
				rem = 1;
				temp = temp % 10;
			}

			out.add(temp);
		}

		if (rem > 0)
			out.add(rem);

		Collections.reverse(out);

		return out;
	}
}
