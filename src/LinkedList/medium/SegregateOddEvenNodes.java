package LinkedList.medium;

import Recursion.Node;

public class SegregateOddEvenNodes {

    public void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public Node segregate(Node head){
        Node odd=head;
        Node even=head.next;
        Node evenHead=even;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
    public static void main(String[] args) {
        SegregateOddEvenNodes s=new SegregateOddEvenNodes();
        Node head=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
//        Node four=new Node(4);
        head.next=two;
        two.next=three;
//        three.next=four;

        s.print(s.segregate(head));
    }
}
