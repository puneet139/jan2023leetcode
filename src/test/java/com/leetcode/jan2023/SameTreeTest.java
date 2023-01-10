package com.leetcode.jan2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameTreeTest {

    SameTree sameTree;

    @Before
    public void setUp(){
        sameTree = new SameTree();
    }

    @After
    public void tearDown(){
        sameTree = null;
    }

    @Test
    public void test1(){
        SameTree.TreeNode p = new SameTree.TreeNode(1);
        p.left = new SameTree.TreeNode(2);
        p.right = new SameTree.TreeNode(3);

        SameTree.TreeNode q = new SameTree.TreeNode(1);
        q.left = new SameTree.TreeNode(2);
        q.right = new SameTree.TreeNode(3);

        Assert.assertTrue(sameTree.isSameTree(p,q));
    }

    @Test
    public void test2(){
        SameTree.TreeNode p = new SameTree.TreeNode(1);
        p.left = new SameTree.TreeNode(2);
        p.right = null;

        SameTree.TreeNode q = new SameTree.TreeNode(1);
        q.left = null;
        q.right = new SameTree.TreeNode(3);

        Assert.assertFalse(sameTree.isSameTree(p,q));
    }

    @Test
    public void test3(){
        SameTree.TreeNode p = new SameTree.TreeNode(1);
        p.left = new SameTree.TreeNode(2);
        p.right = new SameTree.TreeNode(1);

        SameTree.TreeNode q = new SameTree.TreeNode(1);
        q.left = new SameTree.TreeNode(1);
        q.right = new SameTree.TreeNode(2);

        Assert.assertFalse(sameTree.isSameTree(p,q));
    }
}
