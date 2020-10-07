package com.oggu.lc.medium;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LRUCacheTest {

    LRUCache cache = null;
    int capacity = 2;

    @BeforeMethod
    public void setUp() {
        cache = new LRUCache(capacity);
    }

    @Test(invocationCount = 10)
    public void testGet() {

        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(3, 30);

        Assert.assertEquals(cache.get(3), 30);
    }

    @Test(invocationCount = 10)
    public void testPut() {

        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(3, 30);

        Assert.assertEquals(cache.get(3), 30);
    }
}