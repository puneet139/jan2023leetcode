package com.leetcode.jan2023;

public class MaximumSumCircularSubarray {

    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int[] rightSum = new int[n];
        rightSum[n-1] = nums[n-1];
        for(int suffixSum = nums[n-1], i = n-2;i>=0;i--){
            suffixSum += nums[i];
            rightSum[i] = Math.max(suffixSum, rightSum[i+1]);
        }
        int maxSum = nums[0];
        int specialSum = nums[0];
        for(int i=0, prefixSum=0, currMax=0;i<n;i++){
            currMax = Math.max(currMax,0) + nums[i];
            maxSum  = Math.max(maxSum,currMax);
            prefixSum += nums[i];

            if(i+1<n){
                specialSum = Math.max(specialSum,prefixSum + rightSum[i+1]);
            }
        }
        return Math.max(maxSum,specialSum);
    }
}
