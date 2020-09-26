/**
 * 
 */
package com.oggu.lc.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Bhaskar
 *
 */
public class LongestPalindromicSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "abccbadbabad";
		System.out.println(s + " -- longestPalindrome : " + longestPalindrome(s));

		s = "cbbd";
		System.out.println(s + " -- longestPalindrome : " + longestPalindrome(s));

		s = "ac";
		System.out.println(s + " -- longestPalindrome : " + longestPalindrome(s));

		s = "ccc";
		System.out.println(s + " -- longestPalindrome : " + longestPalindrome(s));

		s = "abcda";
		System.out.println(s + " -- longestPalindrome : " + longestPalindrome(s));
	}

	public static String longestPalindrome(String s) {

		char[] chars = s.toCharArray();
		int slen = chars.length - 1;

		if (s.length() <= 0)
			return s;

		Map<Character, List<Integer>> map = new HashMap<>();

		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			List<Integer> list = null;

			if ((list = map.get(c)) == null)
				list = new ArrayList<>();

			list.add(i);
			map.put(c, list);
		}

		int left = 0;
		int right = slen;

		int[] longPali = new int[2];

		while (left < right) {

			List<Integer> list = map.get(chars[left]);
			int size = list.size();

			if (size < 2) {
				left++;
				continue;
			} else {
				right = list.get(--size);
			}

			boolean isPali = false;

			while (left < right && !(isPali = isPali(chars, left, right)))
				right = list.get(--size);

			if (isPali && longPali[1] - longPali[0] <= right - left) {
				longPali[0] = left;
				longPali[1] = right;
			}

			left++;
			right = slen;
		}

		return new String(chars, longPali[0], longPali[1] - longPali[0] + 1);
	}

	public static String longestPalindromeOld(String s) {

		char[] chars = s.toCharArray();
		int slen = chars.length - 1;

		if (s.length() <= 0)
			return s;

		int left = 0;
		int right = slen;

		int[] longPali = new int[2];

		while (left < right) {

			while (chars[left] != chars[right])
				right--;

			boolean isPali = false;

			while (left < right && !(isPali = isPali(chars, left, right)))
				right--;

			if (isPali && longPali[1] - longPali[0] <= right - left) {
				longPali[0] = left;
				longPali[1] = right;
			}

			left++;
			right = slen;
		}

		return new String(chars, longPali[0], longPali[1] - longPali[0] + 1);
	}

	private static boolean isPali(char[] chars, int left, int right) {

		while (left <= right)
			if (chars[left++] != chars[right--])
				return false;

		return true;
	}
}
