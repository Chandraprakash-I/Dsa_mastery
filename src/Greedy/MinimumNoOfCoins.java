package Greedy;

import java.util.ArrayList;

public class MinimumNoOfCoins {

    public static int findMinCoinCount(int[] arr,int value){

        int cValue=0;
        int count=0;
        for(int i=arr.length-1; i>=0; i--){

            while(arr[i]+cValue<=value){
                count++;
                cValue+=arr[i];
                if(cValue==value){
                    return count;
                }
            }

        }
        return count;
    }
    public static void main(String[] args){
        ArrayList< Integer > ans = new ArrayList < > ();
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};

        System.out.println(findMinCoinCount(coins,121));
    }
}
