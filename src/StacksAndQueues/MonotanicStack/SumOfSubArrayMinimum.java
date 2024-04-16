package StacksAndQueues.MonotanicStack;

import java.util.*;

class value{
    int first;
    int second;

    value(int value,int count){
        this.first=value;
        this.second=count;
    }
}
public class SumOfSubArrayMinimum {


    public void find(int[]arr){
        Stack<value> stack=new Stack<>();
        int res=0;
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];

        for(int i=0; i<arr.length; i++){
            int cnt=1;
            value v=new value(arr[i],cnt);
            while(!stack.isEmpty() && stack.peek().first>arr[i]){
              v= new value(arr[i],stack.peek().second+cnt);
               cnt+=stack.peek().second;
               stack.pop();
            }
           stack.push(v);
            left[i]=cnt;
        }
        stack.clear();
        for(int i=arr.length-1; i>=0; i--){
            int cnt=1;
            value v=new value(arr[i],cnt);
            while(!stack.isEmpty() && stack.peek().first>arr[i]){
                v=new value(arr[i],stack.peek().second+cnt);
                cnt+=stack.peek().second;
                stack.pop();
            }
            stack.push(v);
            right[i]=cnt;
        }


        for(int i=0; i<arr.length; i++){
            res+=arr[i]*left[i]*right[i];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println(res);
    }
    public static void main(String[] args) {
        SumOfSubArrayMinimum s=new SumOfSubArrayMinimum();
        s.find(new int[]{1 ,5, 3});
    }
}
