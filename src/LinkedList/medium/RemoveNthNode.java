package LinkedList.medium;

import Recursion.Node;

public class RemoveNthNode {
    //from end of linked list
    public void remove(Node head,int n){
        Node start=new Node(0);
        Node fast=start;
        Node slow=start;
        start.next=head;

        int i=1;
        while(i<=n){
            fast=fast.next;
            i++;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        start=start.next;
        while(start!=null){
            System.out.println(start.data);
            start=start.next;
        }
    }
    public Node bruteForce(Node head,int n){


        if (head == null || n <= 0) {
            return null; // Handle invalid input or edge cases
        }

        Node temp=head;
        int length=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        System.out.println("length : "+length);
        if(n>length){
            return null;
        }
        int cnt=length-n-1;
        temp=head;
        System.out.println("count: "+cnt);
        while(cnt>0){
            cnt--;
            temp=temp.next;
        }
        Node ans=temp.next;
        temp.next=temp.next.next;
        return head;
    }

    public void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node one=new Node(1);
        Node two=new Node(3);
        Node three=new Node(5);
        Node four=new Node(7);
        Node five=new Node(8);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;

        RemoveNthNode r=new RemoveNthNode();
        r.print(r.bruteForce(one,3));
    }
}
