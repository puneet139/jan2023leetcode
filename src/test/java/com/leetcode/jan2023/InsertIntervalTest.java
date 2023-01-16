package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InsertIntervalTest {

    InsertInterval insertInterval;

    @Before
    public void setUp(){
        insertInterval = new InsertInterval();
    }

    @After
    public void tearDown(){
        insertInterval = null;
    }

    @Test
    public void test1(){
        int[][] intervals = {{1,3},{6,9}};
        int[] newIntervals = {2,5};
        Assert.assertEquals(2,insertInterval.insert(intervals,newIntervals).length);
    }

    @Test
    public void test2(){
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newIntervals = {4,8};
        Assert.assertEquals(3,insertInterval.insert(intervals,newIntervals).length);
    }
}
