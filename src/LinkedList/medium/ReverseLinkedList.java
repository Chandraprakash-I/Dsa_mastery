package LinkedList.medium;

import Recursion.Node;

public class ReverseLinkedList {

    public void reverse(Node head){
        Node prev=null;

        while(head!=null){
            Node next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        while(prev!=null){
            System.out.print(prev.data);
            prev=prev.next;
        }
    }
    public void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public Node reverseRecursively(Node current,Node previous){
        if(current==null)return previous;
        Node next=current.next;
        current.next=previous;
        return reverseRecursively(next,current);
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        head.next=two;
        two.next=three;
        ReverseLinkedList r=new ReverseLinkedList();
        r.print(r.reverseRecursively(head,null));

    }
}
