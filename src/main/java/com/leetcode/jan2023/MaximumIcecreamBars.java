package com.leetcode.jan2023;

import java.util.Arrays;

public class MaximumIcecreamBars {

    public int maxIceCream(int[] costs, int coins) {
        int maxBuy = 0;
        Arrays.sort(costs);
        int remainingCoins = coins;
        for(int i=0;i<costs.length;i++){
            if(remainingCoins>=costs[i]){
                maxBuy++;
                remainingCoins = remainingCoins - costs[i];
            }else{
                break;
            }
        }
        return maxBuy;
    }
}
