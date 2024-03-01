package Recursion.basic;

import java.util.Stack;

public class ReverseStack
{
    public Stack<Integer> popInsert(Stack<Integer> s,int n){
        if(s.isEmpty()){
            s.push(n);
            return s;
        }
        int temp=s.pop();
        popInsert(s,n);
        s.push(temp);
        return s;
    }
    public Stack<Integer> reverse(Stack<Integer> s,int n){
        if(s.isEmpty()){
            return popInsert(s,n);

        }
        int temp=s.pop();
        reverse(s,temp);
        popInsert(s,n);
        return s;

    }
    public static void main(String[] args) {
        ReverseStack rev=new ReverseStack();
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        rev.reverse(s,0);
        while(s.size()!=1){
            System.out.println(s.pop());
        }
    }
}
