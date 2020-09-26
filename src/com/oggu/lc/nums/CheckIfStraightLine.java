/**
 * 
 */
package com.oggu.lc.nums;

/**
 * https://leetcode.com/problems/check-if-it-is-a-straight-line/ <br>
 * <br>
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y]
 * represents the coordinate of a point. Check if these points make a straight
 * line in the XY plane.
 * 
 * 
 * @author Bhaskar
 *
 */
public class CheckIfStraightLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] coordinates = new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 } };

		System.out.println("checkStraightLine : " + checkStraightLine(coordinates));

		coordinates = new int[][] { { 1, 1 }, { 2, 2 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 7, 7 } };

		System.out.println("checkStraightLine : " + checkStraightLine(coordinates));
	}

	public static boolean checkStraightLine(int[][] coordinates) {

		for (int i = 0; i < coordinates.length - 1; i++) {

			if ((coordinates[i][0] - coordinates[i][1]) != coordinates[i + 1][0] - coordinates[i + 1][1]) {
				return false;
			}
		}

		return true;
	}
}
