package StacksAndQueues.Learning;
class Ll{
    public int data;
    public Ll next;
    Ll(int data){
        this.data=data;
        this.next=null;
    }
}
public class StackUsingLinkedList {
    public Ll head;
    public Ll stack;
    public int count=0;
    StackUsingLinkedList(){
        this.head=new Ll(-1);
    }
    public void push(int element){
        Ll newNode=new Ll(element);
        Ll temp=head;
        Ll next=temp.next;
        temp.next=newNode;
        newNode.next=next;
        count++;
        stack=temp.next;

    }

    public void pop(){
        if(count==0)return;
        head.next=stack.next;
        System.out.println(stack.data);
        stack=stack.next;
        count--;
    }

    public static void main(String[] args) {
        StackUsingLinkedList s=new StackUsingLinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
