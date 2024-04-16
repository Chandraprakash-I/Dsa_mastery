package StacksAndQueues.preinpostFIx;

import java.util.Stack;

public class PostToInfix {

    public void convert(String s){
        int n=s.length();
        Stack<String> stack=new Stack<>();
        for(int i=0;i<n; i++){
            char ch=s.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                String operand2=stack.pop();
                String operand1=stack.pop();
                stack.push("("+operand1+ch+operand2+")");
            }else{
                String operand=Character.toString(ch);
                stack.push(operand);
            }
        }
        System.out.println(stack.pop());
    }
    public static void main(String[] args) {
        PostToInfix p=new PostToInfix();
        p.convert("ab+c+");
    }
}
