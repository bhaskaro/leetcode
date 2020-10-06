package com.oggu.lc.col;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MinStackTest {

    MinStack minStack = null;

    @BeforeMethod
    public void setUp() {

        minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
    }

    @Test(priority = 1)
    public void testGetMin() {

        Assert.assertEquals(minStack.getMin(), -3);
    }

    @Test(priority = 2)
    public void testPop() {

        minStack.pop();
        Assert.assertEquals(minStack.getMin(), -2);
    }

    @Test(priority = 3)
    public void testPush() {

        minStack.push(-5);
        Assert.assertEquals(minStack.getMin(), -5);
    }


    @Test(priority = 4)
    public void testTop() {

        minStack.push(1000);
        Assert.assertEquals(minStack.top(), 1000);
    }
}