/**
 * 
 */
package com.oggu.lc.easy;

/**
 * @author Bhaskar
 *
 */
public class IsSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "abc";
		String t = "ahbgdc";
		System.out.println(s + ", is sub sequence of " + t + " --- " + isSubsequence(s, t));

		s = "axc";
		t = "ahbgdc";
		System.out.println(s + ", is sub sequence of " + t + " --- " + isSubsequence(s, t));
	}

	public static boolean isSubsequence(String s, String t) {

		char[] schars = s.toCharArray();
		char[] tchars = t.toCharArray();

		int i = 0, j = 0, ctr = 0;

		while (ctr <= i && i < schars.length) {

			while (j < tchars.length)
				if (schars[i] == tchars[j++]) {
					ctr++;
					break;
				}
			i++;
		}

		System.out.println(i + " ==== " + j + "  " + ctr);

		return i == ctr;
	}
}
