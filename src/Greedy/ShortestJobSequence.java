package Greedy;

import java.util.Arrays;

public class ShortestJobSequence {

    public static int findAverageWaitTime(int[] arr){
        Arrays.sort(arr);
        int time=0; int weightTime=0;
        for (int i=0; i<arr.length; i++)
        {
            weightTime+=time;
            time+=arr[i];
        }
        return (int) Math.floor(weightTime/arr.length);
    }
    public static void main (String[] args){
        System.out.println(findAverageWaitTime(new int[]{4,3,7,1,2}));
    }

}
