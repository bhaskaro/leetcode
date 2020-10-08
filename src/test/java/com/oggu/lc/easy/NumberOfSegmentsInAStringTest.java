package com.oggu.lc.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOfSegmentsInAStringTest {

    @Test(priority = 1)
    public void testMain() {

        NumberOfSegmentsInAString.main(null);
    }

    @Test(priority = 2)
    public void testCountSegments1() {
        String s = "Hello, my name is John";
        int out = NumberOfSegmentsInAString.countSegments(s);
        Assert.assertEquals(out, 5);
    }

    @Test(priority = 3)
    public void testCountSegments2() {
        String s = "Hello";
        int out = NumberOfSegmentsInAString.countSegments(s);
        Assert.assertEquals(out, 1);
    }

    @Test(priority = 4)
    public void testCountSegments3() {
        String s = "love live! mu'sic forever";
        int out = NumberOfSegmentsInAString.countSegments(s);
        Assert.assertEquals(out, 4);
    }

    @Test(priority = 5)
    public void testCountSegments4() {
        String s = "";
        int out = NumberOfSegmentsInAString.countSegments(s);
        Assert.assertEquals(out, 0);
    }

    @Test(priority = 6)
    public void testCountSegments5() {
        String s = ", , , ,        a, eaefa";
        int out = NumberOfSegmentsInAString.countSegments(s);
        Assert.assertEquals(out, 6);
    }
}