/**
 *
 */
package com.oggu.lc.easy;

/**
 * https://leetcode.com/problems/reverse-bits/ 190. Reverse Bits
 *
 * Reverse bits of a given 32 bits unsigned integer.
 *
 *
 *
 * Example 1:
 *
 * <pre>
 * Input: 00000010100101000001111010011100 
 * Output: 00111001011110000010100101000000 
 *
 * Explanation: The input binary string
 * 00000010100101000001111010011100 represents the unsigned integer 43261596, so
 * return 964176192 which its binary representation is
 * 00111001011110000010100101000000.
 * </pre>
 *
 * @author Bhaskar
 *
 */
public class ReverseBits {

    /**
     * @param args
     */
    public static void main(String[] args) {

        long n = 110011100;
        System.out.println(n);
        System.out.println(Integer.reverse((int) n));
    }

    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        return 0;
    }
}
