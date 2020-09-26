/**
 * 
 */
package com.oggu.lc.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * 
 * @author Bhaskar
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "abcabcbb";
		System.out.println(str + "  -- " + lengthOfLongestSubstring(str));

		str = "bbbbb";
		System.out.println(str + "  -- " + lengthOfLongestSubstring(str));

		str = "pwwkew";
		System.out.println(str + "  -- " + lengthOfLongestSubstring(str));

		str = "";
		System.out.println(str + "  -- " + lengthOfLongestSubstring(str));

		str = "dvdf";
		System.out.println(str + "  -- " + lengthOfLongestSubstring(str));
	}

	// sliding window
	public static int lengthOfLongestSubstring(String str) {

		Set<Character> set = new HashSet<>();
		int left = 0;
		int right = 0;
		char[] chars = str.toCharArray();
		int strLen = chars.length;
		int maxSubLen = 0;

		while (left <= right && right < strLen) {

			if (!set.contains(chars[right])) {
				set.add(chars[right++]);
				maxSubLen = maxSubLen > (right - left) ? maxSubLen : (right - left);
			} else
				set.remove(chars[left++]);
		}

		return maxSubLen;
	}

	public int lengthOfLongestSubstringOld(String str) {

		int max = 0;

		if (str == null) {
			return max;
		}

		Set<Character> list = new HashSet<>();

		int left = 0;
		int right = str.length() - 1;

		while (left <= right) {

			int x = left;

			while (x <= right) {

				if (!list.contains(str.charAt(x))) {
					list.add(str.charAt(x++));
					max = max > list.size() ? max : list.size();
				} else {
					list.remove(str.charAt(left++));
				}

			}

		}

		return max;
	}
}
