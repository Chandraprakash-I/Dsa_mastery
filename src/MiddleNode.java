import Recursion.Node;

public class MiddleNode {

    public void middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }

    public void delete(Node node){
        if(node==null)System.out.print("null node");
        node.data=node.next.data;
        node.next=node.next.next;
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
        MiddleNode m=new MiddleNode();
//        m.delete(three);
        m.middle(one);
    }
}
