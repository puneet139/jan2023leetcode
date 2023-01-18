package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumSumCircularSubarrayTest {

    MaximumSumCircularSubarray maximumSumCircularSubarray;

    @Before
    public void setUp(){
        maximumSumCircularSubarray = new MaximumSumCircularSubarray();
    }

    @After
    public void tearDown(){
        maximumSumCircularSubarray = null;
    }

    @Test
    public void test1(){
        int[] nums = {1,-2,3,-2};
        Assert.assertEquals(3,maximumSumCircularSubarray.maxSubarraySumCircular(nums));
    }

    @Test
    public void test2(){
        int[] nums = {5,-3,5};
        Assert.assertEquals(10,maximumSumCircularSubarray.maxSubarraySumCircular(nums));
    }

    @Test
    public void test3(){
        int[] nums = {-3,-2,-3};
        Assert.assertEquals(-2,maximumSumCircularSubarray.maxSubarraySumCircular(nums));
    }
}
