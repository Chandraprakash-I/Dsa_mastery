package LinkedList.medium;

import Recursion.Node;

public class SortZOT {

    public Node sort(Node head){
        Node one=new Node(-1);
        Node two=new Node(-1);
        Node zero=new Node(-1);

        Node otemp=one;
        Node ttemp=two;
        Node ztemp=zero;

        Node temp=head;

        while(temp!=null){
            if(temp.data==0){
                ztemp.next=temp;
                ztemp=ztemp.next;
            }else if(temp.data==1){
                otemp.next=temp;
                otemp=otemp.next;
            }else{
                ttemp.next=temp;
                ttemp=ttemp.next;
            }
            temp=temp.next;
        }
            ttemp.next=null;
            otemp.next=null;
            ztemp.next=null;

        if(one.next!=null){
            ztemp.next=one.next;
            ztemp=otemp;
            if(two.next!=null){
                ztemp.next=two.next;
            }
        }else{
            ztemp.next=two.next;
        }
        return zero.next;
    }
    public void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        SortZOT s=new SortZOT();
        Node a=new Node(2);
        Node b=new Node(0);
        Node c=new Node(1);
        a.next=b;
        b.next=c;
        s.print(s.sort(a));
    }
}
