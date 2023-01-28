package com.leetcode.jan2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SummaryRange {

    Set<Integer> numSet;

    public SummaryRange() {
        numSet = new TreeSet<>();
    }

    public void addNum(int value) {
        numSet.add(value);
    }

    public int[][] getIntervals() {
        if(numSet.isEmpty()){
            return new int[0][2];
        }
        List<int[]> interval = new ArrayList<>();
        int left = -1;
        int right = -1;
        for(int value:numSet){
            if(left<0){
                left = right = value;
            }else if(value==(right + 1)){
                right = value;
            }else{
                interval.add(new int[]{left,right});
                left = right = value;
            }
        }
        interval.add(new int[]{left,right});
        return interval.toArray(new int[interval.size()][2]);
    }
}
