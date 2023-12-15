package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum2 {

    public void find(int index,int[] arr,int target,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> list){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index; i<arr.length; i++){
            if(i!=index && arr[i]==arr[i-1])continue;
            if(arr[i]>target)break;
            list.add(arr[i]);
            find(i+1,arr,target-arr[i],ans,list);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        CombinationSum2 c=new CombinationSum2();
        int[] arr=new int[]{10,1,2,7,6,1,5};
        Arrays.sort(arr);
        int target=8;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        c.find(0,arr,target,ans,list);
        for(ArrayList<Integer> a: ans){
            System.out.print(a);
        }
    }
}
