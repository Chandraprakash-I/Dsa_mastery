package LinkedList.hard;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;
    Node(int value) {
        val = value;
        next = null;
        random = null;
    }
}
class CloneLinkedList {

    public Node cloneList(Node head){
        HashMap<Node,Node> map=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            Node newNode=new Node(temp.val);
            map.put(temp,newNode);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node node=map.get(temp);
            node.next=(temp.next!=null)?map.get(temp.next):null;
            node.random=(temp.random!=null)?map.get(temp.random):null;
            temp=temp.next;
        }
        return map.get(head);
    }

    public void print(Node head){
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node head = null;

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        head = node1;
        head.next = node2;
        head.next.next = node3;
        head.next.next.next = node4;

        head.random = node4;
        head.next.random = node1;
        head.next.next.random = null;
        head.next.next.next.random = node2;

        CloneLinkedList c=new CloneLinkedList();
        c.print(c.cloneList(head));
    }
}
