package Strings.easy;

public class RemoveOuterMostParanthesis {

    public String remove(String word){
        int count=0;
        String ans="";
        boolean flag=true;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)=='('){
                count++;
            } else if (word.charAt(i)==')') {
                count--;
            }
            if(flag && count==1){
                flag=false;
                continue;
            }
            if(!flag && count==0){
                flag=true;
                continue;
            }
            ans=ans+word.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        RemoveOuterMostParanthesis p=new RemoveOuterMostParanthesis();
        System.out.println(p.remove("(()())(())"));
    }
}
