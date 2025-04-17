package BinaryTree;

public class IdenticalTree {

    public static boolean identicalTree(Node node1,Node node2){
        if(node1==null || node2==null){
            return node1==node2;
        }

        boolean left=identicalTree(node1.left,node2.left);
        boolean right=identicalTree(node1.right,node2.right);

        if(node1.data!= node2.data){
            return false;
        }
        return left&&right;

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

        Node o1=new Node(1);
        Node two1=new Node(3);
        Node three1=new Node(3);
        Node four1=new Node(4);
        Node five1=new Node(5);

        o1.left=two1;
        o1.right=three1;
        two1.left=four1;
        two1.right=five1;

        System.out.println(identicalTree(o,o1));
    }
}
