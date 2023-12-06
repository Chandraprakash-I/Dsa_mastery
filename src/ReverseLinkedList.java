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
    public static void main(String[] args) {
        Node head=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        head.next=two;
        two.next=three;
        ReverseLinkedList r=new ReverseLinkedList();
        r.reverse(head);

    }
}
