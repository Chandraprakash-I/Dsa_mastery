package BinaryTree;

public class MaximumPathSum {

    public static int maxPathSum(Node node,int[] arr){
        if(node==null) return 0;

        int left=Math.max(0,maxPathSum(node.left,arr));
        int right=Math.max(0,maxPathSum(node.right,arr));

        arr[0]=Math.max(arr[0],left+right+ node.data);
        return node.data+Math.max(left,right);
    }
    public static void main(String[] args) {
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
        System.out.println(maxPathSum(o,arr));
    }
}
