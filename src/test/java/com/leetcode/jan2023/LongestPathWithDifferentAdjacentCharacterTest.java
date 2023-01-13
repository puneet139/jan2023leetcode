package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestPathWithDifferentAdjacentCharacterTest {

    LongestPathWithDifferentAdjacentCharacter longestPathWithDifferentAdjacentCharacter;

    @Before
    public void setUp(){
        longestPathWithDifferentAdjacentCharacter = new LongestPathWithDifferentAdjacentCharacter();
    }

    @After
    public void tearDown(){
        longestPathWithDifferentAdjacentCharacter = null;
    }

    @Test
    public void test1(){
        int[] parent = {-1,0,0,1,1,2};
        String s = "abacbe";
        Assert.assertEquals(3,longestPathWithDifferentAdjacentCharacter.longestPath(parent,s));
    }

    @Test
    public void test2(){
        int[] parent = {-1,0,0,0};
        String s = "aabc";
        Assert.assertEquals(3,longestPathWithDifferentAdjacentCharacter.longestPath(parent,s));
    }
}
