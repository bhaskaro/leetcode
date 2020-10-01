package com.oggu.lc.medium;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetMatrixZeroes {

    public static void main(String[] args) {

        int rows = 5;
        int cols = 5;
        Random ran = new Random();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = ran.nextInt(10);

        for (int[] x : arr) {
            for (int i : x)
                System.out.print(i + " ");
            System.out.println();
        }

        setZeroes(arr);
        System.out.println("-------------------------");
        for (int[] x : arr) {
            for (int i : x)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {

        int rows = 0;
        int cols = 0;

        if (matrix != null && matrix.length > 0) {
            rows = matrix.length;
            cols = matrix[0].length;
        }

        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }

        for (int i : zeroRows)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = 0;

        for (int j : zeroCols)
            for (int i = 0; i < rows; i++)
                matrix[i][j] = 0;
    }
}
