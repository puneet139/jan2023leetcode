package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SummaryRangeTest {

    SummaryRange summaryRange;

    @Before
    public void setUp(){
        summaryRange = new SummaryRange();
    }

    @After
    public void tearDown(){
        summaryRange = null;
    }

    @Test
    public void test1(){
        summaryRange.addNum(1);      // arr = [1]
        summaryRange.getIntervals(); // return [[1, 1]]
        summaryRange.addNum(3);      // arr = [1, 3]
        summaryRange.getIntervals(); // return [[1, 1], [3, 3]]
        summaryRange.addNum(7);      // arr = [1, 3, 7]
        summaryRange.getIntervals(); // return [[1, 1], [3, 3], [7, 7]]
        summaryRange.addNum(2);      // arr = [1, 2, 3, 7]
        summaryRange.getIntervals();
        Assert.assertEquals(2,summaryRange.getIntervals().length);
    }
}
