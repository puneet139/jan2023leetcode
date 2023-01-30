package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NthTribonacciNumberTest {

    NthTribonacciNumber nthTribonacciNumber;

    @Before
    public void setUp(){
        nthTribonacciNumber = new NthTribonacciNumber();
    }

    @After
    public void tearDown(){
        nthTribonacciNumber = null;
    }

    @Test
    public void test1(){
        int n = 4;
        Assert.assertEquals(4,nthTribonacciNumber.tribonacci(n));
    }

    @Test
    public void test2(){
        int n = 25;
        Assert.assertEquals(1389537,nthTribonacciNumber.tribonacci(n));
    }
}
