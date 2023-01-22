package com.leetcode.jan2023;

import java.util.ArrayList;
import java.util.List;

public class PallindromePartitioning {

    public List<List<String>> partition(String s) {
        List<List<String>> answer = new ArrayList<>();
        if(s==null || s.length()==0){
            return answer;
        }
        List<String> step = new ArrayList<>();
        solve(s.length(),s,step,answer);
        return answer;
    }

    private void solve(int n, String s,List<String> step,List<List<String >> answer){
        if(n==0){
            answer.add(new ArrayList<>(step));
            return;
        }

        for(int i=1;i<=n;i++){
            String temp = s.substring(0,i);
            if(isPallindrome(temp)){
                step.add(temp);
                solve(n-i,s.substring(i,n),step,answer);
                step.remove(step.size()-1);
            }
        }
    }

    private boolean isPallindrome(String t){
        int start = 0;
        int end = t.length()-1;
        while(start<=end){
            if(t.charAt(start)!=t.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
