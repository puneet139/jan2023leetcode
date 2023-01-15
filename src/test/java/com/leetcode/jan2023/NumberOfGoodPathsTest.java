package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberOfGoodPathsTest {

    NumberOfGoodPaths numberOfGoodPaths;

    @Before
    public void setUp(){
        numberOfGoodPaths = new NumberOfGoodPaths();
    }

    @After
    public void tearDown(){
        numberOfGoodPaths = null;
    }

    @Test
    public void test1(){
        int[] vals = {1,3,2,1,3};
        int[][] edges = {{0,1},{0,2},{2,3},{2,4}};
        Assert.assertEquals(6,numberOfGoodPaths.numberOfGoodPaths(vals,edges));
    }

    @Test
    public void test2(){
        int[] vals = {1,1,2,2,3};
        int[][] edges = {{0,1},{1,2},{2,3},{2,4}};
        Assert.assertEquals(7,numberOfGoodPaths.numberOfGoodPaths(vals,edges));
    }

    @Test
    public void test3(){
        int[] vals = {1};
        int[][] edges = {};
        Assert.assertEquals(1,numberOfGoodPaths.numberOfGoodPaths(vals,edges));
    }
}
