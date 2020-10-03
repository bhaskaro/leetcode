/**
 *
 */
package com.oggu.lc.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-palindrome/
 *
 * @author Bhaskar
 *
 */
public class LongestPalindrome {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String s = "abccccdd";
        System.out.println(s + " longestPalindrome : " + longestPalindrome(s));

        s = "a";
        System.out.println(s + " longestPalindrome : " + longestPalindrome(s));

        s = "bb";
        System.out.println(s + " longestPalindrome : " + longestPalindrome(s));

        s = "AAbb";
        System.out.println(s + " longestPalindrome : " + longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {

        char[] chars = s.toCharArray();
        int[] cnts = new int[128];

        for (char c : chars)
            cnts[c - 'A']++;

        boolean odd = false;

        int tot = 0;

        for (int x : cnts) {

            if (x >= 2)
                tot += (x / 2) * 2;

            if (!odd && x > 0 && x % 2 == 1) {
                odd = true;
                tot++;
            }
        }

        return tot;
    }

    public static int longestPalindromeOld(String s) {

        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars)
            map.put(c, map.getOrDefault(c, 0) + 1);

        boolean single = false;

        int tot = 0;

        for (Integer x : map.values()) {

            if (x >= 2)
                tot += (x / 2) * 2;

            if (!single && x > 0 && x % 2 == 1) {
                single = true;
                tot++;
            }
        }

        return tot;
    }

}
