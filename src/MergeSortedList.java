import Recursion.Node;

public class MergeSortedList {

    public void merge(Node n1, Node n2){
        if(n1==null){
            System.out.println(n2);
            return;
        }
        if(n2==null){
            System.out.println(n1);
            return;
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

            //swap n1 and n2
            Node t=n2;
            n2=n1;
            n1=t;
        }
        while(res!=null){
            System.out.print(res.data);
            res=res.next;
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

        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(6);
        a.next=b;
        b.next=c;

        MergeSortedList m =new MergeSortedList();
        m.merge(one,a);
    }
}
