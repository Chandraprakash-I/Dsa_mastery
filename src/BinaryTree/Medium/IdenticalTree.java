package BinaryTree.Medium;

import BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class IdenticalTree {

    public static boolean isIdenticalTree(Node node1,Node node2){
        Queue<Node> q1=new LinkedList<Node>();
        Queue<Node> q2=new LinkedList<Node>();
        q1.add(node1);q2.add(node2);
        while(!q1.isEmpty() && !q2.isEmpty()){
            if(q1.size()==q2.size()){
                for(int i=0; i<q1.size(); i++){
                    Node n1=q1.poll();
                    Node n2=q2.poll();
                    if(n1.data==n2.data){
                        if(n1.left!=null && n2.left!=null){
                            q1.add(n1.left);
                            q2.add(n2.left);
                        }
                        if(n1.right!=null && n2.right!=null){
                            q1.add(n1.right);
                            q2.add(n2.right);
                        }

                    }else{
                        return false;
                    }
                }
            }else{
                return false;
            }

        }
        return true;
    }

    public static boolean usingInOrderTraversal(Node node1,Node node2){
        if(node1==null || node2==null){
            return node1==node2;
        }

        boolean left=usingInOrderTraversal(node1.left,node2.left);
        if(node1.data!=node2.data){
            return false;
        }
        boolean right=usingInOrderTraversal(node1.right,node2.right);
        return left&&right;
    }
    public static void main(String[] args) {
        Node o = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        Node four = new Node(1);
        Node five = new Node(2);
        Node six = new Node(3);

        Node seven = new Node(7);

        o.left = two;
        o.right = three;

        four.right = six;
        four.left = five;

        System.out.println(usingInOrderTraversal(o,four));
    }
    }
