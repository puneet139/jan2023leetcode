package com.leetcode.jan2023;

import java.util.ArrayList;
import java.util.List;

public class LongestPathWithDifferentAdjacentCharacter {

    int longestPath = 1;

    public int longestPath(int[] parent, String s) {
        int numVertices = parent.length;
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<numVertices;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=1;i<numVertices;i++){
            adjList.get(parent[i]).add(i);
        }
        boolean[] visited = new boolean[numVertices];
        dfs(0,adjList,visited,s);
        return longestPath;
    }


    private int dfs(int start,List<List<Integer>> adjList,boolean[] visited,String s){
        visited[start] = true;
        int longestChain = 0;
        int secondLongestChain = 0;

        for(int neighbour:adjList.get(start)){
            if(!visited[neighbour]){
                int longestChainFromChild = dfs(neighbour,adjList,visited,s);

                if(s.charAt(neighbour)==s.charAt(start)){
                    continue;
                }

                if(longestChainFromChild>longestChain){
                    secondLongestChain = longestChain;
                    longestChain = longestChainFromChild;
                }else if(longestChainFromChild>secondLongestChain){
                    secondLongestChain = longestChainFromChild;
                }
            }
        }
        longestPath = Math.max(longestPath, 1 + longestChain + secondLongestChain);
        return longestChain + 1;
    }
}
