package BinaryTree.Medium;

import BinaryTree.Node;

import java.util.*;


public class BottomView {
    public static List<Integer> getBottomView(Node node){
        LinkedList<Tuple> q=new LinkedList<>();
        Map<Integer,Map<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        if(node!=null)
            q.add(new Tuple(node,0,0));

        while(!q.isEmpty()){

            int n=q.size();
            for(int i=0; i<n; i++){
                Tuple temp=q.poll();
                int x=temp.x;
                int y=temp.y;

                if (!map.containsKey(x))
                {
                    map.put(x,new TreeMap<>());
                }
                if(!map.get(x).containsKey(y)){
                    map.get(x).put(y,new PriorityQueue<>());
                }
                map.get(x).get(y).add(temp.node.data);

                if(temp.node.left!=null){
                    q.add(new Tuple(temp.node.left,x-1,y+1));
                }
                if(temp.node.right!=null){
                    q.add(new Tuple(temp.node.right,x+1,y+1));
                }
            }
        }
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Map<Integer,PriorityQueue<Integer>>> entry:map.entrySet()){
            int lastLevel=0;
            for(Map.Entry<Integer,PriorityQueue<Integer>> e:entry.getValue().entrySet()){
                lastLevel=e.getValue().poll();
                break;
            }
            list.add(lastLevel);


        }
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

        System.out.println(BottomView.getBottomView(one));
    }
}
