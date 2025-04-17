package BinaryTree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;



public class BottomVIew {

    public static  void bottomView(Node node){
        Queue<t> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.offer(new t(node,0));
        while (!q.isEmpty()){
            t temp=q.poll();
            map.put(temp.ln,temp.node.data);
            if(temp.node.left!=null){
                q.offer(new t(temp.node.left,temp.ln-1));
            }
            if(temp.node.right!=null){
                q.offer(new t(temp.node.right,temp.ln+1));
            }
        }
        for (Map.Entry<Integer,Integer> m:map.entrySet()){
            System.out.print(m.getValue()+" ");
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

        bottomView(o1);

    }
}
