package com.leetcode.jan2023;

import java.util.ArrayList;
import java.util.List;

public class GenerateIpAddresses {

    public List<String> restoreIpAddresses(String s) {
        List<String> answer = new ArrayList<>();
        if(s.length()<4){
            return answer;
        }
        generateIpAddresses(0,s,answer,"",0);
        return answer;
    }

    private void generateIpAddresses(int start,String s,List<String> answer,String str,int count){
        if(count>4){
            return;
        }
        if(count==4 && start==s.length()){
            answer.add(str);
        }
        for(int i=1;i<4;i++){
            if((start + i)>s.length()) break;
            String sb = s.substring(start,start+i);
            if((sb.charAt(0)=='0' && sb.length()>1) || (i==3 && Integer.parseInt(sb)>=256)){
                continue;
            }
            generateIpAddresses(start+i,s,answer,str+sb+((count==3)?"":"."),count+1);
        }
    }
}
