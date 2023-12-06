import Recursion.Node;

public class DetectCycle {

    public void detectCycle(Node head){
        if(head==null)return;
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                System.out.println(fast.data);
                break;
            }
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
        five.next=one;

        DetectCycle c=new DetectCycle();
        c.detectCycle(one);
    }
}
