/**
 *
 */
package com.oggu.lc.strs;

/**
 * https://leetcode.com/problems/length-of-last-word/ <br>
 * <br>
 * <b>58. Length of Last Word </b> <br>
 *
 * <pre>
 * Given a string s consists of upper/lower-case alphabets and empty space
 * characters ' ', return the length of last word (last word means the last
 * appearing word if we loop from left to right) in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a maximal substring consisting of non-space
 * characters only.
 *
 * Example:
 *
 * Input: "Hello World" Output: 5
 * </pre>
 *
 * @author Bhaskar
 *
 */
public class LengthOfLastWord {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String s = "Hello World";
        System.out.println("lengthOfLastWord : " + lengthOfLastWord(s));

        s = "a";
        System.out.println("lengthOfLastWord : " + lengthOfLastWord(s));

        s = "  a";
        System.out.println("lengthOfLastWord : " + lengthOfLastWord(s));

        s = "  abcd";
        System.out.println("lengthOfLastWord : " + lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {

        if (s == null) {
            return 0;
        }

        int idx = s.length() - 1;
        int count = 0;

        // ignore end spaces
        while (idx > 0 && s.charAt(idx) == ' ')
            idx--;

        while (idx >= 0 && s.charAt(idx--) != ' ')
            count++;

        return count;
    }

    public int lengthOfLastWordOld(String s) {

        int out = 0;
        int i = s.length();

        int lastemtpy = 0;

        while (i > 0 && s.charAt(i - 1) == ' ') {
            lastemtpy++;
            i--;
        }

        while (i > 0 && s.charAt(i - 1) != ' ')
            i--;

        if (i != 0) {
            out = s.length() - lastemtpy - i;
        } else {
            out = s.length() - lastemtpy;
        }

        return out;
    }

}
