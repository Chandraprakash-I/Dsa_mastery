package StacksAndQueues.MonotanicStack;

import java.util.Stack;

public class AsteroidCollision {

    public void afterCollision(int[] arr){
      Stack<Integer> stack=new Stack<>();

      for(int i:arr){
          boolean flag=true;
          while(!stack.isEmpty() && stack.peek()>0 && i<0){
              if(Math.abs(i)==stack.peek() || Math.abs(i)>stack.peek()){
                stack.pop();
              }else{
                  flag=false;
                  break;
              }
          }
         if(flag){
             stack.push(i);
         }else{
             flag=true;
         }

      }

      while(!stack.isEmpty()){
          System.out.println(stack.pop());
      }
    }
    public static void main(String[] args) {
        AsteroidCollision a=new AsteroidCollision();
        a.afterCollision(new int[]{3, 4 ,5, -2 ,7});
    }
}
