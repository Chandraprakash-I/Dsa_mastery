package StacksAndQueues.ImplementationProblems;

import java.util.HashMap;

class Node1{
    int data;
    int key;
    Node1 prev;
    Node1 next;
    Node1(int key,int data){
        this.key=key;
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class LeastRecentlyUsed {
    int capacity;
    int count=0;
    Node1 head;
    Node1 tail;
    HashMap<Integer,Node1> map;
    LeastRecentlyUsed(int capacity){
        this.capacity=capacity;
        map=new HashMap<>();
        head=new Node1(-1,-1);
        tail=new Node1(-1,-1);
        head.next=tail;
        tail.prev=head;

    }

    public int get(int key){
        if(map.containsKey(key)){
            Node1 n=map.get(key);
            //delete it
            deleteLast(n);
            //add after head
            addAfterHead(n);
            //update map
            return n.data;
        }

        return -1;
    }

    public void put(int key,int value){
        Node1 newNode=new Node1(key,value);


        if(count>=capacity){
            Node1 lastNode=tail.prev;
            deleteLast(lastNode);
            map.remove(lastNode.key);
            count--;
        }
        addAfterHead(newNode);
        count++;
        //add it to map
        map.put(key,newNode);
    }

    public void addAfterHead(Node1 newNode){
        Node1 headNext=head.next;
        head.next=newNode;
        newNode.prev=head;
        newNode.next=headNext;
        headNext.prev=newNode;
    }
    public void deleteLast(Node1 n){
        Node1 prev=n.prev;
        Node1 next=n.next;
        prev.next=next;
        next.prev=prev;
    }

    public static void main(String[] args) {
        int a=0;
        LeastRecentlyUsed l=new LeastRecentlyUsed(2);
        l.put(1,1);
        l.put(2,2);
        l.put(3,3);
        a=l.get(2);

        System.out.println(a);
    }
}
