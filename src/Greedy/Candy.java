package Greedy;

import java.util.Arrays;

public class Candy {

    public static int findMinCandy(int[] arr){
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];

        Arrays.fill(left,1);
        Arrays.fill(right,1);

        for(int i=0; i<arr.length; i++ ){
            if(i>0){
                if(arr[i]>arr[i-1]){
                    left[i]=left[i-1]+1;
                }
            }
        }

        for(int i=arr.length-1; i>=0; i-- ){
            if(i<arr.length-1){
                if(arr[i]>arr[i+1]){
                    right[i]=right[i+1]+1;
                }
            }
        }
        int[] candy=new int[arr.length];
        Arrays.fill(candy,1);
        for(int i=0; i<left.length; i++){
            candy[i]=Math.max(left[i],right[i]);
        }
        int ans=0;
        for(int i:candy){
            ans+=i;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(findMinCandy(new int[]{1,2,2}));
    }
}
