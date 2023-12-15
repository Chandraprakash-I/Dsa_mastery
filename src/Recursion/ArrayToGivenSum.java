package Recursion;

import java.util.ArrayList;

public class ArrayToGivenSum {

    public void doIt(int index,int sum,int target,int[] arr,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans){
        if(index==arr.length){
            if(sum==target){
                ans.add(new ArrayList<>(list));
            }
          return;
        }
        //picking
        list.add(arr[index]);
        doIt(index+1,sum+arr[index],target,arr,list,ans);
        list.remove(list.size()-1);
        //not picking
        doIt(index+1,sum,target,arr,list,ans);
    }
    public static void main(String[] args) {
        ArrayToGivenSum a=new ArrayToGivenSum();
        int[] arr=new int[]{1,2,1};
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        a.doIt(0,0,2,arr,list,ans);
        for(ArrayList<Integer> c:ans){
            System.out.print(c);
        }
    }
}
