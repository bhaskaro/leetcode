package com.oggu.lc.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {

        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
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
    }

    public static int[][] merge(int[][] intervals) {

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            if (i < intervals.length - 1 && intervals[i][1] >= intervals[i + 1][0] && intervals[i][1] < intervals[i + 1][1]) {
                list.add(new int[]{intervals[i][0], intervals[i + 1][1]});
                i++;
            } else if (i < intervals.length - 1 && (intervals[i][0] == intervals[i + 1][0] && intervals[i][1] == intervals[i + 1][1])) {
                //skip record
            } else {
                list.add(intervals[i]);
            }
        }

        return list.toArray(new int[0][]);
    }
}
