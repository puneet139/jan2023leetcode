package com.leetcode.jan2023;

public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int gasSurplus = 0;
        int start = 0;
        int totalGasSurplus = 0;

        for(int i=0;i<n;i++){
            totalGasSurplus +=  gas[i] - cost[i];
            gasSurplus += gas[i] - cost[i];
            if(gasSurplus < 0){
                gasSurplus = 0;
                start = i+1;
            }
        }
        return (totalGasSurplus<0)?-1:start;
    }
}
