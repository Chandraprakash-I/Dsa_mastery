package Heap;
import java.util.*;
public class KthLargestSmallest {

    public static void brute(){
        int[] arr={5,3,2,4,1,6};
        int k=3;
        Arrays.sort(arr);
        System.out.println("largest num: "+arr[arr.length-1-(k-1)]);
        System.out.println("smalles num: "+arr[k-1]);
    }

    public static void main(String[] args) throws Exception{
        MaxHeap<Integer> mh=new MaxHeap<>();
        MinHeap<Integer> minHeap=new MinHeap<>();
        int[] arr={5,3,2,4,1,6};

        int k=3;
        for(int i=0; i<arr.length; i++){
            mh.insert(arr[i]);
            minHeap.insert(arr[i]);
        }
        //maxvalue
        for(int i=0; i<k-1; i++){
            mh.remove();
        }
        System.out.println("max value: "+mh.remove());

        //minvalue
        for(int i=0; i<k-1; i++){
            minHeap.remove();
        }
        System.out.println("min value: "+minHeap.remove());
    }
}
