package BinaryTree.Medium;

import BinaryTree.Node;

import java.util.*;

class Tuple{
    public Node node;
    public int x;
    public int y;

    public Tuple(Node node,int x,int y){
        this.node=node;
        this.x=x;
        this.y=y;
    }
}
public class VerticalOrderTraversal {

    public  static Map<Integer,Map<Integer, PriorityQueue<Integer>>> verticalOrder(Node node){


        Queue<Tuple> queue=new LinkedList<>();
        Map<Integer,Map<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        if(node!=null){
            queue.add(new Tuple(node,0,0));
        }

        while (!queue.isEmpty()){
            int n= queue.size();


            for(int i=0; i<n; i++){
                Tuple temp=queue.poll();
                int x=temp.x;
                int y=temp.y;
                if(!map.containsKey(x)){
                    map.put(x, new TreeMap<>());
                }

                if(!map.get(x).containsKey(y)){
                    map.get(x).put(y,new PriorityQueue<>());
                }

                map.get(x).get(y).add(temp.node.data);

                if(temp.node.left!=null){
                    queue.add(new Tuple(temp.node.left,x-1,y+1));
                }
                if(temp.node.right!=null){
                    queue.add(new Tuple(temp.node.right,x+1,y+1));
                }
            }
        }
        return map;
    }
    public static void main(String[] args){
        VerticalOrderTraversal v=new VerticalOrderTraversal();
        Node one=new Node(15);
        Node two=new Node(9);
        Node three=new Node(20);
        Node four=new Node(3);
        Node five=new Node(7);

        one.left=two;
        one.right=three;
        three.left=four;
        three.right=five;

        Map<Integer,Map<Integer, PriorityQueue<Integer>>> vs=verticalOrder(one);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(Map.Entry<Integer,Map<Integer,PriorityQueue<Integer>>> entry :vs.entrySet()){
            System.out.println("for "+entry.getKey());
            ArrayList<Integer> temp=new ArrayList<>();
                for(Map.Entry<Integer,PriorityQueue<Integer>> level:entry.getValue().entrySet()){

                        temp.add(level.getValue().poll());
                        break;

                }
                list.add(temp);
        }
        System.out.println(list);
    }
}
