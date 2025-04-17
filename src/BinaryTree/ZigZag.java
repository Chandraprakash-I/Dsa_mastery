package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZag {

    public static void zigZag(Node node){
        Queue<Node> q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        q.offer(node);

        boolean leftToRight=true;
        while (!q.isEmpty()) {
            int size=q.size();
            ArrayList<Integer> l=new ArrayList<>(size);
            for (int i=0; i<size; i++){
                Node temp=q.poll();
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }

                if(leftToRight){
                    l.add(temp.data);
                }else {
                    l.add(0, temp.data);
                }

            }
            list.add(l);
            leftToRight=!leftToRight;
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Node o1=new Node(1);
        Node two1=new Node(2);
        Node three1=new Node(3);
        Node four1=new Node(4);
        Node five1=new Node(5);

        o1.left=two1;
        o1.right=three1;
        two1.left=four1;
        two1.right=five1;

        zigZag(o1);
    }
}
