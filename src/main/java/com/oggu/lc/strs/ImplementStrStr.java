/**
 *
 */
package com.oggu.lc.strs;

/**
 * https://leetcode.com/problems/implement-strstr/ <br>
 * <br>
 *
 * <pre>
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 * </pre>
 *
 * @author Bhaskar
 *
 */
public class ImplementStrStr {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String haystack = "hello";
        String needle = "ll";
        System.out.println(haystack + ", " + needle + " -- strStr : " + strStr(haystack, needle));

        haystack = "aaaaa";
        needle = "bba";
        System.out.println(haystack + ", " + needle + " -- strStr : " + strStr(haystack, needle));

        haystack = "mississippi";
        needle = "issippi";
        System.out.println(haystack + ", " + needle + " -- strStr : " + strStr(haystack, needle));

        haystack = "mississippi";
        needle = "issipi";
        System.out.println(haystack + ", " + needle + " -- strStr : " + strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {

        char[] hchars = haystack.toCharArray();
        char[] nchars = needle.toCharArray();

        int nlen = nchars.length;
        int hlen = hchars.length;

        if (nlen == 0)
            return 0;
        else if (hlen < nlen)
            return -1;

        for (int i = 0; i <= hlen - nlen; i++)
            for (int j = 0, x = i; j < nlen && x < hlen; j++, x++) {

                if (hchars[x] != nchars[j])
                    break;

                if (j == nlen - 1)
                    return i;
            }

        return -1;
    }

    public static int strStrOld(String haystack, String needle) {

        if (haystack == null) {
            return -1;
        }

        int hayLen = haystack.length();
        int ndlLen = needle.length();

        if (needle == null || needle.isEmpty()) {
            return 0;
        } else if (hayLen < ndlLen) {
            return -1;
        }

        for (int i = 0; i < hayLen; i++) {

            if (haystack.charAt(i) == needle.charAt(0) && i + ndlLen <= hayLen) {

                for (int j = 0; j < ndlLen; j++) {
                    int temp = i;

                    if ((temp + j >= hayLen) || (haystack.charAt(temp++ + j) != needle.charAt(j)))
                        break;

                    if (j == (ndlLen - 1))
                        return i;
                }
            }
        }

        return -1;
    }

}
