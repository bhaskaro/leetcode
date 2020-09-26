/**
 * 
 */
package com.oggu.lc.strs;

/**
 * https://leetcode.com/problems/longest-common-prefix/ <br>
 * <br>
 * 
 * <pre>
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 * </pre>
 * 
 * @author Bhaskar
 *
 */
public class LongestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] strs = { "flower", "flow", "flight" };
		System.out.println("longestCommonPrefix : " + longestCommonPrefix(strs));

		strs = new String[] { "dog", "racecar", "car" };
		System.out.println("longestCommonPrefix : " + longestCommonPrefix(strs));

		strs = new String[] { "aa", "a" };
		System.out.println("longestCommonPrefix : " + longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length < 1) {
			return "";
		} else if (strs.length == 1) {
			return strs[0];
		}

		StringBuilder sb = new StringBuilder();

		int posi = 0;
		boolean matching = true;

		while (matching && posi < strs[0].length()) {

			for (int i = 1; i < strs.length; i++) {

				if (strs[i].length() <= posi || strs[0].charAt(posi) != strs[i].charAt(posi)) {
					matching = false;
					break;
				}

				if (i == strs.length - 1) {
					sb.append(strs[0].charAt(posi));
				}
			}
			posi++;
		}

		return sb.toString();
	}

}
