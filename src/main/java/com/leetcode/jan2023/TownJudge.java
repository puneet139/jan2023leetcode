package com.leetcode.jan2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TownJudge {

    public int findJudge(int n, int[][] trust) {
        if(n==1){
            return 1;
        }
        Map<Integer,Integer> trustMap = new HashMap<>();
        Map<Integer, List<Integer>> judgeMap = new HashMap<>();
        int townJudge = -1;

        for(int i=0;i<trust.length;i++){
            trustMap.put(trust[i][0],trust[i][1]);
            if(judgeMap.get(trust[i][1])!=null){
                List<Integer> followerList = judgeMap.get(trust[i][1]);
                followerList.add(trust[i][0]);
                judgeMap.put(trust[i][1],followerList);
            }else{
                List<Integer> followerList = new ArrayList<>();
                followerList.add(trust[i][0]);
                judgeMap.put(trust[i][1],followerList);
            }

        }

        for(int j=1;j<=n;j++){
            if(!trustMap.containsKey(j) && judgeMap.get(j)!=null && judgeMap.get(j).size()==(n-1)){
                townJudge = j;
                break;
            }
        }
        return townJudge;
    }
}
