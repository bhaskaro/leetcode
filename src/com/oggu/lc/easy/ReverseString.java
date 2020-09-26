/**
 * 
 */
package com.oggu.lc.easy;

import java.util.Arrays;

/**
 * @author Bhaskar
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char[] s = "hello world".toCharArray();
		System.out.println("before reverse : " + Arrays.toString(s));
		reverseString(s);
		System.out.println("After  reverse : " + Arrays.toString(s));
	}

	public static void reverseString(char[] s) {

		int left = 0;
		int right = s.length - 1;

		while (left < right) {

			char temp = s[left];
			s[left++] = s[right];
			s[right--] = temp;
		}
	}
}
