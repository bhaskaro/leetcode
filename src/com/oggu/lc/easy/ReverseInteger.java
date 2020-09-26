/**
 * 
 */
package com.oggu.lc.easy;

/**
 * @author Bhaskar
 *
 */
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = -123;
		System.out.println(num + " in reverse : " + reverse(num));

		num = 120;
		System.out.println(num + " in reverse : " + reverse(num));

		num = 120;
		System.out.println(num + " in reverse : " + reverse(num));

		num = -2147483648;
		System.out.println(num + " in reverse : " + reverse(num));

		num = 1534236469;
		System.out.println(num + " in reverse : " + reverse(num));
	}

	public static int reverse(int num) {

		if (num == 0 || num <= Integer.MIN_VALUE)
			return 0;

		boolean neg = num > 0 ? false : true;
		if (neg)
			num *= -1;

		StringBuilder sb = new StringBuilder(neg ? "-" : "");

		while (num > 0) {
			sb.append(num % 10);
			num /= 10;
		}

		long long1 = Long.parseLong(sb.toString());

		return (int) (long1 > Integer.MAX_VALUE || long1 < Integer.MIN_VALUE ? 0 : long1);
	}

	public int reverseOld(int num) {

		if (num == 0) {
			return 0;
		}

		boolean neg = num < 0;

		if (neg) {
			num = num * -1;
		}

		StringBuilder sb = new StringBuilder();

		while (num != 0) {
			int digit = num % 10;
			num = num / 10;
			sb.append(digit);
		}

		int total = 0;
		java.math.BigInteger bigInteger = new java.math.BigInteger(sb.toString());

		if (bigInteger.longValue() > Integer.MAX_VALUE || bigInteger.longValue() < Integer.MIN_VALUE) {
			total = 0;
		} else {

			total = neg ? bigInteger.intValue() * -1 : bigInteger.intValue();
		}

		return total;
	}
}
