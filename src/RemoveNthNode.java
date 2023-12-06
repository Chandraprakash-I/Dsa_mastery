import Recursion.Node;

public class RemoveNthNode {
    //from end of linked list
    public void remove(Node head,int n){
        Node start=new Node(0);
        Node fast=start;
        Node slow=start;
        start.next=head;

        int i=1;
        while(i<=n){
            fast=fast.next;
            i++;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        start=start.next;
        while(start!=null){
            System.out.println(start.data);
            start=start.next;
        }
    }
    public static void main(String[] args) {
        Node one=new Node(1);
        Node two=new Node(3);
        Node three=new Node(5);
        Node four=new Node(7);
        Node five=new Node(8);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;

        RemoveNthNode r=new RemoveNthNode();
        r.remove(one,5);
    }
}
