/**
 *
 */
package com.oggu.lc.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/valid-anagram/
 *
 * @author Bhaskar
 *
 */
public class ValidAnagram {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        System.out.println(s + "," + t + " are anagrams : " + isAnagram(s, t));

        s = "rat";
        t = "car";
        System.out.println(s + "," + t + " are anagrams : " + isAnagram(s, t));

        s = "rat";
        t = "car";
        System.out.println(s + "," + t + " are anagrams : " + isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        int len = 0, i = 0;

        if (s == null || t == null)
            return false;
        else if ((len = s.length()) != t.length())
            return false;

        int[] arr = new int[26];

        while (i < len)
            arr[s.charAt(i++) - 'a']++;

        i = 0;

        while (i < len)
            if (arr[t.charAt(i++) - 'a']-- == 0)
                return false;

        return true;
    }

    public static boolean isAnagramOld(String s, String t) {

        if (s == null || t == null)
            return false;
        else if (s.length() != t.length())
            return false;

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {

            Character c = t.charAt(i);

            if (list.isEmpty() || !list.contains(c)) {
                return false;
            }
            list.remove(c);
        }

        return true;
    }

}
