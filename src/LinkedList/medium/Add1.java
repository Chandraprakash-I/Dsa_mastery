package LinkedList.medium;

import Recursion.Node;

public class Add1 {

    public Node reverse(Node head){
        Node current=head;
        Node prev=null;
        while(current!=null){
            Node next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        return prev;
    }
    public Node iterative(Node head){
        head=reverse(head);
        Node temp=head;
        int carry=1;
        while(temp!=null){
            temp.data=temp.data+carry;
            if(temp.data<10){
                carry=0;
                break;
            }else{
                temp.data=0;
                carry=1;
            }
            temp=temp.next;
        }
        head=reverse(head);
        if(carry==1){
            Node newNode=new Node(1);
            newNode.next=head;
            return newNode;
        }
        return head;
    }

    public void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    public int helper(Node head){
        if(head==null){
            return 1;
        }
        int carry=helper(head.next);
        head.data=head.data+carry;
        if(head.data<10){
            return 0;
        }else{
            head.data=0;
        }

        return 1;
    }
    public Node recursive(Node head){
        int carry=helper(head);
        if(carry==1){
            Node newNode=new Node(1);
            newNode.next=head;
            return newNode;
        }
        return head;
    }
    public static void main(String[] args) {
        Add1 a=new Add1();
        Node one=new Node(1);
        Node two=new Node(5);
        Node three=new Node(9);
        Node four=new Node(9);
        Node five=new Node(9);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        a.print(a.recursive(one));
    }
}
