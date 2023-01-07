package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GasStationTest {

    GasStation gasStation;

    @Before
    public void setUp(){
        gasStation = new GasStation();
    }

    @Test
    public void testCase1(){
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        Assert.assertEquals(3,gasStation.canCompleteCircuit(gas,cost));
    }

    @Test
    public void testCase2(){
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};
        Assert.assertEquals(-1,gasStation.canCompleteCircuit(gas,cost));
    }

    @After
    public void tearDown(){
        gasStation = null;
    }
}
