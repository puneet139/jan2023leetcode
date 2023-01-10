package com.leetcode.jan2023;

public class SameTree {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int v){
            val = v;
            left = right = null;
        }

        TreeNode(int v, TreeNode left, TreeNode right){
            val = v;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }

        return ((p.val==q.val) && isSameTree(p.left,q.left) && (isSameTree(p.right,q.right)));
    }
}
