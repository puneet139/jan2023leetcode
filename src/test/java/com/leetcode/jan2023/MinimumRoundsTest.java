package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimumRoundsTest {

    MinimumRounds minimumRounds;

    @Before
    public void setUp(){
        minimumRounds = new MinimumRounds();
    }

    @Test
    public void testCase1(){
        int[] arr = {2,2,3,3,2,4,4,4,4,4};
        Assert.assertEquals(4,minimumRounds.minimumRounds(arr));
    }

    @Test
    public void testCase2(){
        int[] arr = {2,3,3};
        Assert.assertEquals(-1,minimumRounds.minimumRounds(arr));
    }

    @Test
    public void testCase3(){
        int[] arr = {2,3,3,3,3,2,2,2,4,4,4,4,4};
        Assert.assertEquals(6,minimumRounds.minimumRounds(arr));
    }

    @After
    public void tearDown(){
        minimumRounds = null;
    }
}
