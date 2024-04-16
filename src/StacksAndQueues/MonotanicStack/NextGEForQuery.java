package StacksAndQueues.MonotanicStack;

import java.util.Arrays;

public class NextGEForQuery {

    public void find(int[] arr,int[] q){
        int[] ans=new int[q.length];
        for(int i=0; i<q.length; i++){
            int qi=q[i];
            int count=0;
            for(int j=qi+1; j<arr.length; j++){
                if(arr[j]>arr[qi]){
                    count++;
                }
            }
            ans[i]=count;
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        NextGEForQuery nge=new NextGEForQuery();
        nge.find(new int[]{5,2,10,4},new int[]{0,1});
    }
}
