package com.leetcode.jan2023;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        return (word.matches("[A-Z]+") || word.matches("[a-z]+") || word.matches("[A-Z][a-z]+"));
    }

}
