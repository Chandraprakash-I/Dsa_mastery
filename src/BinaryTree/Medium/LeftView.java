package BinaryTree.Medium;

import BinaryTree.Node;

import java.util.ArrayList;
import java.util.List;

public class LeftView {

    public static List<Integer> findLeftView(Node node,List<Integer> list,int level){
        if(node==null){
            return list;
        }
        if(list.size()<level){
            list.add(node.data);
        }

        findLeftView(node.left,list,level+1);
        findLeftView(node.right,list,level+1);
        return list;
    }

    public static void main(String[] args){
        Node one=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        Node four=new Node(4);
        Node five=new Node(10);
        Node six=new Node(9);
        Node seven=new Node(11);
        Node eight=new Node(5);
        Node nine=new Node(6);

        one.left=two;
        one.right=three;
        two.left=four;
        two.right=five;
        three.left=six;
        three.right=seven;
        four.right=eight;
        eight.right=nine;

        System.out.println(LeftView.findLeftView(one,new ArrayList<>(),1));
    }
}
