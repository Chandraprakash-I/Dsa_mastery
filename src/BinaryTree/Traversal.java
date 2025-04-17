package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversal {

    public static void levelOrder(Node node){
        Queue<Node> queue=new LinkedList<>();
        if(node!=null){
            queue.add(node);
        }
        while(!queue.isEmpty()){
            Node element=queue.poll();
            System.out.println(element.data);
            if(element.left!=null){
                queue.add(element.left);
            }
            if(element.right!=null){
                queue.add(element.right);
            }

        }
    }
    public static void preOrder(Node node){
        if(node==null){
            return ;
        }
        System.out.print(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void inOrder(Node node){
        if(node==null){
            return ;
        }
        inOrder(node.left);
        System.out.print(node.data);
        inOrder(node.right);
    }

    public static void postOrder(Node node){
        if(node==null){
            return ;
        }
        postOrder(node.left);

        postOrder(node.right);
        System.out.print(node.data);
    }

    public static void iterativePreOrder(Node node){
        Stack<Node> q=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        q.push(node);
        while(!q.isEmpty()){
            Node element=q.pop();
            if(element.right!=null){
                q.add(element.right);
            }
           if(element.left!=null){
               q.add(element.left);
           }

            list.add(element.data);
        }
        System.out.println(list);
    }
    public static void iterativeInOrder(Node node){
        Stack<Node> s=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        while(true){
            if(node!=null){
                s.push(node);
                node=node.left;
            }else{
                if(s.isEmpty()){
                    break;
                }
                node=s.pop();
                list.add(node.data);
                node=node.right;
            }
        }
        System.out.println(list);
    }

    public static void iterativePostOrder(Node node){
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();

        s1.push(node);

        while(!s1.isEmpty()){
            node=s1.pop();
            if(node.left!=null){
                s1.push(node.left);
            }
            if(node.right!=null){
                s1.push(node.right);
            }
            s2.push(node);
        }
        while(!s2.isEmpty()){
            System.out.print(s2.pop().data);
        }
    }
    public static void iterativePostOrderUsingASingleStack(Node head){
        Stack<Node> stack=new Stack<>() ;
        if(head!=null){
            stack.push(head);
        }
        while(!stack.isEmpty()){
            Node cur=stack.peek();

            if(cur!=null){
                stack.push(cur);
               cur=cur.left;

            }else{
                Node temp=stack.peek().right;
                if(temp==null){

                    Node t=stack.pop();
                    

                }else{
                    cur=temp.right;

                }
            }
        }
    }

    public static void ThreeInOne(Node node){
        Stack<Pairs> stack=new Stack<>();
        Pairs p=new Pairs(node, 1);
        ArrayList<Integer> preOrder=new ArrayList<>();
        ArrayList<Integer> inOrder=new ArrayList<>();
        ArrayList<Integer> postOrder=new ArrayList<>();
        stack.push(p);

        while(!stack.isEmpty()){
           Pairs temp=stack.peek();
           if(temp.count==1){
               preOrder.add(temp.node.data);
               temp.count+=1;

               if(temp.node.left!=null){
                   stack.push(new Pairs(temp.node.left,1));
               }
           }else if(temp.count==2){
               inOrder.add(temp.node.data);
               temp.count+=1;

               if(temp.node.right!=null){
                   stack.push(new Pairs(temp.node.right,1));
               }
           }else if(temp.count==3){
               postOrder.add(temp.node.data);
               stack.pop();
           }
        }
        System.out.println(preOrder);
        System.out.println(inOrder);
        System.out.println(postOrder);
    }

    public static boolean heightBalancedOrNotBrute(Node node){

           if(node.left==null && node.right==null){
               return true;
           }
           Node left=null;
           int leftCount=0;
        if(node.left!=null){
            left=node.left;
            while(left!=null){
                left=left.left;
                leftCount++;
            }
        }
        Node right=null;
        int rightCount=0;
        if(node.right!=null)
        {
            right=node.right;
            while(right!=null){
                right=right.right;
                rightCount++;
            }
        }
        if(Math.abs(leftCount-rightCount)>1){
            return false;
        }
        boolean l=true,r=true;
        if(node.left!=null){
           l= heightBalancedOrNotBrute(node.left);
        }
        if(node.right!=null){
            r=heightBalancedOrNotBrute(node.right);
        }
        return l&& r;
    }

    public static int maxHeightUsingRecursion(Node node,int height){
        if(node.left==null && node.right==null){
            return height;
        }
        int left=0;
        if(node.left!=null){
            left=maxHeightUsingRecursion(node.left,height+1);
        }
        int right=0;
        if(node.right!=null){
            right=maxHeightUsingRecursion(node.right,height+1);
        }
        return Math.max(left,right);
    }

    public static int maxHeightUsingRecursionBalancedOrNot(Node node,int height){
        if(node.left==null && node.right==null){
            return height;
        }
        int left=0;
        if(node.left!=null){
            left=maxHeightUsingRecursion(node.left,height+1);
        }
        int right=0;
        if(node.right!=null){
            right=maxHeightUsingRecursion(node.right,height+1);
        }
        if(left==-1|| right==-1){
            return -1;
        }
        if(Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right);
    }
    public static int maxHeightUsingLevelOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        int level = 0;

        if (node != null) {
            level = 1;
            node.data = level;
            queue.add(node);

        }

        while (!queue.isEmpty()) {
            Node element = queue.poll();

            if (element.left != null) {
                element.data = level + 1;
                queue.add(element.left);
            }
            if (element.right != null) {
                element.data = level + 1;
                queue.add(element.right);
            }
            if (element.left != null || element.right != null) {
                level = level + 1;
            }
        }
        return level;
    }

    public static int findDiameter(Node node){
        if(node==null){
            return 0;
        }
        int left=0;

          left=findDiameter(node.left);

        int right=0;

            right=findDiameter(node.right);

        return 1+Math.max(left,right);
    }

    public static void findDiameterMain(Node node){
        int maxDia=0;
        Queue<Node> queue=new LinkedList<>();
        if(node!=null){
            queue.add(node);
        }
        while (!queue.isEmpty()){
            Node element= queue.poll();
            maxDia=Math.max(maxDia,(2*findDiameter(element))-1);
            if(element.left!=null) {
                queue.add(element.left);
            }
            if(element.right!=null){
                queue.add(element.right);
            }

        }
        System.out.println(maxDia);
    }
    public static void main(String[] args) {
        Node o=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        Node four=new Node(4);
        Node five=new Node(5);
        Node six=new Node(6);
        Node seven=new Node(7);

        o.left=two;
        o.right=three;
        two.left=four;
        two.right=five;
        three.left=six;
        three.right=seven;


      //iterativePreOrder(o);
//       iterativeInOrder(o);
        // iterativePostOrder(o);
         //levelOrder(o);
      //  ThreeInOne(o);
      //  System.out.println(maxHeightUsingLevelOrder(o));
        //System.out.println(maxHeightUsingRecursion(o,1));
        //System.out.println(heightBalancedOrNotBrute(o));
        //System.out.println(maxHeightUsingRecursionBalancedOrNot(o,1));
       //findDiameterMain(o);
        diameterUsingPostOrderTraversal(o);
        System.out.println(diameter);
    }
    static int diameter=0;
    public static int diameterUsingPostOrderTraversal(Node node){
        if(node==null){
            return 0;
        }
        int left=diameterUsingPostOrderTraversal(node.left);
        int right=diameterUsingPostOrderTraversal(node.right);
        diameter=Math.max(diameter,left+right+1);
        return 1+Math.max(left,right);
    }
}
class Pairs{
    Node node;
    int count;
    Pairs(Node node,int count){
        this.node=node;
        this.count=count;
    }

}