package LinkedList.hard;

import Recursion.Node;

public class RotateLinkList {

    public void rotate(Node head,int k){
        int length=0;
        Node temp=head;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        length++;
        temp.next=head;


        int rotation=length-(k%length);
        while(rotation>0){
            temp=temp.next;
            rotation--;
        }
        head=temp.next;
        temp.next=null;

        while(head!=null){
            System.out.print(head.data);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node one=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);

        one.next=two;
        two.next=three;


        RotateLinkList r=new RotateLinkList();
        r.rotate(one,5);
    }
}
