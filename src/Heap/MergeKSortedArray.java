package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Element{
    int value;
    int row;
    int col;
    Element(int value,int row,int col){
        this.value=value;
        this.row=row;
        this.col=col;
    }
}

public class MergeKSortedArray {

    public void bruteForce(){

    }

    public void moreOptimal(int[][] arr,int k){
        PriorityQueue<Element> queue=new PriorityQueue<>((a,b)->a.value-b.value);

        for(int i=0; i<arr.length; i++){
            queue.add(new Element(arr[i][0],i,0));
        }
        ArrayList<Integer> list=new ArrayList<>();
        while (!queue.isEmpty()){
            Element temp=queue.remove();
            list.add(temp.value);

            int next=temp.col+1;

            if(next<arr[temp.row].length){
                queue.add(new Element(arr[temp.row][next], temp.row, next));
            }
        }
        System.out.println(list.toString());
    }
    public void optimal(int[][] arr,int k){
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        int size=k*k;
        for(int i=0; i<arr.length; i++ ){
            for(int j=0; j<arr[i].length; j++){
                queue.add(arr[i][j]);
            }
        }
        int[] ans=new int[size];
        int index=0;
        while(!queue.isEmpty()){
            ans[index++]= queue.remove();
        }
    System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        MergeKSortedArray m=new MergeKSortedArray();
        m.moreOptimal(arr,3);
    }
}
