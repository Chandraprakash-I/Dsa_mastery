package StacksAndQueues.preinpostFIx;

import java.util.Stack;

public class PrefixToInfix {

    public void convert(String s){
        Stack<String> stack=new Stack<>();
        int n=s.length()-1;

        //going from right to left
        for(int i=n; i>=0; i--){
            char ch=s.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                String operand1=stack.pop();
                String operand2=stack.pop();
                stack.push("("+operand1+ch+operand2+")");
            }else{
                String operand=Character.toString(ch);
                stack.push(operand);
            }
        }
        System.out.println(stack.pop());
    }
    public static void main(String[] args) {
        PrefixToInfix p=new PrefixToInfix();
        p.convert("+-acb");
    }
}
