package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MonotonicStringMinFlipsTest {

    MonotonicStringMinFlips monotonicStringMinFlips;

    @Before
    public void setUp(){
        monotonicStringMinFlips = new MonotonicStringMinFlips();
    }

    @After
    public void tearDown(){
        monotonicStringMinFlips = null;
    }

    @Test
    public void test1(){
        String s ="00110";
        Assert.assertEquals(1,monotonicStringMinFlips.minFlipsMonoIncr(s));
    }

    @Test
    public void test2(){
        String s = "010110";
        Assert.assertEquals(2,monotonicStringMinFlips.minFlipsMonoIncr(s));
    }

    @Test
    public void test3(){
        String s="00011000";
        Assert.assertEquals(2,monotonicStringMinFlips.minFlipsMonoIncr(s));
    }
}
