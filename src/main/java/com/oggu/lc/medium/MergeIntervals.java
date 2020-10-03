package com.oggu.lc.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {

        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        // intervals = new int[][]{{1, 3}, {0, 6}, {8, 10}, {15, 18}};

        int[][] merge = merge(intervals);

        for (int[] no : merge)
            System.out.println("merge : " + Arrays.toString(no));

        System.out.println("---------------------------------------");
        intervals = new int[][]{{1, 4}, {4, 5}};
        merge = merge(intervals);

        for (int[] no : merge)
            System.out.println("merge : " + Arrays.toString(no));

        System.out.println("---------------------------------------");
        intervals = new int[][]{{1, 4}, {1, 4}};
        merge = merge(intervals);

        for (int[] no : merge)
            System.out.println("merge : " + Arrays.toString(no));

        System.out.println("---------------------------------------");
        intervals = new int[][]{{1, 4}, {0, 4}};
        merge = merge(intervals);

        for (int[] no : merge)
            System.out.println("merge : " + Arrays.toString(no));

        System.out.println("---------------------------------------");
        intervals = new int[][]{{1, 4}, {0, 1}};
        merge = merge(intervals);

        for (int[] no : merge)
            System.out.println("merge : " + Arrays.toString(no));

        System.out.println("---------------------------------------");
        intervals = new int[][]{{1, 4}, {0, 2}, {3, 5}};
        merge = merge(intervals);

        for (int[] no : merge)
            System.out.println("merge : " + Arrays.toString(no));

        System.out.println("---------------------------------------");
        intervals = new int[][]{{1, 4}, {2, 3}};
        merge = merge(intervals);

        for (int[] no : merge)
            System.out.println("merge : " + Arrays.toString(no));
    }

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
        int length = intervals.length;

        for (int i = 0; i < length; i++) {

            if (intervals[i] == null)
                continue;
            int[] temp1 = intervals[i];

            for (int j = i + 1; j < length; j++) {

                if (intervals[j] == null)
                    continue;
                int[] temp2 = intervals[j];

                if ((temp1[1] >= temp2[0]) && temp1[1] < temp2[1]) {
                    intervals[j][0] = temp1[0];
                    intervals[j][1] = temp2[1];
                    intervals[i] = null;
                } else if (temp1[0] <= temp2[0] && temp1[1] >= temp2[1])
                    intervals[j] = null;
            }
        }

        List<int[]> list = new ArrayList<>();
        for (int[] x : intervals) if (x != null) list.add(x);

        return list.toArray(new int[0][]);
    }

}
