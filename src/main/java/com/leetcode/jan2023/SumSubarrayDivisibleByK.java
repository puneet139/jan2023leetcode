package com.leetcode.jan2023;

import java.util.HashMap;
import java.util.Map;

public class SumSubarrayDivisibleByK {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> countMap = new HashMap<>();
        countMap.put(0,1);
        int count = 0;
        int sum = 0;
        for(int num:nums){
            sum = (sum + num)%k;
            if(sum<0){
                sum = sum + k;
            }
            count += countMap.getOrDefault(sum,0);
            countMap.put(sum,countMap.getOrDefault(sum,0)+1);

        }
        return count;
    }
}
