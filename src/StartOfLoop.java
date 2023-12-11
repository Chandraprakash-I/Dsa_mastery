import Recursion.Node;

public class StartOfLoop {

    public void detectStart(Node head){
        Node slow=head;
        Node fast=head;
        Node entry=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        int count=0;
        while(entry!=slow){
            entry=entry.next;
            slow=slow.next;
            count++;
        }

        System.out.println(entry.data);
        System.out.println(count);
    }
    public static void main(String[] args) {

        Node one=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        Node four=new Node(4);
        Node five=new Node(5);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=one;

        StartOfLoop s=new StartOfLoop();
        s.detectStart(one);
    }
}
