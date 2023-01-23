package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TownJudgeTest {

    TownJudge townJudge;

    @Before
    public void setUp(){
        townJudge = new TownJudge();
    }

    @After
    public void tearDown(){
        townJudge = null;
    }

    @Test
    public void test1(){
        int n = 2;
        int[][] trust = {{1,2}};
        Assert.assertEquals(2,townJudge.findJudge(n,trust));
    }

    @Test
    public void test2(){
        int n= 3;
        int[][] trust = {{1,3},{2,3}};
        Assert.assertEquals(3,townJudge.findJudge(n,trust));
    }

    @Test
    public void test3(){
        int n= 3;
        int[][] trust = {{1,3},{2,3},{3,1}};
        Assert.assertEquals(-1,townJudge.findJudge(n,trust));
    }
}
