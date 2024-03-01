package LinkedList.medium;
import Recursion.Node;
public class DeleteMiddleNode {

    public int delete(Node head){
        Node slow=head;
        Node fast=head;
        Node prev=slow;
        while(fast.next!=null && fast.next.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=prev.next.next;
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
        return prev.data;
    }
    public static void main(String[] args) {
        DeleteMiddleNode d=new DeleteMiddleNode();
        Node one=new Recursion.Node(1);
        Recursion.Node two=new Recursion.Node(3);
        Recursion.Node three=new Recursion.Node(5);
        Recursion.Node four=new Recursion.Node(7);
        Recursion.Node five=new Recursion.Node(8);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        System.out.println(d.delete(one));
    }
}
