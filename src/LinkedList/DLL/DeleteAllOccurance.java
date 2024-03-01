package LinkedList.DLL;

class Node {
    int val;
    Node next;
  Node prev;
    Node(int value) {
        val = value;
        next = null;
        prev = null;
    }
}
class DeleteAllOccurance {

    public Node delete(Node head,int key){
        Node temp=head;

        while(temp!=null){

            if(temp.val==key){
                Node prev=temp.prev;
                Node next=temp.next;
                if(temp==head){
                    head=temp.next;
                }
                if(prev!=null){
                    prev.next=next;
                }
                if(next!=null){
                    next.prev=prev;
                }
                temp=next;
            }else{
                temp=temp.next;
            }
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
        DeleteAllOccurance d=new DeleteAllOccurance();
        Node one=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        Node four=new Node(4);
        one.next=two;
        two.next=three;
        three.next=four;
        two.prev=one;
        three.prev=two;
        four.prev=three;
        d.print(d.delete(one,3));
    }
}
