package com.leetcode.jan2023;

public class MonotonicStringMinFlips {

    public int minFlipsMonoIncr(String s) {
        if(s.length()==1){
            return 0;
        }
        char[] charArray = s.toCharArray();
        int oneCount = 0;
        int flipCount = 0;

        for(int i =0;i<charArray.length;i++){
            if(charArray[i]=='0'){
                if(oneCount==0) continue;
                else{
                    flipCount++;
                }
            }else{
                oneCount++;
            }
            if(flipCount>oneCount){
                flipCount=oneCount;
            }
        }
        return flipCount;
    }
}
