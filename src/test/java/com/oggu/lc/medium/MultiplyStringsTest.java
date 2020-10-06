package com.oggu.lc.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyStringsTest {

    String num1 = "2320", num2 = "3256";
    String result = "7553920";

    @Test
    public void multiply() {

        String multiply = MultiplyStrings.multiply(num1, num2);
        Assert.assertEquals(result, multiply);
    }
}