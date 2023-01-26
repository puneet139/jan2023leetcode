package com.leetcode.jan2023;

import java.util.Arrays;

public class CheapestFlightWithKStops {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;
        for(int i=0;i<=k;i++){
            int[] tmp = Arrays.copyOf(dist,n);
            for(int[] flight:flights){
                if(dist[flight[0]]!=Integer.MAX_VALUE){
                    tmp[flight[1]] = Math.min(tmp[flight[1]],dist[flight[0]]+flight[2]);
                }

            }
            dist = tmp;
        }
        return (dist[dst]==Integer.MAX_VALUE)?-1:dist[dst];
    }

}
