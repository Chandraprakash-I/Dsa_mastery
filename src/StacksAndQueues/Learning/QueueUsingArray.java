package StacksAndQueues.Learning;

public class QueueUsingArray {
    public int[] arr;
    public int front=0;
    public int rear=0;
    public int count=0;
    QueueUsingArray(int size){
        arr=new int[size];
    }

    public void push(int element){
        if(count<arr.length){
            arr[rear%arr.length]=element;
            rear++;
            count++;
            return;
        }
       System.out.println("Queue is full");

    }

    public int pop(){
        if(count==0){
            System.out.println("nothing to pop");
            return -1;
        }
        int popped= arr[front%arr.length];
        arr[front%arr.length]=-1;
        count--;
        front++;
        return popped;
    }

    public int front(){
        if(count==0)return -1;
        return arr[front%arr.length];
    }

    public boolean isEmpty(){
        return count == 0;
    }
    public static void main(String[] args) {
        QueueUsingArray q=new QueueUsingArray(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.pop();
        q.push(6);
        q.pop();
        q.push(7);
        q.front();
        q.pop();
        q.push(8);

    }
}
