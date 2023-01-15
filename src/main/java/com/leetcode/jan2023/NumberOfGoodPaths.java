package com.leetcode.jan2023;

import java.util.*;

public class NumberOfGoodPaths {

    static class UnionFindDs {
        int[] parent;
        int[] rank;

        UnionFindDs(int n){
            parent = new int[n];
            rank = new int[n];
            for(int i=0;i<n;i++){
                parent[i] = i;
            }
        }

        public int find(int u){
            if(parent[u]!=u){
                parent[u] = find(parent[u]);
            }
            return parent[u];
        }

        public void union(int x,int y){
            int xset = find(x);
            int yset = find(y);
            if(xset==yset){
                return ;
            }
            if(rank[xset]<rank[yset]){
                parent[xset] = y;
            }else if(rank[xset]>rank[yset]){
                parent[yset] = x;
            }else{
                parent[yset] = xset;
                rank[xset]++;
            }
        }
    }

    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        if(vals.length==1){
            return 1;
        }
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for(int j=0;j<edges.length;j++){
            int a = edges[j][0], b = edges[j][1];
            adj.computeIfAbsent(a, value -> new ArrayList<>()).add(b);
            adj.computeIfAbsent(b, value -> new ArrayList<>()).add(a);
        }
        TreeMap<Integer,List<Integer>> valueToNodesMap = new TreeMap<>();
        for(int i=0;i<vals.length;i++){
            valueToNodesMap.computeIfAbsent(vals[i],value-> new ArrayList<>()).add(i);
        }

        UnionFindDs uf = new UnionFindDs(vals.length);
        int goodpaths  = 0;
        for(Map.Entry<Integer,List<Integer>> entries:valueToNodesMap.entrySet()){
            int node = entries.getKey();
            List<Integer> nodesList = entries.getValue();

            for(int n:nodesList){
                if (!adj.containsKey(n))
                    continue;
                for(int neighbour:adj.get(n)){
                    if(vals[n]>=vals[neighbour]){
                        uf.union(n,neighbour);
                    }
                }
            }

            Map<Integer,Integer> groups = new HashMap<>();
            for(int ne:valueToNodesMap.get(node)){
                groups.put(uf.find(ne),groups.getOrDefault(uf.find(ne),0)+1);
            }

            for(int key:groups.keySet()){
                int size = groups.get(key);
                goodpaths += (size*(size+1)/2);
            }
        }

        return goodpaths;
    }
}
