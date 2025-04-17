package Recursion.patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SubSetTwo {

    public static HashSet<String> getSubSetsUnique(int[] arr, int index, ArrayList<Integer> list, HashSet<String> res){
        if(index==arr.length)
        {
            Collections.sort(list);
            res.add(list.toString());
            return res;
        }
        list.add(arr[index]);
        getSubSetsUnique(arr,index+1,list,res);
        list.remove(list.size()-1);
        getSubSetsUnique(arr,index+1,list,res);
        return res;
    }


    public static  void main(String[] args){
        int[] arr=new int[]{1,2,2};
        HashSet<String> list=getSubSetsUnique(arr,0,new ArrayList<>(),new HashSet<>());
        for(String s:list){
            System.out.println(s);
        }
    }
}
