package Recursion;

public class BinaryTreeTraversal {
    TreeNode root;

    BinaryTreeTraversal(){
        root=null;
    }

    public void inOrder(TreeNode node){
        if(node!=null){
            inOrder(node.left);
            System.out.println(node.data);
            inOrder(node.right);
        }

    }
    public void preOrder(TreeNode node){
        if(node!=null){
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void postOrder(TreeNode node){
        if(node!=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);
        }
    }

    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("In-order traversal:");
        tree.postOrder(tree.root);
    }
}
