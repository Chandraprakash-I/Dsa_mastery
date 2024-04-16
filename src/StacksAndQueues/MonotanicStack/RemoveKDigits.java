package StacksAndQueues.MonotanicStack;

import java.util.Stack;

public class RemoveKDigits {

    public static void remove(String s,int k){
        Stack<Character> stack=new Stack<>();
        String res="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);

            while(!stack.isEmpty()&& k>0 &&stack.peek()>ch){
                stack.pop();
                k--;
            }
            if(!stack.isEmpty() ||ch!='0'){
                stack.push(ch);
            }
        }
        while(!stack.isEmpty() && k>0){
            stack.pop();
            if(stack.isEmpty()){
                res="0";
            }
            k--;
        }

        while(!stack.isEmpty()){
            res=stack.pop()+res;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        RemoveKDigits r=new RemoveKDigits();
        r.remove("1003",1);
    }
}
