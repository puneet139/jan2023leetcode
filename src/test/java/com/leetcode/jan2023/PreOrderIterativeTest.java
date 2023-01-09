package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PreOrderIterativeTest {

    PreOrderIterative preOrderIterative;
    
    @Before
    public void setUp(){
        preOrderIterative = new PreOrderIterative();
    }

    @After
    public void tearDown(){
        preOrderIterative = null;
    }

    @Test
    public void test1(){
        PreOrderIterative.TreeNode root = new PreOrderIterative.TreeNode(1);
        root.right = new PreOrderIterative.TreeNode(2);
        root.right.left = new PreOrderIterative.TreeNode(3);
        Assert.assertEquals(3,preOrderIterative.preorderTraversal(root).size());
    }

    @Test
    public void test2(){
        PreOrderIterative.TreeNode root = null;
        Assert.assertEquals(0,preOrderIterative.preorderTraversal(root).size());
    }

    @Test
    public void test3(){
        PreOrderIterative.TreeNode root = new PreOrderIterative.TreeNode(1);
        Assert.assertEquals(1,preOrderIterative.preorderTraversal(root).size());
    }

}
