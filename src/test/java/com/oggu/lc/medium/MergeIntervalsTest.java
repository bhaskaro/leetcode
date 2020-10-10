package com.oggu.lc.medium;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MergeIntervalsTest {

    @Test
    public void testMain() {

        MergeIntervals.main(null);
    }

    @Test
    public void testMerge() {

        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merge = MergeIntervals.merge(intervals);
        Assert.assertNotNull(merge);
    }
}