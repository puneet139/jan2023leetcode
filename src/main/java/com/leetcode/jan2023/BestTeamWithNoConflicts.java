package com.leetcode.jan2023;

import java.util.Arrays;

public class BestTeamWithNoConflicts {

    public int bestTeamScore(int[] scores, int[] ages) {
        int len = scores.length;
        int[][] teams = new int[len][2];

        for(int i=0;i<ages.length;i++){
            teams[i][0] = ages[i];
            teams[i][1] = scores[i];
        }

        Arrays.sort(teams, (a, b) -> (a[0]!=b[0])?a[0]-b[0]:a[1]-b[1]);
        int[] dp = new int[len];
        int best = 0;
        dp[0] = teams[0][1];
        for(int i=1;i<scores.length;i++){
            int max = teams[i][1];
            for(int j=0;j<i;j++){
                if(teams[i][1]>=teams[j][1]){
                    max = Math.max(max,teams[i][1]+dp[j]);
                }
            }
            dp[i]=max;
        }
        for(int num:dp){
            best = Math.max(num,best);
        }
        return best;
    }

}
