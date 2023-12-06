import Recursion.Node;

public class AddLinkedList {
    //given in reverse order

    public void add(Node one,Node a){
        Node dummy=new Node(0);
        Node temp=dummy;
        int sum=0;
        int carry=0;

        while(one!=null || a!=null || carry!=0){
            if(one!=null){
                sum+=one.data;
                one=one.next;
            }
            if(a!=null){
                sum+=a.data;
                a=a.next;
            }
            sum+=carry;
            carry=sum/10;
            temp.next=new Node(sum%10);
            temp=temp.next;
            sum=0;
        }
        dummy=dummy.next;
        while(dummy!=null){
            System.out.print(dummy.data);
            dummy=dummy.next;
        }
    }
    public static void main(String[] args) {
        Node one=new Node(1);
        Node two=new Node(3);
        Node three=new Node(5);
        one.next=two;
        two.next=three;

        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(6);
        a.next=b;
        b.next=c;
        AddLinkedList x=new AddLinkedList();
        x.add(one,a);
    }
}
