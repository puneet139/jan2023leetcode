package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PallindromePartitioningTest {

    PallindromePartitioning pallindromePartitioning;

    @Before
    public void setUp(){
        pallindromePartitioning = new PallindromePartitioning();
    }

    @After
    public void tearDown(){
        pallindromePartitioning = null;
    }

    @Test
    public void test1(){
        String s = "aab";
        Assert.assertEquals(2,pallindromePartitioning.partition(s).size());
    }

    @Test
    public void test2(){
        String s = "a";
        Assert.assertEquals(1,pallindromePartitioning.partition(s).size());
    }
}
