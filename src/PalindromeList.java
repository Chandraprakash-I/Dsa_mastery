import Recursion.Node;

public class PalindromeList {

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
    public void isPalindrome(Node one){
        Node slow=one;
        Node fast=one;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node sh=reverse(slow.next);
        while(sh!=null){
            if(sh.data != one.data){
                System.out.println("false");
                return ;
            }
            sh=sh.next;
            one=one.next;
        }
        System.out.println("true");
    }
    public static void main(String[] args) {
        Node one=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        Node four=new Node(2);
        Node five=new Node(1);
//        Node six=new Node(1);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
//        five.next=six;
        PalindromeList p=new PalindromeList();
        p.isPalindrome(one);
    }
}
