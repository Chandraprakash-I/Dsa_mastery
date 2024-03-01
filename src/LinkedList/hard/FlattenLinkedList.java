package LinkedList.hard;

import Recursion.Node;

public class FlattenLinkedList {

    public Node merge(Node h1,Node h2){
        Node res=new Node(-1);
        Node temp=res;
        while(h1!=null && h2!=null){
            if(h1.data<h2.data){
                temp.bottom=h1;
                h1=h1.bottom;
                temp=temp.bottom;
            }else{
                temp.bottom=h2;
                h2=h2.bottom;
                temp=temp.bottom;
            }


        }
        if(h1!=null){
            temp.bottom=h1;
        }else{
            temp.bottom=h2;
        }
        return res.bottom;

    }
    public Node flaten(Node head){
        if(head.next==null || head==null){
            return head;
        }
        head.next=flaten(head.next);
        head=merge(head,head.next);
        return head;
    }
    public static void main(String[] args) {
        Node one=new Node(1);
        Node two=new Node(0);
        Node three=new Node(3);

        Node a=new Node(5);
        Node b=new Node(2);
        Node c=new Node(3);

        one.next=two;
        one.bottom=a;
        two.next=three;
        two.bottom=b;
        three.bottom=c;


        FlattenLinkedList fl=new FlattenLinkedList();
        Node head=fl.flaten(one);
        while(head!=null){
            System.out.print(head.data);
            head=head.bottom;
        }
    }
}
