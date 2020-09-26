/**
 * 
 */
package com.oggu.lc.strs;

/**
 * @author Bhaskar
 *
 */
public class AddBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String a = "11", b = "1";

		System.out.println(a + " + " + b + " = addBinary : " + addBinary(a, b));
		a = "1010";
		b = "1011";
		System.out.println(a + " + " + b + " = addBinary : " + addBinary(a, b));

		a = "01111";
		b = "01111";
		System.out.println(a + " + " + b + " = addBinary : " + addBinary(a, b));

		a = "0";
		b = "0";
		System.out.println(a + " + " + b + " = addBinary : " + addBinary(a, b));
	}

	// 2 ms time
	public static String addBinary(String a, String b) {

		char[] achars = a.toCharArray();
		char[] bchars = b.toCharArray();

		int alen = achars.length;
		int blen = bchars.length;

		StringBuilder sb = new StringBuilder();
		int tot = 0;

		while (alen > 0 || blen > 0) {

			if (alen > 0 && achars[--alen] == '1')
				tot++;

			if (blen > 0 && bchars[--blen] == '1')
				tot++;

			if (tot == 3) {
				tot = 1;
				sb.append(1);
			} else if (tot == 2) {
				tot = 1;
				sb.append(0);
			} else if (tot == 1) {
				tot = 0;
				sb.append(1);
			} else
				sb.append(0);
		}

		if (tot > 0)
			sb.append(1);

		return sb.reverse().toString();
	}

	public static String addBinaryNew(String a, String b) {

		int aLen = a.length() - 1;
		int bLen = b.length() - 1;

		char one = '1';
		char zero = '0';

		int tot = 0;

		int x = aLen > bLen ? aLen + 2 : bLen + 2;
		char[] out = new char[x];

		while (aLen >= 0 || bLen >= 0) {

			if (aLen >= 0 && a.charAt(aLen--) == one)
				tot++;

			if (bLen >= 0 && b.charAt(bLen--) == one)
				tot++;

			switch (tot) {
			case 3:
				tot = 1;
				out[--x] = one;
				break;
			case 2:
				out[--x] = zero;
				tot = 1;
				break;
			default:
				out[--x] = (tot > 0) ? one : zero;
				tot = 0;
				break;
			}
		}

		String outStr = null;

		if (tot > 0) {
			out[--x] = (tot > 0) ? one : zero;
			outStr = new String(out);
		} else {
			outStr = new String(out, 1, out.length - 1);
		}

		return new String(outStr);
	}

	// 1 ms time
	public String addBinaryOld(String a, String b) {

		int i = a.length() - 1;
		int j = b.length() - 1;

		char[] out = new char[Math.max(i, j) + 1];
		int outlen = out.length;
		int x = outlen - 1;

		int rem = 0;

		while (i >= 0 || j >= 0) {

			if (i >= 0)
				rem = rem + a.charAt(i--) - 48;

			if (j >= 0)
				rem = rem + b.charAt(j--) - 48;

			out[x--] = (char) ((rem % 2) + 48);

			rem = rem / 2;
		}

		if (rem > 0) {
			char[] temp = new char[outlen + 1];
			temp[0] = (char) (rem + 48);
			System.arraycopy(out, 0, temp, 1, outlen);
			out = temp;
		}

		return new String(out);
	}
}
