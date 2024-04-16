package StacksAndQueues.MonotanicStack;

import java.util.Arrays;
import java.util.Stack;

public class LargestHistogram {

    public void find(int[] arr){
        int[] leftSmall=new int[arr.length];
        int[] rightSmall=new int[arr.length];

        Stack<Integer> stack=new Stack<>();

        for(int i=0; i<arr.length; i++){

            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                leftSmall[i]=stack.peek()+1;
            }else{
                leftSmall[i]=0;
            }

            stack.push(i);
        }
        System.out.println(Arrays.toString(leftSmall));
        stack.clear();

        for(int i=arr.length-1; i>=0; i--){
            while (!stack.isEmpty()&& arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                rightSmall[i]=stack.peek()-1;

            }else{
                rightSmall[i]=rightSmall.length-1;

            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(rightSmall));

        int max=-1;
        for(int i=0; i<arr.length; i++){
            max=Math.max(max,arr[i]*(rightSmall[i]-leftSmall[i]+1));
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        LargestHistogram l=new LargestHistogram();
        l.find(new int[]{1, 0, 1, 2, 2 ,2 ,2, 1, 0, 2 });
    }
}
