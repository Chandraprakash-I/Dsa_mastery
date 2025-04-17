package BinaryTree;

import java.util.*;

class t{
    Node node;
    int ln;

    t(Node n,int ln){
        this.node=n;
        this.ln=ln;
    }
}
public class TopView {


    public static void topView(Node node){
        Map<Integer,ArrayList<Integer>> map=new TreeMap<>();
        Queue<t> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        q.offer(new t(node,0));

        while(!q.isEmpty()){
            t temp=q.poll();
            if(!map.containsKey(temp.ln)){
                map.put(temp.ln,new ArrayList<>());
                map.get(temp.ln).add(temp.node.data);
            }


            if(temp.node.left!=null){
                q.offer(new t(temp.node.left,temp.ln-1));
            }
            if(temp.node.right!=null){
                q.offer(new t(temp.node.right,temp.ln+1));
            }
        }

        for (Map.Entry<Integer,ArrayList<Integer>> entry: map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
    public static void main(String[] args) {
//        1
//       2  3
//      4  5
        Node o1=new Node(1);
        Node two1=new Node(2);
        Node three1=new Node(3);
        Node four1=new Node(4);
        Node five1=new Node(5);

        o1.left=two1;
        o1.right=three1;
        two1.left=four1;
        two1.right=five1;

        topView(o1);

    }
}
