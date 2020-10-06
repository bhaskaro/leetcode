/**
 *
 */
package com.oggu.lc.easy;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 * @author Bhaskar
 *
 */
public class FirstUniqueCharacterInString {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String s = "leetcode";
        System.out.println(s + " firstUniqChar : " + firstUniqChar(s));

        s = "loveleetcode";
        System.out.println(s + " firstUniqChar : " + firstUniqChar(s));

        for (int i = 0; i < 128; i++) {

            char c = (char) i;
            System.out.println(i + " - " + c);
        }
    }

    public static int firstUniqChar(String s) {

        int[] cnt = new int[128];

        for (int i = 0; i < s.length(); i++)
            cnt[s.charAt(i)]++;

        for (int i = 0; i < s.length(); i++)
            if (cnt[s.charAt(i)] == 1)
                return i;

        return -1;
    }
}
