package Strings.medium;

public class MaximumDepthOfParenthesis {


    public int findDepth(String s){

        int curCount=0; int maxCount=0;
        for(int i=0; i<s.length(); i++){
           if(s.charAt(i)=='('){
               curCount++;
               maxCount=Math.max(curCount,maxCount);
           }else if(s.charAt(i)==')'){
               curCount--;
           }
        }
        if(curCount==0){
            return maxCount;
        }
        return -1;
    }
    public static void main(String[] args) {
        MaximumDepthOfParenthesis m=new MaximumDepthOfParenthesis();
        System.out.println(m.findDepth("(((A)))(((())))"));
    }
}

