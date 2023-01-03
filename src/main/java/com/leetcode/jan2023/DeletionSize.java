package com.leetcode.jan2023;

public class DeletionSize {

    public int minDeletionSize(String[] strs) {
        int len = strs.length;
        if(len==0){
            return 0;
        }
        int numDeleted =0;
        int strLength = strs[0].length();
        for(int i=0;i<strLength;i++){
            for(int j=1;j<len;j++){
                if((strs[j].charAt(i)-'a')<(strs[j-1].charAt(i)-'a')){
                    ++numDeleted;
                    break;
                }
            }
        }
        return numDeleted;
    }
}
