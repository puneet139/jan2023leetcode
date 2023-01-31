package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BestTeamWithNoConflictsTest {

    BestTeamWithNoConflicts bestTeamWithNoConflicts;

    @Before
    public void setUp(){
        bestTeamWithNoConflicts = new BestTeamWithNoConflicts();
    }

    @After
    public void tearDown(){
        bestTeamWithNoConflicts = null;
    }

    @Test
    public void test1(){
        int[] scores = {1,3,5,10,15};
        int[] ages =  {1,2,3,4,5};
        Assert.assertEquals(34,bestTeamWithNoConflicts.bestTeamScore(scores,ages));
    }

    @Test
    public void test2(){
        int[] scores = {4,5,6,5};
        int[] ages =  {2,1,2,1};
        Assert.assertEquals(16,bestTeamWithNoConflicts.bestTeamScore(scores,ages));
    }

    @Test
    public void test3(){
        int[] scores = {1,2,3,5};
        int[] ages =  {8,9,10,1};
        Assert.assertEquals(6,bestTeamWithNoConflicts.bestTeamScore(scores,ages));
    }
}
