package LinkedList.medium;

import Recursion.Node;

public class SortLinkedList {

    public Node findMiddle(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public Node sort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find middle node using tortoise and hare.
        Node middle=findMiddle(head);
        Node leftHead=head;
        Node rightHead=middle.next;
        middle.next=null;

        leftHead=sort(leftHead);
        rightHead=sort(rightHead);
        return merge(leftHead,rightHead);
    }

    public Node merge(Node left,Node right){
        Node n1=left;
        Node n2=right;
        if(left==null){
            return null;
        }
        if(right==null){
            return null;
        }
        if(n1.data>n2.data){
            Node temp=n1;
            n1=n2;
            n2=temp;
        }
        Node res=n1;
        while(n1!=null && n2!=null){
            Node lastNode=n1;
            while(n1!=null && n1.data<=n2.data){
                lastNode=n1;
                n1=n1.next;
            }
            lastNode.next=n2;
            Node temp=n2;
            n2=n1;
            n1=temp;
        }



        return res;
    }

    public void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        SortLinkedList sort=new SortLinkedList();
        Node a=new Node(12);
        Node b=new Node(4);
        Node c=new Node(6);
        a.next=b;
        b.next=c;
        sort.print(sort.sort(a));
    }
}
