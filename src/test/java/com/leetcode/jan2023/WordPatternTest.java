package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordPatternTest {

    WordPattern wordPattern;

    @Before
    public void setUp(){
        wordPattern = new WordPattern();
    }

    @Test
    public void testCase1(){
        String pattern = "abba";
        String word = "dog cat cat dog";
        Assert.assertTrue(wordPattern.wordPattern(pattern, word));
    }

    @Test
    public void testCase2(){
        String pattern = "abba";
        String word = "dog cat cat fish";
        Assert.assertFalse(wordPattern.wordPattern(pattern, word));
    }

    @Test
    public void testCase3(){
        String pattern = "aaaa";
        String word = "dog cat cat dog";
        Assert.assertFalse(wordPattern.wordPattern(pattern, word));
    }

    @After
    public void tearDown(){
        wordPattern = null;
    }

}
