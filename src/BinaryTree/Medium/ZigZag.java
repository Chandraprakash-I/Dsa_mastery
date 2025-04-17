package BinaryTree.Medium;

import BinaryTree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZag {

    public static List<List<Integer>> zigZag(Node node){
        List<List<Integer>> list=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();

        if(node!=null){
            q.add(node);
        }

        boolean leftToRight=true;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0; i<n; i++){
                Node element=q.poll();
                if(leftToRight){
                    level.add(i,element.data);
                }else{
                    level.add(q.size()-1-i,element.data);
                }

                if(element.left!=null){
                    q.add(element.left);
                }
                if(element.right!=null){
                    q.add(element.right);
                }
            }
            list.add(level);
            leftToRight=!leftToRight;
        }
        return list;
    }
    public static void  main(String[] args){
        Node o=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        Node four=new Node(4);
        Node five=new Node(5);
        Node six=new Node(6);
        Node seven=new Node(7);

        o.left=two;
        o.right=three;
        two.left=four;
        two.right=five;
        three.left=six;
        three.right=seven;

        System.out.println(zigZag(o));
    }
}
