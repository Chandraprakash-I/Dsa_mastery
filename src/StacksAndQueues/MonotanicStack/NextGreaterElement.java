package StacksAndQueues.MonotanicStack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public void find(int[] arr){
        Stack<Integer> stack=new Stack<>();

        int n=arr.length;
        int[] nge=new int[n];

        for(int i=(2*n)-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i%n]){
                stack.pop();
            }
            int temp=arr[i%n];
            if(!stack.isEmpty()){
                nge[i%n]=stack.peek();
            }else{
                nge[i%n]=-1;
            }
            stack.push(temp);
        }
        System.out.println(Arrays.toString(nge));
    }
    public static void main(String[] args) {
        NextGreaterElement n=new NextGreaterElement();
        n.find(new int[]{5,7,1,2,6,0});
    }
}
