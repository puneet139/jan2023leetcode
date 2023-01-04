package com.leetcode.jan2023;

import java.util.HashMap;
import java.util.Map;

public class MinimumRounds {

    public int minimumRounds(int[] tasks) {
        if(tasks==null || tasks.length==0 || tasks.length==1){
            return -1;
        }
        int count = 0;
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            if(countMap.get(tasks[i])==null){
                countMap.put(tasks[i],1);
            }else {
                countMap.put(tasks[i],countMap.get(tasks[i])+1);
            }
        }

        for(Map.Entry<Integer,Integer> entries:countMap.entrySet()){
            if(entries.getValue()<2){
                return -1;
            }
            if(entries.getValue()==2){
                count += 1;
            }else if(entries.getValue()%3==0){
                count += entries.getValue()/3;
            }else if(entries.getValue()%3==1 || entries.getValue()%3==2){
                count += entries.getValue()/3 + 1;
            }
        }
        return count;
    }
}
