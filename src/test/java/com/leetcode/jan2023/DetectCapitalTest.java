package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DetectCapitalTest {

    DetectCapital detectCapital;

    @Before
    public void setUp(){
        detectCapital = new DetectCapital();
    }

    @Test
    public void testCase1(){
        String word = "USA";
        Assert.assertTrue(detectCapital.detectCapitalUse(word));
    }

    @Test
    public void testCase2(){
        String word = "leetcode";
        Assert.assertTrue(detectCapital.detectCapitalUse(word));
    }

    @Test
    public void testCase3(){
        String word = "FlaG";
        Assert.assertFalse(detectCapital.detectCapitalUse(word));
    }

    @After
    public void tearDown(){
        detectCapital = null;
    }
}
