/**
 *
 */
package com.oggu.lc.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/count-primes/ <br>
 * <br>
 * 204. Count Primes<br>
 *
 * Count the number of prime numbers less than a non-negative number, n.
 *
 * Example:
 *
 * Input: 10 Output: 4 Explanation: There are 4 prime numbers less than 10, they
 * are 2, 3, 5, 7.
 *
 * @author Bhaskar
 *
 */
public class CountPrimes {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int n = 499979;//
        System.out.println("countPrimes : " + countPrimes(n));
    }

    public static int countPrimes(int n) {

        int count = 0;

        boolean[] primes = new boolean[n];
        // Arrays.fill(primes, true);

        for (int i = 2; i * i < n; i++)
            if (!primes[i])
                for (int j = i; j * i < n; j++)
                    primes[i * j] = true;

        for (int i = 2; i < n; i++)
            if (!primes[i])
                count++;

        return count;
    }

    public static int countPrimes2(int n) {

        int count = 0;

        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        for (int i = 2; i * i < n; i++)

            if (primes[i]) {
                for (int j = i; j * i < n; j++) {
                    primes[i * j] = false;
                }
            }

        for (int i = 2; i < n; i++)

            if (primes[i])
                count++;

        // long count = IntStream.range(1, n).parallel().filter(x -> isPrime(x) ==
        // true).count();

        return count;
    }

    private static boolean isPrime(int n) {

        boolean isPrime = true;

        if (n == 1) {
            isPrime = false;
        } else if (n == 2 || n == 3) {
            isPrime = true;
        } else {

            for (int i = 2; i <= n / 2; ++i) {

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }

    public int countPrimesOld1(int n) {

        long count = IntStream.range(1, n).parallel().filter(x -> isPrime(x) == true).count();

        return (int) count;
    }

    public int countPrimesOld1(int n) {

        long count = IntStream.range(1, n).parallel().filter(x -> isPrime(x) == true).count();

        return (int) count;
    }

}
