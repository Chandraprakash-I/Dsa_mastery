package StacksAndQueues.Learning;

import java.util.Stack;

public class BalancingParenthesis {

    public boolean valid(String word){
        Stack<Character> s=new Stack<>();
        for(int i=0; i<word.length(); i++){
            char c=word.charAt(i);
            if(c=='('||c=='{'||c=='['){
                s.push(c);
            }else{

                if(!s.isEmpty()&&(c==')'&&s.peek()=='('||c=='}'
                        &&s.peek()=='{'||c=='['&&s.peek()==']')){
                    s.pop();
                }else{
                    return false;
                }
            }

        }
        return true;
    }
    public static void main(String[] args){
        BalancingParenthesis b=new BalancingParenthesis();
        System.out.println(b.valid("({})}"));
    }
}
