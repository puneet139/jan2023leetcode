package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumIcecreamBarsTest {

    MaximumIcecreamBars maximumIcecreamBars;

    @Before
    public void setUp(){
        maximumIcecreamBars = new MaximumIcecreamBars();
    }

    @Test
    public void testCase1(){
        int[] costs = {1,3,2,4,1};
        int coins = 7;
        Assert.assertEquals(4,maximumIcecreamBars.maxIceCream(costs,coins));
    }

    @Test
    public void testCase2(){
        int[] costs = {10,6,8,7,7,8};
        int coins = 5;
        Assert.assertEquals(0,maximumIcecreamBars.maxIceCream(costs,coins));
    }

    @Test
    public void testCase3(){
        int[] costs = {1,6,3,1,2,5};
        int coins = 20;
        Assert.assertEquals(6,maximumIcecreamBars.maxIceCream(costs,coins));
    }

    @After
    public void tearDown(){
        maximumIcecreamBars = null;
    }
}
