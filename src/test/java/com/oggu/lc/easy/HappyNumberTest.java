package com.oggu.lc.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HappyNumberTest {

    @Test
    public void testMain() {

        HappyNumber.main(null);
    }

    @Test
    public void testIsHappy() {

        boolean happy = HappyNumber.isHappy(19);
        Assert.assertTrue(happy);
    }
}