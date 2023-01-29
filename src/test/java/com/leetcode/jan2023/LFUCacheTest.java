package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LFUCacheTest {

    LFUCache lfuCache;

    @Before
    public void setUp(){
        lfuCache = new LFUCache(2);
    }

    @After
    public void tearDown(){
        lfuCache = null;
    }

    @Test
    public void test1(){
        lfuCache.put(1,1);
        lfuCache.put(2,2);
        Assert.assertEquals(1,lfuCache.get(1));
        lfuCache.put(3,3);
        Assert.assertEquals(-1,lfuCache.get(2));
        Assert.assertEquals(3,lfuCache.get(3));
        lfuCache.put(4,4);
        Assert.assertEquals(-1,lfuCache.get(1));
        Assert.assertEquals(3,lfuCache.get(3));
        Assert.assertEquals(4,lfuCache.get(4));
    }
}
