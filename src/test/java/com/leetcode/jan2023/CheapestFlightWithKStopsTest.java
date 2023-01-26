package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheapestFlightWithKStopsTest {

    CheapestFlightWithKStops cheapestFlightWithKStops;

    @Before
    public void setUp(){
        cheapestFlightWithKStops = new CheapestFlightWithKStops();
    }

    @After
    public void tearDown(){
        cheapestFlightWithKStops = null;
    }

    @Test
    public void test1(){
        int n = 4;
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0;
        int dest = 3;
        int k=1;
        Assert.assertEquals(700,cheapestFlightWithKStops.findCheapestPrice(n,flights,src,dest,k));
    }

    @Test
    public void test2(){
        int n = 3;
        int[][] flights = {{0,1,100},{1,2,100},{0,2,500}};
        int src = 0;
        int dest = 2;
        int k=1;
        Assert.assertEquals(200,cheapestFlightWithKStops.findCheapestPrice(n,flights,src,dest,k));
    }

    @Test
    public void test3(){
        int n = 3;
        int[][] flights = {{0,1,100},{1,2,100},{0,2,500}};
        int src = 0;
        int dest = 2;
        int k=0;
        Assert.assertEquals(500,cheapestFlightWithKStops.findCheapestPrice(n,flights,src,dest,k));
    }
}
