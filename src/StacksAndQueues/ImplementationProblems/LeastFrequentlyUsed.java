package StacksAndQueues.ImplementationProblems;

import java.util.HashMap;

class Node{
    int data;
    int key;
    int freq;
    Node prev;
    Node next;
    Node(int key,int data){
        this.key=key;
        this.data=data;
        this.freq=1;
        this.prev=null;
        this.next=null;
    }
}

class DLlist{
    int capacity;
    Node head;
    Node tail;

    DLlist(int capacity){
        this.capacity=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }

    public boolean isEmpty(){
        return head.next==tail;
    }

    public void addAfterHead(Node newNode){
        Node headNext=head.next;
        head.next=newNode;
        newNode.prev=head;
        newNode.next=headNext;
        headNext.prev=newNode;
    }
    public void deleteLast(Node n){
        Node prev=n.prev;
        Node next=n.next;
        prev.next=next;
        next.prev=prev;
    }
}
public class LeastFrequentlyUsed {
    int leastFreq=1;
    int capacity;
    int curCount;
    HashMap<Integer,Node> map;
    HashMap<Integer,DLlist> frequencyCache;

    LeastFrequentlyUsed(int capacity){
        this.capacity=capacity;
        this.curCount=0;
        this.map =new HashMap<>();
        this.frequencyCache=new HashMap<>();

    }

    public void put(int key,int value){

        if(curCount<capacity) {
            //if already present update value and frequency in both maps
            if (map.containsKey(key)) {
                Node val = map.remove(key);
                val.freq += 1;
                map.put(key, val);
                update(val);
            } else {
                //if not present create Node ,add it to cache,add Node to freqcache with new ddl()
                Node n = new Node(key, value);
                map.put(key, n);
                update(n);
            }
            curCount++;
        }else{
            curCount--;
            if(frequencyCache.get(leastFreq).isEmpty()){
                leastFreq+=1;
            }
            DLlist d=frequencyCache.get(leastFreq);
            map.remove(d.tail.prev.key);
            d.deleteLast(d.tail.prev);
            put(key,value);
        }

    }

    public void update(Node node){
        //freqcache contains the freq
        if(frequencyCache.containsKey(node.freq)){
            DLlist d=frequencyCache.get(node.freq);
            d.addAfterHead(node);
        }//not contains freq
        else{
            int freq=node.freq;
            DLlist t=new DLlist(capacity);
            t.addAfterHead(node);
            frequencyCache.put(freq,t);
        }
    }

    public int get(int key){
        if(map.containsKey(key)){
           //return value and update freqcache.
            Node t= map.get(key);
           DLlist d=frequencyCache.get(t.freq);
           Node nn=new Node(key,t.data);
           nn.freq=t.freq+1;
           d.deleteLast(t);
           update(nn);
           return t.data;
        }
        return -1;
    }

    public static void main(String[] args) {
        LeastFrequentlyUsed l=new LeastFrequentlyUsed(2);
        int a=0;
        l.put(1,10);
        l.put(2,20);
        System.out.println(l.get(1));
        l.put(3,30);
        System.out.println(l.get(2));
        System.out.println(l.get(3));
        l.put(4,40);

       

    }
}
