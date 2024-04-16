package StacksAndQueues.preinpostFIx;

import java.util.Stack;

public class PrefixToPostfix {

    public String infix(String s){
        Stack<String> stack=new Stack<>();
        int n=s.length()-1;
        for(int i=n; i>=0; i--){
            char ch=s.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                String op1=stack.pop();
                String op2=stack.pop();
                stack.push("("+op1+ch+op2+")");
            }else{
                String operand=Character.toString(ch);
                stack.push(operand);
            }
        }
        return stack.pop();
    }
    public void convert(String s){
        String infix=infix(s);
        System.out.println(infix+"infix");
        String postfix=postfix(infix);
        System.out.println(postfix);
    }
    public String postfix(String s){
        Stack<Character> stack=new Stack<>();
        String res="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    res+=stack.pop();
                }
                stack.pop();
            }else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                if(precedence(ch)>=precedence(stack.peek())&&stack.peek()!='('){
                    res+=ch;
                }else{
                    while(!stack.isEmpty() && precedence(stack.peek())>precedence(ch)){
                        res+=stack.pop();
                    }
                    stack.push(ch);
                }
            }else{
                res+=ch;
            }
        }
        while(!stack.isEmpty()){
            res+=stack.pop();
        }
        return res;
    }

    public int precedence(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
    public static void main(String[] args) {
        PrefixToPostfix p=new PrefixToPostfix();
        p.convert("-/A+BC*DE");
    }
}
