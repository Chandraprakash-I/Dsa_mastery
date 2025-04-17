package Greedy;

import java.util.Arrays;

public class SJF {

    public static double findAverage(int[] arr){
        double atime=0;
        double weightTime=0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){

            weightTime+=arr[i];
            atime+=weightTime;
        }
        atime=(double)atime/arr.length;
        return atime;
    }
    public static void main(String[] args){
        int[] arr={4, 3, 7, 1, 2};
        System.out.println(findAverage(arr));
    }
}
