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
                maxSubLen = Math.max(maxSubLen, (right - left));
            } else
                set.remove(chars[left++]);
        }

        return maxSubLen;
    }

}
