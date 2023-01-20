package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonDecresingSubsequencesTest {

    NonDecreasingSubsequences nonDecreasingSubsequences;

    @Before
    public void setUp(){
        nonDecreasingSubsequences = new NonDecreasingSubsequences();
    }

    @After
    public void tearDown(){
        nonDecreasingSubsequences = null;
    }

    @Test
    public void test1(){
        int[] nums = {4,6,7,7};
        Assert.assertEquals(8,nonDecreasingSubsequences.findSubsequences(nums).size());
    }

    @Test
    public void test2(){
        int[] nums = {4,4,3,2,1};
        Assert.assertEquals(1,nonDecreasingSubsequences.findSubsequences(nums).size());
    }

}
