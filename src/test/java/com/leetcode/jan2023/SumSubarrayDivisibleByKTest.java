package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumSubarrayDivisibleByKTest {

    SumSubarrayDivisibleByK sumSubarrayDivisibleByK;

    @Before
    public void setUp(){
        sumSubarrayDivisibleByK = new SumSubarrayDivisibleByK();
    }

    @After
    public void tearDown(){
        sumSubarrayDivisibleByK = null;
    }

    @Test
    public void test1(){
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        Assert.assertEquals(7,sumSubarrayDivisibleByK.subarraysDivByK(nums,k));
    }

    @Test
    public void test2(){
        int[] nums = {5};
        int k =9;
        Assert.assertEquals(0,sumSubarrayDivisibleByK.subarraysDivByK(nums,k));
    }
}
