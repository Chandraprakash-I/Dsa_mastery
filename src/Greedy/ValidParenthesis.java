package Greedy;

public class ValidParenthesis {

    public static boolean helper(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                count++;
            }else {
                count--;
            }
            if(count<0){
                return false;
            }
        }
        return count==0;
    }
    public static boolean usingNotRecursion(String s){


       return helper(s.replaceAll("\\*",")"))||
        helper(s.replaceAll("\\*","("))||
        helper(s.replaceAll("\\*",""));
    }
    public static boolean isValid(String s){
        char[] arr=s.toCharArray();
        int lb=0; int rb=0; int star=0;
        for(int i=0; i<arr.length; i++){
            char c=arr[i];
            if(c=='('){
                lb++;
            }else if(c==')'){
                rb++;
            }else{
                star++;
            }

        }
        return false;
    }

    public static boolean usingRecursion(String s,int count,int index){
        if(index==s.length())
        {
            return count==0;
        }
        if(s.charAt(index)=='*'){

            boolean ob=usingRecursion(s,count+1,index+1);
            if(count-1<0){
                return false;
            }
            boolean cb= usingRecursion(s,count-1,index+1);
            boolean em=usingRecursion(s,count,index+1);

            return ob||cb||em;
        }else if(s.charAt(index)=='('){
            return usingRecursion(s,count+1,index+1);
        }else
        {
            if(count-1<0){
                return false;
            }
            return usingRecursion(s, count - 1, index + 1);
        }

    }
    public static void main(String[] args){
            String s="(*))";
            System.out.println(usingRecursion(s,0,0));
    }
}
