package BinaryTree;

import java.util.*;
class Tuple{
    Node node;
    int level;
    int verticalLine;

    Tuple(Node node,int level,int verticalLine){
        this.node=node;
        this.level=level;
        this.verticalLine=verticalLine;
    }
}
public class VerticalLineTraversal {

//        1
//    2       3
// 4      5
    public static void verticalLine(Node node){
        Map<Integer,Map<Integer,ArrayList<Integer> >> map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<>();

        q.offer(new Tuple(node,1,0));


        while(!q.isEmpty()){
            int size=q.size();


            for(int i=0; i<size; i++){
                Tuple temp=q.poll();
                int x=temp.level; int y=temp.verticalLine;
                if(temp.node.left!=null){
                    q.offer(new Tuple(temp.node.left,x+1,y-1));
                }
                if(temp.node.right!=null){
                    q.offer(new Tuple(temp.node.right,x+1,y+1));
                }

                if(!map.containsKey(temp.verticalLine)){
                    map.put(temp.verticalLine,new TreeMap<>());
                }
                if(!map.get(temp.verticalLine).containsKey(temp.level)){
                    map.get(temp.verticalLine).put(temp.level,new ArrayList<>());
                }
                map.get(temp.verticalLine).get(temp.level).add(temp.node.data);
            }

        }

        for(Map<Integer,ArrayList<Integer>> m:map.values()){
            for(ArrayList<Integer> a:m.values()){
                System.out.println(a);
            }
        }
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

        verticalLine(o1);

    }
}
