package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConcatenatedWordsTest {

    ConcatenatedWords concatenatedWords;

    @Before
    public void setUp(){
        concatenatedWords = new ConcatenatedWords();
    }

    @After
    public void tearDown(){
        concatenatedWords = null;
    }

    @Test
    public void test1(){
        String[] words = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
        Assert.assertEquals(3,concatenatedWords.findAllConcatenatedWordsInADict(words).size());
    }

    @Test
    public void test2(){
        String[] words = {"cat","dog","catdog"};
        Assert.assertEquals(1, concatenatedWords.findAllConcatenatedWordsInADict(words).size());
    }
}
