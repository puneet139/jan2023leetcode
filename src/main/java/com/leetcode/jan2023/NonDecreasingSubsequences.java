package com.leetcode.jan2023;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDecreasingSubsequences {

    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();
        List<Integer> numList = new ArrayList<>();
        generateSubsequences(nums[0],0,nums,numList,answer);
        List result = new ArrayList<>(answer);
        return result;
    }

    private void generateSubsequences(int start,int index,int[] nums,List<Integer> numsList,Set<List<Integer>> answer){
        if(numsList.size()>=2){
            answer.add(new ArrayList<>(numsList));
        }
        for(int j=index;j<nums.length;j++){
            if(numsList.size()==0 || numsList.get(numsList.size()-1)<=nums[j]){
                numsList.add(nums[j]);

                generateSubsequences(nums[j],j+1,nums,numsList,answer);
                if(numsList.size()>0) {
                    numsList.remove(numsList.size()-1);
                }
            }
        }
    }
}
