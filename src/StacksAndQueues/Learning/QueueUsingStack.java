package StacksAndQueues.Learning;

import java.util.Stack;

public class QueueUsingStack {

    public Stack<Integer> input=new Stack<>();
    public Stack<Integer> output=new Stack<>();

    public void push(int element){

        while(!input.isEmpty()){
            output.push(input.peek());
            input.pop();
        }
        input.push(element);
        while(!output.isEmpty()){
            input.push(output.peek());
            output.pop();
        }
    }

    public int pop(){
        if(!input.isEmpty()){
            return input.pop();
        }
        return -1;
    }

    public static void main(String[] args) {
        QueueUsingStack q=new QueueUsingStack();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.pop());
    }

}
