package com.leetcode.jan2023;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxPointsOnLine {

    public int maxPoints(int[][] points) {
        int n = points.length;
        if(n==1){
            return 1;
        }
        int result = 2;
        for(int i=0;i<points.length;i++){
            Map<Double,Integer> pointMap = new HashMap<>();
            for(int j=0;j<n;j++){
                if(j!=i){
                    pointMap.merge(Math.atan2(points[j][1]-points[i][1],points[j][0]-points[i][0]),1,Integer::sum);
                }
            }
            result = Math.max(result, Collections.max(pointMap.values())+1);
        }
        return result;
    }
}
