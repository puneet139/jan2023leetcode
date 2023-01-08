package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxPointsOnLineTest {

    MaxPointsOnLine maxPointsOnLine;

    @Before
    public void setUp(){
        maxPointsOnLine = new MaxPointsOnLine();
    }

    @Test
    public void testCase1(){
        int[][] points = {{1,1},{2,2},{3,3}};
        Assert.assertEquals(3,maxPointsOnLine.maxPoints(points));
    }

    @Test
    public void testCase2(){
        int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        Assert.assertEquals(4,maxPointsOnLine.maxPoints(points));
    }

    @After
    public void tearDown(){
        maxPointsOnLine = null;
    }

}
