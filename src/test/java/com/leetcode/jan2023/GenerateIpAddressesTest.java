package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenerateIpAddressesTest {

    GenerateIpAddresses generateIpAddresses;

    @Before
    public void setUp(){
        generateIpAddresses = new GenerateIpAddresses();
    }

    @After
    public void tearDown(){
        generateIpAddresses = null;
    }

    @Test
    public void test1(){
        String s = "25525511135";
        Assert.assertEquals(2,generateIpAddresses.restoreIpAddresses(s).size());
    }

    @Test
    public void test2(){
        String s = "0000";
        Assert.assertEquals(1,generateIpAddresses.restoreIpAddresses(s).size());
    }

    @Test
    public void test3(){
        String s = "101023";
        Assert.assertEquals(5,generateIpAddresses.restoreIpAddresses(s).size());
    }
}
