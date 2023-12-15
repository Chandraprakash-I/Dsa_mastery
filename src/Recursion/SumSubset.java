package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SumSubset {

    public void findSubset(int index, int[] arr, ArrayList<Integer> ans, int sum, int n){
        if(index==n){
            ans.add(sum);
            return;
        }
        //picking
        findSubset(index+1,arr,ans,sum+arr[index],n);
        //not picking
        findSubset(index+1,arr,ans,sum,n);
    }
    public static void main(String[] args) {
        SumSubset s=new SumSubset();
        ArrayList<Integer> ans=new ArrayList<>();
        s.findSubset(0,new int[]{5,2,1}, ans,0,3);
        Collections.sort(ans);

        System.out.print(ans+" ");

    }
}
