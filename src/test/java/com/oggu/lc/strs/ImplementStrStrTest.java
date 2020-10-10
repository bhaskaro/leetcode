package com.oggu.lc.strs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ImplementStrStrTest {

    @Test
    public void testMain() {

        ImplementStrStr.main(null);
    }

    @Test
    public void testStrStr() {

        String haystack = "hello";
        String needle = "ll";
        int out = ImplementStrStr.strStr(haystack, needle);
        Assert.assertEquals(out, 2);
    }

    @Test
    public void testStrStrOld() {

        String haystack = "mississippi";
        String needle = "issippi";
        int out = ImplementStrStr.strStrOld(haystack, needle);
        Assert.assertEquals(out, 4);
    }
}