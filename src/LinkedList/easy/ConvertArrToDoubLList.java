package LinkedList.easy;

import LinkedList.Node;

public class ConvertArrToDoubLList {

    public Node convert(int[] arr){
        Node head=new Node(arr[0]);
        Node prev=head;

        for(int i=1; i<arr.length; i++){
            Node newNode=new Node(arr[i]);
            prev.next=newNode;
            newNode.back=prev;
            prev=newNode;
        }
        return head;
    }

    public void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public Node reverse(Node head){
        Node current=head;
        Node previous=null;

        while(current!=null){
            current.back=current.next;
            current.next=previous;
            previous=current;
            current=current.back;
        }
        return previous;
    }
    public static void main(String[] args) {
        ConvertArrToDoubLList c=new ConvertArrToDoubLList();
        Node start=c.convert(new int[]{1,2});
        c.print(start);
        c.print(c.reverse(start));

    }
}
