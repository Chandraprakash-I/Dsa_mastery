package StacksAndQueues.preinpostFIx;

import java.util.Stack;

public class PostToPrefix {

    public void convert(String s){
        Stack<String> stack=new Stack<>();
        int n=s.length()-1;

        //going from left to right
        for(int i=0; i<=n; i++){
            char ch=s.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                String operand2=stack.pop();
                String operand1=stack.pop();
                stack.push(ch+operand1+operand2);
            }else{
                String operand=Character.toString(ch);
                stack.push(operand);
            }
        }
        System.out.println(stack.pop());
    }
    public static void main(String[] args) {
        PostToPrefix p=new PostToPrefix();
        p.convert(" abc*+");
    }
}
