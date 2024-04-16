package StacksAndQueues.preinpostFIx;

import java.util.Stack;

public class InfixToprefix {

    public int precedence(char ch){
        switch (ch){
            case '+':
                return 1;
            case '-':
                return 2;
            case '*':
                return 3;
            case '/':
                return 4;
            default:
                return -1;
        }
    }
    public void convert(String s){
        Stack<Character> stack=new Stack<>();
        String res="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    res=stack.pop()+res;
                }
                stack.pop();
            }else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){

                if(!stack.isEmpty() && precedence(ch)>precedence(stack.peek())){
                    res=ch+res;
                }else{
                    while(!stack.isEmpty() && precedence(stack.peek())>ch){
                        res=stack.pop()+res;
                    }
                    stack.push(ch);
                }
            }else{
                res+=ch;
            }
        }
        while(!stack.isEmpty()){
            res=stack.pop()+res;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        InfixToprefix i=new InfixToprefix();
        i.convert("(a+b)*c/d");
    }
}
