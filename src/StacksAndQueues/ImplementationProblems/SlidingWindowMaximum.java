package StacksAndQueues.ImplementationProblems;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {

    public void find(int[] arr,int k){
        Deque<Integer> deque=new ArrayDeque<>();
        int[] ans=new int[arr.length-k+1];
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(!deque.isEmpty() && deque.peekFirst()==i-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && arr[deque.peek()]<arr[i]){
                deque.pop();
            }
            deque.offer(i);
            if(i>=k-1){
               ans[index++]=arr[deque.peekFirst()];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        SlidingWindowMaximum s=new SlidingWindowMaximum();
        s.find(new int[]{3, 4, -1, 1, 5},3);
    }
}
