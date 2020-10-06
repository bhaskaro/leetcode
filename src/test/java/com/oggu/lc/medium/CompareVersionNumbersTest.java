package com.oggu.lc.medium;

import org.junit.Assert;
import org.junit.Test;

public class CompareVersionNumbersTest {


    @Test
    public void compareVersion1() {

        String version1 = "1.01";
        String version2 = "1.001";

        Assert.assertEquals(0, CompareVersionNumbers.compareVersion(version1, version2));
    }

    @Test
    public void compareVersion2() {

        String version1 = "1.0";
        String version2 = "1.0.0";

        Assert.assertEquals(0, CompareVersionNumbers.compareVersion(version1, version2));
    }

    @Test
    public void compareVersion3() {

        String version1 = "0.1";
        String version2 = "1.1";

        Assert.assertEquals(-1, CompareVersionNumbers.compareVersion(version1, version2));
    }

    @Test
    public void compareVersion4() {

        String version1 = "1.0.1";
        String version2 = "1";

        Assert.assertEquals(1, CompareVersionNumbers.compareVersion(version1, version2));
    }

    @Test
    public void compareVersion5() {

        String version1 = "7.5.2.4.1";
        String version2 = "7.5.3";

        Assert.assertEquals(-1, CompareVersionNumbers.compareVersion(version1, version2));
    }
}