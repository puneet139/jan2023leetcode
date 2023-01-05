package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinArrowToBurstBalloonTest {

    MinArrowToBurstBalloon minArrowToBurstBalloon;

    @Before
    public void setUp(){
        minArrowToBurstBalloon = new MinArrowToBurstBalloon();
    }

    @Test
    public void testCase1(){
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        Assert.assertEquals(2,minArrowToBurstBalloon.findMinArrowShots(points));
    }

    @Test
    public void testCase2(){
        int[][] points = {{1,2},{3,4},{5,6},{7,8}};
        Assert.assertEquals(4,minArrowToBurstBalloon.findMinArrowShots(points));
    }

    @Test
    public void testCase3(){
        int[][] points = {{1,2},{2,3},{3,4},{4,5}};
        Assert.assertEquals(2,minArrowToBurstBalloon.findMinArrowShots(points));
    }

    @After
    public void tearDown(){
        minArrowToBurstBalloon = null;
    }
}
