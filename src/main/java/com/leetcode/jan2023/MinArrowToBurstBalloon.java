package com.leetcode.jan2023;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinArrowToBurstBalloon {

    class Balloon{

        int start;
        int end;

        Balloon(int s, int e){
            start = s;
            end = e;
        }

        public int getStart(){
            return start;
        }

        public int getEnd(){
            return end;
        }

    }

    class BalloonSorter implements Comparator<Balloon> {
        public int compare(Balloon a, Balloon b)
        {
            return Integer.compare(a.end,b.end);
        }
    }


    public int findMinArrowShots(int[][] points) {
        List<Balloon> balloonList = new ArrayList<>();
        for (int[] point : points) {
            balloonList.add(new Balloon(point[0], point[1]));
        }

        balloonList.sort(new BalloonSorter());
        int minShots = 1;
        int endTime = balloonList.get(0).getEnd();
        for(int j=1;j<balloonList.size();j++){
            if(balloonList.get(j).getStart()>endTime){
                minShots++;
                endTime = balloonList.get(j).getEnd();
            }
        }
        return minShots;
    }
}
