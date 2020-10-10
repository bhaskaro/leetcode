package com.oggu.lc.strs;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AddBinaryTest {

    @Test
    public void testMain() {

        AddBinary.main(null);
    }

    @Test
    public void testAddBinary() {

        String a = "11", b = "1";
        String out = AddBinary.addBinary(a, b);
        Assert.assertNotNull(out);
        Assert.assertEquals(out, "100");
    }

    @Test
    public void testAddBinaryNew() {

        String a = "1010", b = "1011";
        String out = AddBinary.addBinaryNew(a, b);
        Assert.assertNotNull(out);
        Assert.assertEquals(out, "10101");
    }

    @Test
    public void testAddBinaryOld() {

        String a = "01111", b = "01111";
        String out = AddBinary.addBinaryOld(a, b);
        Assert.assertNotNull(out);
        Assert.assertEquals(out, "11110");
    }
}