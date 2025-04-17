package Greedy;

import java.util.Arrays;

public class InsertInterval {

    public static void insertInterval(int[][] intervals,int[] newInterval){
        int[][] ans=new int[intervals.length][];
        int i=0;
        //left
        while(i<intervals.length && newInterval[0]>intervals[i][1]){
                ans[i]=new int[2];
                ans[i][0]=intervals[i][0];
                ans[i][1]=intervals[i][1];
                i++;

        }
        //merge
        while(i<intervals.length && newInterval[1]>intervals[i][0]){

                newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
                newInterval[1]=Math.max(intervals[i][1],newInterval[1]);

            i++;
        }
        if(i-1<intervals.length){
            ans[i-1]=new int[2];
            ans[i-1][0]=newInterval[0];
            ans[i-1][1]=newInterval[1];
        }

        //right
        while(i<intervals.length){
            ans[i]=new int[2];
            ans[i][0]=intervals[i][0];
            ans[i][1]=intervals[i][1];
            i++;
        }
        System.out.println(Arrays.deepToString(ans));
    }
    public static void main(String[] args){

        int[][] interval={{1,3},{6,9}};
        int[] nInterval={2,5};
        insertInterval(interval,nInterval);
    }
}
