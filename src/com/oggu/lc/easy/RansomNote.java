/**
 *
 */
package com.oggu.lc.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/ransom-note/
 *
 * @author Bhaskar
 *
 */
public class RansomNote {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String ransomNote = "a";
        String magazine = "b";

        System.out.println(ransomNote + ", can be constructed with : " + magazine + "  --------:   "
                + canConstruct(ransomNote, magazine));

        ransomNote = "aa";
        magazine = "ab";

        System.out.println(ransomNote + ", can be constructed with : " + magazine + "  --------:   "
                + canConstruct(ransomNote, magazine));

        ransomNote = "aa";
        magazine = "aab";

        System.out.println(ransomNote + ", can be constructed with : " + magazine + "  --------:   "
                + canConstruct(ransomNote, magazine));

        ransomNote = "bg";
        magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";

        System.out.println(ransomNote + ", can be constructed with : " + magazine + "  --------:   "
                + canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        char[] charLens = new char[26];

        for (int i = 0; i < magazine.length(); i++)
            charLens[magazine.charAt(i) - 'a']++;

        for (int i = 0; i < ransomNote.length(); i++)
            if (charLens[ransomNote.charAt(i) - 'a']-- == 0)
                return false;

        return true;
    }

    public static boolean canConstructOld(String ransomNote, String magazine) {

        if (magazine.length() < ransomNote.length())
            return false;

        Map<Character, Integer> ransomNoteMap = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            ransomNoteMap.put(c, ransomNoteMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < magazine.length() && !ransomNoteMap.isEmpty(); i++) {
            char c = magazine.charAt(i);
            Integer rget = ransomNoteMap.get(c);
            if (rget == null)
                continue;
            else if (rget == 1)
                ransomNoteMap.remove(c);
            else
                ransomNoteMap.put(c, rget - 1);
        }

        return ransomNoteMap.isEmpty() ? true : false;
    }
}
