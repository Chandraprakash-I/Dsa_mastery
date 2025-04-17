package Recursion.patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum {

    public static List<Integer> findSubset(int[] arr,int sum,List<Integer> res,int n){
        if(arr.length==n){
            res.add(sum);
            return res;
        }

            findSubset(arr,sum+arr[n],res,n+1);
            findSubset(arr,sum,res,n+1);

        return res;
    }
    public static void main(String[] args){

        ArrayList<Integer> ans=new ArrayList<>();
        int[] arr=new int[]{1,2,2};

        findSubset(arr,0,ans,0);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
