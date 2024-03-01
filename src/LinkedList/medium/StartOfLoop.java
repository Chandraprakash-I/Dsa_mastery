package LinkedList.medium;

import Recursion.Node;

import java.util.HashMap;

public class StartOfLoop {

    public int findLength(Node fast,Node slow){

        int count=1;
        fast=fast.next;
        while(fast!=slow){
            fast=fast.next;
            count++;
        }
        return count;
    }
    public int detectStart(Node head){
        Node slow=head;
        Node fast=head;
        Node entry=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return  findLength(slow,fast);
            }
        }

        while(entry!=slow){
            entry=entry.next;
            slow=slow.next;

        }

        System.out.println(entry.data);
        return 0;
    }

    public int usingBruteForce(Node head){
        HashMap<Node,Integer> map=new HashMap<>();
        int timer=1;
        while(head!=null){
            if(map.containsKey(head)){
                return timer-map.get(head);
            }else{
                map.put(head,timer);
                timer++;
            }
            head=head.next;
        }
        return 0;
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
        five.next=two;

        StartOfLoop s=new StartOfLoop();
        System.out.println(s.detectStart(one));
    }
}
