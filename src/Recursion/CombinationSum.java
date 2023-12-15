package Recursion;

import java.util.ArrayList;

public class CombinationSum {

    public void findCombination(int index,int[] arr,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> list,
                                int target){
            if(index==arr.length){
                if(target==0){
                    ans.add(new ArrayList<>(list));
                }
                return;
            }

            if(arr[index]<=target){
                list.add(arr[index]);
                findCombination(index,arr,ans,list,target-arr[index]);
                list.remove(list.size()-1);
            }

        findCombination(index+1,arr,ans,list,target);
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        CombinationSum cs=new CombinationSum();
        int[] arr=new int[]{2,3,6,7};
        cs.findCombination(0,arr,ans,list,7);
        for(ArrayList<Integer> i: ans){
            System.out.print(i);
        }
    }
}
