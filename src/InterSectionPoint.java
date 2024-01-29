import Recursion.Node;

public class
InterSectionPoint {

    public void findInterSection(Node head,Node head2){
        Node a=head;
        Node b=head2;

        while(a!=b){
            a=(a==null)?head2:a.next;
            b=(b==null)?head:b.next;
        }
        System.out.println(a.data);
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

        Node a=new Node(2);
        Node b=two;
        Node c=new Node(6);
        a.next=b;
        b.next=c;

        InterSectionPoint i=new InterSectionPoint();
        i.findInterSection(one,a);
    }
}
