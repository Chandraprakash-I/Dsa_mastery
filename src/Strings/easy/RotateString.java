package Strings.easy;

public class RotateString {

    public boolean find(String s,String goal){
        String t=s;
        String ans="";

        int n=t.length();
        for(int i=0; i<n; i++){
            ans=ans+t.charAt(n-1);
            ans=ans+t.substring(0,n-1);
            t=ans;

            if(goal.equals(ans)){
                return true;
            }
            ans="";
        }
        return false;
    }
    public static void main(String[] args) {
        RotateString r=new RotateString();
        System.out.println(r.find("abcde","bbcdea"));
    }
}
