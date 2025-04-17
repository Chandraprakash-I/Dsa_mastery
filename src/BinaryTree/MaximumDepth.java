package BinaryTree;

public class MaximumDepth {

    public static int maxDepth(Node node){
        if(node==null) return 0;
        int left=maxDepth(node.left);
        int right=maxDepth(node.right);
        return 1+Math.max(left,right);
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

        System.out.println(maxDepth(o));

    }
}
