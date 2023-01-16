package com.leetcode.jan2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    private int[] mergeInterval(int[] a,int[] b){
        int[] newInterval = {Math.min(a[0],b[0]),Math.max(a[1],b[1])};
        return newInterval;
    }

    private boolean doesOverlap(int[] current,int[] interval){
        return (Math.min(current[1],interval[1]) -  Math.max(current[0],interval[0]))>=0;
    }



    private int getIndex(int[][] intervals,int[] newIntervals){
        if(intervals.length==0){
            return 0;
        }
        int index = intervals.length;
        int end = intervals.length-1;
        int start = 0;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(intervals[mid][0]>newIntervals[0]){
                index = mid;
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return index;
    }

    int[][] insertInterval(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        int index = getIndex(intervals, newInterval);

        if (index != intervals.length) {
            list.add(index, newInterval);
        } else {
            list.add(newInterval);
        }

        return list.toArray(new int[list.size()][2]);
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        intervals = insertInterval(intervals,newInterval);
        List<int[]> answer = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int[] currentInterval = {intervals[i][0],intervals[i][1]};
            while(i<intervals.length && doesOverlap(currentInterval,intervals[i])){
                currentInterval = mergeInterval(currentInterval,intervals[i]);
                i++;
            }

            i--;
            answer.add(currentInterval);
        }
        return answer.toArray(new int[answer.size()][2]);
    }
}
