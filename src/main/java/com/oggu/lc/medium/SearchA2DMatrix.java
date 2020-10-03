package com.oggu.lc.medium;

public class SearchA2DMatrix {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};

        for (int[] x : matrix) {
            for (int i : x)
                System.out.print(i + " ");
            System.out.println();
        }

        int target = 33;
        System.out.println("searchMatrix : " + searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows - 1;
        int[] req = null;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (matrix[mid][0] <= target && matrix[mid][cols - 1] >= target) {
                req = matrix[mid];
                break;
            } else if (matrix[mid][0] >= target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        left = 0;
        right = cols - 1;

        if (req != null)
            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (req[mid] == target)
                    return true;
                else if (req[mid] > target)
                    right = mid - 1;
                else
                    left = mid + 1;
            }

        return false;
    }
}
