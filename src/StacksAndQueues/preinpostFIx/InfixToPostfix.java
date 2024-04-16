package StacksAndQueues.preinpostFIx;

import java.util.Stack;

public class InfixToPostfix {

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
    public void convertIntoPost(String s){
        Stack<Character> stack=new Stack<>();

        String res="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                //found operands
                res+=ch;
            }else{

                if(stack.isEmpty()){
                    // )or operators and stack is empty
                    stack.push(ch);
                } else if (ch=='(') {
                    //found (
                    stack.push(ch);
                } else if(ch==')'){
                    //found )
                    while(!stack.isEmpty() && stack.peek()!='('){
                        res+=stack.pop();
                    }
                    stack.pop();
                }else{
                    //found operators
                        while(!stack.isEmpty()&&precedence(stack.peek())>=precedence(ch)){
                            res+=stack.pop();
                        }
                        stack.push(ch);

                }
            }

        }
        while (!stack.isEmpty()){
            res+=stack.pop();
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        InfixToPostfix in=new InfixToPostfix();
        in.convertIntoPost("(p+q)*(r-s)");
    }
}
