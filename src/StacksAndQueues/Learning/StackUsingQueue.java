package StacksAndQueues.Learning;

public class StackUsingQueue {
    public QueueUsingArray q1=new QueueUsingArray(3);
    public QueueUsingArray q2=new QueueUsingArray(3);

    public void push(int element){
        q2.push(element);
        while(!q1.isEmpty()){
            q2.push(q1.front());
            q1.pop();
        }
        QueueUsingArray temp=q1;
        q1=q2;
        q2=temp;
    }

    public int pop(){
        return q1.pop();
    }

    public static void main(String[] args) {
       StackUsingQueue s=new StackUsingQueue();
       s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());


    }
}
