package BinaryTree.Medium;

import BinaryTree.Node;

public class MirrorSelf {

    public static boolean Mirror(Node left,Node right){
        if(left==null ){
            return right==null;
        }
        if (right==null){
            return false;
        }
        if(left.data!=right.data){
            return false;
        }
        boolean l=Mirror(left.left,right.right);
        boolean r=Mirror(left.right,right.left);

        return l&&r;
    }
    public static void main(String[] args){
        Node one=new Node(1);
        Node two=new Node(2);
        Node three=new Node(2);
        Node four=new Node(3);
        Node five=new Node(4);
        Node six=new Node(4);
        Node seven=new Node(3);


        one.left=two;
        one.right=three;
        two.left=four;
        two.right=five;
        three.left=six;
//        three.right=seven;


        System.out.println(MirrorSelf.Mirror(one.left,one.right));
    }
}
