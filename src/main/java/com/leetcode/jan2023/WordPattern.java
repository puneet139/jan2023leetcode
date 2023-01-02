package com.leetcode.jan2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> wordMap = new HashMap<>();
        List<String> seen = new ArrayList<>();
        int start = 0;
        String[] sArray = s.split(" ");
        if(sArray.length!=pattern.length()){
            return false;
        }
        if(pattern.length()==1 && s.length()==1){
            return true;
        }

        while(start!=sArray.length){
            if(wordMap.get(pattern.charAt(start))==null){
                if(seen.contains(sArray[start])){
                    return false;
                }else{
                    wordMap.put(pattern.charAt(start),sArray[start]);
                    seen.add(sArray[start]);
                }

            }else if(!wordMap.get(pattern.charAt(start)).equals(sArray[start])){
                return false;
            }
            start++;
        }
        return true;
    }
}
