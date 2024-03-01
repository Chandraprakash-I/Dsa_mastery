package Recursion.patterns;

import java.util.ArrayList;

public class CombinationSum {

    public void find(int[] arr, int target, int index, ArrayList<Integer> ans,
                     ArrayList<ArrayList<Integer>> res){
        if(target<0){
            return;
        }
        if(target==0 || index==arr.length){
            if(target==0){
                System.out.println(ans);
                res.add(new ArrayList<>(ans));
            }

            return;
        }
        //pick
        ans.add(arr[index]);
        find(arr,target-arr[index],index,ans,res);
        ans.remove(ans.size()-1);
        //not pick
        find(arr,target,index+1,ans,res);
    }
    public static void main(String[] args) {
        CombinationSum c=new CombinationSum();
        c.find(new int[]{2,3,6,7},7,0,new ArrayList<>(),new ArrayList<>());
    }
}
