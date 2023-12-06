import Recursion.Node;

public class ReverseNodeKgroup {

    public Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        return prev;
    }
    public Node kthNode(Node head,int k){
        k=k-1;
        while(k>0 && head!=null){
            head=head.next;
            k--;
        }
        return head;
    }
    public void reverseKgroup(Node head,int k){
        Node prevNode=null;
        Node temp=head;
        Node kthNode=null;
        Node nextNode=null;

        while(temp!=null){
            kthNode=kthNode(temp,k);

            if(kthNode==null){
                if(prevNode!=null)prevNode.next=temp;
                break;
            }

            nextNode=kthNode.next;
            kthNode.next=null;
            reverse(temp);

            if(temp==head){
                head=kthNode;
            }else{
                prevNode.next=kthNode;
            }

            prevNode=temp;
            temp=nextNode;
        }
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
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


        ReverseNodeKgroup r=new ReverseNodeKgroup();
        r.reverseKgroup(one,2);

    }
}
