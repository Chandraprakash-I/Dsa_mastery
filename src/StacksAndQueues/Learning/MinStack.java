package StacksAndQueues.Learning;

import java.util.Stack;

class Pair{
    int x;
    int y;
    Pair(int x){
        this.x=x;
    }

}
public class MinStack {

    Stack<Pair> s=new Stack<>();

    public void push(int element){
        Pair p=new Pair(element);
        if(s.isEmpty()){
            p.y=element;
            s.push(p);
        }else{
            p.y=Math.min(element,s.peek().y);
            s.push(p);
        }
    }
    public int pop(){
        if(s.isEmpty()){
         return -1;
        }
            return s.pop().x;

    }

    public void getMin(){
        if(!s.isEmpty()){
            System.out.println(s.peek().y);
        }
    }
    public static void main(String[] args) {
        MinStack m=new MinStack();
        m.push(3);
        m.push(-5);
        m.push(5);
        m.getMin();
        m.pop();
        m.pop();
        m.getMin();
    }
}
