package Recursion.patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CombinationSumII {

    public HashSet<ArrayList<Integer>> find(int[] arr, int target, int index, ArrayList<Integer> ans
            , HashSet<ArrayList<Integer>> res){
        if(target<0){
            return res;
        }
        if(target==0 || index==arr.length){
            if(target==0){

                Collections.sort(ans);
                res.add(new ArrayList<>(ans));
            }
            return res;
        }
        ans.add(arr[index]);
        find(arr,target-arr[index],index+1,ans,res);
        ans.remove(ans.size()-1);
        find(arr,target,index+1,ans,res);
        return res;
    }
    public static void main(String[] args) {
        CombinationSumII c=new CombinationSumII();
        HashSet<ArrayList<Integer>> a=c.find(new int[]{10,1,2,7,6,1,5},8,0,new ArrayList<>(),new HashSet<>());
        for(ArrayList<Integer> u: a){
            System.out.println(u);
        }
    }
}
