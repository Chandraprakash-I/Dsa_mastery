package BinaryTree;

public class LongestPath {

    public static int longestPath(Node node,int[] dia){
        if(node==null) return 0;

        int left=longestPath(node.left,dia);
        int right=longestPath(node.right,dia);
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

       int[] arr=new int[1];
        longestPath(o,arr);
       System.out.println(arr[0]);
    }

}
