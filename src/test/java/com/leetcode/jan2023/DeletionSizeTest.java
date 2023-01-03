package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeletionSizeTest {

    DeletionSize deletionSize;

    @Before
    public void setUp(){
        deletionSize = new DeletionSize();
    }

    @Test
    public void testCase1(){
        String[] strs  = {"cba","daf","ghi"};
        Assert.assertEquals(1,deletionSize.minDeletionSize(strs));
    }

    @Test
    public void testCase2(){
        String[] strs = {"a","b"};
        Assert.assertEquals(0,deletionSize.minDeletionSize(strs));
    }

    @Test
    public void testCase3(){
        String[] strs = {"zyx","wvu","tsr"};
        Assert.assertEquals(3,deletionSize.minDeletionSize(strs));
    }

    @After
    public void tearDown(){
        deletionSize = null;
    }
}
