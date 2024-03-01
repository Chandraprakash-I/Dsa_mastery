package LinkedList.DLL;

public class RemoveDuplicates {

    public Node remove(Node head){
        Node distinct=head;
        Node temp=head.next;
        while(temp!=null){
            if(temp.val== distinct.val){
                temp=temp.next;
                continue;
            }
            distinct.next=temp;
            temp.prev=distinct;
            distinct=temp;
            temp=temp.next;
        }
        return head;
    }

    public void print(Node head){
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        RemoveDuplicates r=new RemoveDuplicates();
        Node one=new Node(1);
        Node two=new Node(2);
        Node three=new Node(2);
        Node four=new Node(4);
        one.next=two;
        two.next=three;
        three.next=four;
        two.prev=one;
        three.prev=two;
        four.prev=three;
        r.print(r.remove(one));
    }
}
