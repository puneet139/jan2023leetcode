package com.leetcode.jan2023;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LFUCache {

    Map<Integer,Integer> keyToValueMap ;
    Map<Integer,Integer> keyToCountMap;
    Map<Integer, LinkedHashSet<Integer>> countToLRUKeyMap;
    int capacity;
    int min = -1;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        keyToValueMap = new HashMap<>();
        keyToCountMap = new HashMap<>();
        countToLRUKeyMap = new HashMap<>();
    }

    public int get(int key) {
        if(!keyToValueMap.containsKey(key)){
            return -1;
        }

        int count = keyToCountMap.get(key);
        countToLRUKeyMap.get(count).remove(key);
        if(count==min && countToLRUKeyMap.get(count).size()==0){
            min++;
        }
        keyToCountMap.put(key,count+1);
        countToLRUKeyMap.computeIfAbsent(count+1,val -> new LinkedHashSet<Integer>());
        countToLRUKeyMap.get(count+1).add(key);
        return keyToValueMap.get(key);
    }

    public void put(int key, int value) {
        if(capacity<=0){
            return;
        }

        if(keyToValueMap.containsKey(key)){
            keyToValueMap.put(key,value);
            int count = keyToCountMap.get(key);
            countToLRUKeyMap.get(count).remove(key);
            if(count==min && countToLRUKeyMap.get(count).size()==0){
                min++;
            }
            keyToCountMap.put(key,count+1);
            countToLRUKeyMap.computeIfAbsent(count+1,val -> new LinkedHashSet<>());
            countToLRUKeyMap.get(count+1).add(key);
            return;
        }

        if(keyToValueMap.size()>=capacity){
            evict(countToLRUKeyMap.get(min).iterator().next());
        }

        min = 1;
        keyToValueMap.put(key,value);
        keyToCountMap.put(key,1);
        countToLRUKeyMap.computeIfAbsent(1,val -> new LinkedHashSet<>());
        countToLRUKeyMap.get(1).add(key);
    }

    private void evict(int key){
        countToLRUKeyMap.get(min).remove(key);
        keyToValueMap.remove(key);
    }
}
