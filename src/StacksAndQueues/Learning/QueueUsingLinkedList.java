package StacksAndQueues.Learning;


public class QueueUsingLinkedList {
    public Ll head;
    public Ll q;
    public Ll last;
    public int count=0;
    QueueUsingLinkedList() {
        this.head=new Ll(-1);
    }
    public void push(int element){
        Ll newNode=new Ll(element);
        Ll temp=head;
        if(count==0){
            temp.next=newNode;
            last=temp.next;
            q=newNode;
        }else{

            last.next=newNode;
            last=newNode;
        }
        count++;

    }

    public void pop(){
        if(count==0)return;
        head.next=q.next;
        System.out.println(q.data);
        q=q.next;
        count--;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList  s=new QueueUsingLinkedList ();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
