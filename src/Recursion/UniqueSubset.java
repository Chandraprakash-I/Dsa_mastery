package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueSubset {

    public void findUnique(int index, int[] arr,ArrayList<ArrayList<Integer>> ans,
                           ArrayList<Integer> list){
        ans.add(new ArrayList<>(list));
        for(int i=index; i<arr.length; i++){
            if(i!=index && arr[i]==arr[i-1])continue;
            list.add(arr[i]);
            findUnique(i+1,arr,ans,list);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        UniqueSubset u=new UniqueSubset();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr=new int[]{1,2,2};
        Arrays.sort(arr);
        u.findUnique(0,arr,ans,list);
        for(ArrayList<Integer> a:ans){
            System.out.print(a);
        }
    }
}
