package BinaryTree;

public class HeightBalancedTree {

    public static int heightBalanced(Node node){
        if(node==null) return 0;
        int left=heightBalanced(node.left);
        int right=heightBalanced(node.right);
        if(Math.abs(left-right)>1){
            return -1;
        }
        if(left==-1||right==-1){
            return -1;
        }
        return 1+Math.max(left,right);

    }

    public static int LongestPath(Node node,int[] dia){
        if(node==null) return 0;

        int left=LongestPath(node.left,dia);
        int right=LongestPath(node.right,dia);
        dia[0]=Math.max(left+right,dia[0]);

        return 1+Math.max(left,right);
    }
    public static void main(String[] args){
        Node o=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        Node four=new Node(4);
        Node five=new Node(5);

        o.left=two;
        o.right=three;
        two.left=four;
        two.right=five;

        if(heightBalanced(o)>0){
            System.out.println("balanced");
        }else{
            System.out.println("not balanced");
        }
    }
}
