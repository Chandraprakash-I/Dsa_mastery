package Recursion.basic;

import java.util.Stack;

public class SortStack {

    public Stack<Integer> sortInserted(Stack<Integer> s,int n){
        if(s.isEmpty() || n>s.peek()){
            s.push(n);

        }
        if(n<s.peek()){
            int temp=s.pop();
            sortInserted(s,n);
            s.push(temp);
        }
        return s;
    }
    public Stack<Integer> sort(Stack<Integer> s,int n){
        if(s.isEmpty()){
            return sortInserted(s,n);

        }
        int t=s.pop();
        sort(s,t);
        return sortInserted(s,t);
    }
    public static void main(String[] args) {
        SortStack sa=new SortStack();
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);

        sa.sort(s,0);
        while(!s.isEmpty()){
            System.out.println(s.pop());

        }
    }
}
