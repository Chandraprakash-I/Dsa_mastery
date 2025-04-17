package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Boundry {

    public static boolean isLeaf(Node node){
        return  node!=null && node.left==null && node.right==null;
    }
    public static List<Integer> leftboundry(Node node, ArrayList<Integer> list){
        if(isLeaf(node)){
            return list;
        }
        list.add(node.data);
        if(node.left!=null){
            node=node.left;
        }else{
            node=node.right;
        }
        leftboundry(node,list);
        return list;
    }

    public static List<Integer> Leaf(Node node,ArrayList<Integer> list){
        if(node==null){
            return list;
        }
        if(isLeaf(node)){
            list.add(node.data);
        }

        Leaf(node.left,list);
        Leaf(node.right,list);
        return list;
    }

    public static List<Integer> rightBorder(Node node, Stack<Integer> stack){
        if(isLeaf(node)){
            return stack;
        }
        stack.push(node.data);
        if(node.right!=null){
            node=node.right;
        }else{
            node=node.left;
        }
        rightBorder(node,stack);
        return stack;
    }

    public static void doIt(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        leftboundry(root,ans);
        Leaf(root,ans);
        Stack<Integer> s=new Stack<>();
        rightBorder(root.right,s);
        for(int i=s.size()-1; i>=0; i--){
            ans.add(s.pop());
        }
        System.out.println(ans);
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

        doIt(o1);

    }
}
