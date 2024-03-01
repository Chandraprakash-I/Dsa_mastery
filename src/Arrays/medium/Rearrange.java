package Arrays.medium;

import java.util.*;
import java.util.Collections;

public class Rearrange {

    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public ArrayList<Integer> rearrange(int[] arr){

        int posIndex=0;
        int negIndex=1;
        ArrayList<Integer> a=new ArrayList<>(Collections.nCopies(arr.length,0));
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
               a.set(posIndex,arr[i]);
                posIndex+=2;
            }else{
                a.set(negIndex,arr[i]);
                negIndex+=2;
            }

        }
        return a;
    }
    public static void main(String[] args) {
        Rearrange r=new Rearrange();
        System.out.println(r.rearrange(new int[]{-1,-2,1,3}));

    }
}
