package BinaryTree.Medium;

import BinaryTree.Node;

import java.util.ArrayList;
import java.util.List;

public class BoundaryValues {

    public static boolean isLeaf(Node node){
        return node.left==null&&node.right==null;
    }
    public static List<Integer> leftBoundary(Node node, ArrayList<Integer> list){
        if(node==null){
            return list;
        }
        if(!isLeaf(node)){
            list.add(node.data);
        }

        leftBoundary(node.left,list);
        if(node.left==null){
            leftBoundary(node.right,list);
        }
        return list;
    }

    public static List<Integer> rightBoundary(Node node,ArrayList<Integer> list){
        if(node==null){
            return list;
        }


        rightBoundary(node.right,list);
        if(node.right==null){
            rightBoundary(node.left,list);
        }
        if(!isLeaf(node)){
            list.add(node.data);
        }

        return list;
    }

    public static List<Integer> bottomBoundary(Node node,ArrayList<Integer> list){

        if(node.left!=null){
            bottomBoundary(node.left,list);
        }
        if(node.right!=null){
            bottomBoundary(node.right,list);
        }
        if(isLeaf(node)){
            list.add(node.data);
        }
        return list;
    }

    public static List<Integer> boundaryList(Node node){
        ArrayList<Integer> list=new ArrayList<>();
        leftBoundary(node,list);
        bottomBoundary(node,list);
        rightBoundary(node,list);
        list.remove(list.size()-1);
        return list;
    }
    public static void main(String[] args){
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

        System.out.println(boundaryList(o));
    }
}
