package com.leetcode.jan2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderIterative {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){
            left = null;
            right =  null;
        }

        TreeNode(int v){
            val = v;
            left = null;
            right =  null;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList<Integer>();
        }
        List<Integer> nodeList = new ArrayList<>();
        Stack<TreeNode> q = new Stack<>();
        q.push(root);
        while(!q.isEmpty()){
            TreeNode node = q.pop();
            nodeList.add(node.val);
            if(node.right!=null){
                q.push(node.right);
            }
            if(node.left!=null){
                q.push(node.left);
            }
        }
        return nodeList;
    }
}
