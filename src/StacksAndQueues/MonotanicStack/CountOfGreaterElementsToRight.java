package StacksAndQueues.MonotanicStack;

import java.util.Arrays;
import java.util.Stack;

public class CountOfGreaterElementsToRight {

    public void find(int[] arr,int[] q){
        Stack<Integer> stack=new Stack<>();
        int n=arr.length;
        int[] ans=new int[n];
        int pc=0;
        for(int i=n-1; i>=0; i--){
            int temp=arr[i];
            while(!stack.isEmpty() && stack.peek()>temp){
                stack.pop();
                pc++;
            }
            arr[i]=pc;
            stack.push(temp);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        CountOfGreaterElementsToRight c=new CountOfGreaterElementsToRight();
        int[] q=new int[]{0,1};
        int[] arr=new int[]{5, 2, 10, 4};
        c.find(arr,q);
    }
}
