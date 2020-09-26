/**
 * 
 */
package com.oggu.lc.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/word-pattern/ <br>
 * <br>
 * 290. Word Pattern <br>
 * 
 * Given a pattern and a string s, find if s follows the same pattern.
 * 
 * Here follow means a full match, such that there is a bijection between a
 * letter in pattern and a non-empty word in s.
 * 
 * 
 * <pre>
 * Example 1:
 * 
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true Example 2:
 * 
 * Input: pattern = "abba", s = "dog cat cat fish" 
 * Output: false
 * </pre>
 * 
 * @author Bhaskar
 *
 */
public class WordPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String pattern = "abba";
		String s = "dog cat cat dog";

		System.out.println(pattern + ", " + s + " -- wordPattern : " + wordPattern(pattern, s));

		pattern = "abba";
		s = "dog cat cat fish";

		System.out.println(pattern + ", " + s + " -- wordPattern : " + wordPattern(pattern, s));

		pattern = "aaaa";
		s = "dog cat cat dog";

		System.out.println(pattern + ", " + s + " -- wordPattern : " + wordPattern(pattern, s));

		pattern = "abba";
		s = "dog dog dog dog";

		System.out.println(pattern + ", " + s + " -- wordPattern : " + wordPattern(pattern, s));
	}

	public static boolean wordPattern(String pattern, String s) {

		String[] words = s.split(" ");
		int plen = pattern.length();

		if (plen != words.length)
			return false;

		Map<Character, String> cmap = new HashMap<>(plen);
		Map<String, Character> wmap = new HashMap<>(plen);

		for (int i = 0; i < plen; i++) {

			char pchar = pattern.charAt(i);
			String word = words[i];

			if (!cmap.containsKey(pchar)) {
				cmap.put(pchar, word);
			} else if (!cmap.get(pchar).equals(word)) {
				return false;
			}

			if (!wmap.containsKey(word)) {
				wmap.put(word, pchar);
			} else if (!wmap.get(word).equals(pchar)) {
				return false;
			}
		}

		return true;
	}
}
