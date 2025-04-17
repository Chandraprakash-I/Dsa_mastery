package BinaryTree;

import java.util.*;

public class LevelOrderTraversal {

    public void levelOrder(Node root){
        List<ArrayList<Integer>> list=new ArrayList<>();

        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> l=new ArrayList<>();
            for(int i=0; i<size; i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                l.add(q.poll().data);
            }
            list.add(l);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Node one=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        one.left=two;
        one.right=three;
        LevelOrderTraversal l=new LevelOrderTraversal();
        l.levelOrder(one);
    }
}
