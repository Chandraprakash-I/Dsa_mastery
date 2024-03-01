package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SumSubset {

    public void findSubset(int index, int[] arr,ArrayList<String> res, ArrayList<Integer> ans, int sum, int n){

        res.add(ans.toString());
        for(int i=index; i<arr.length; i++){
            if(i!=0 && arr[i]==arr[i-1]){
                continue;
            }
            ans.add(arr[i]);
            //picking
            findSubset(index+1,arr,res,ans,sum+arr[index],n);
            ans.remove(ans.size()-1);

        }


    }

    public static void main(String[] args) {
        SumSubset s=new SumSubset();
        ArrayList<String> res=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int[] arr=new int[]{1,2,2};
        Arrays.sort(arr);
        s.findSubset(0,arr, res,ans,0,3);
        System.out.println(res);


    }
}
