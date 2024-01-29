package Strings.easy;

public class Palindrome {

    public void find(String s){
        int end=s.length()-1;
        String ans="";
        for(int i=end; i>=0; i--){
             char c=s.charAt(i);
                if(c==' '){
                    ans+=s.substring(i+1)+" ";
                    s=s.substring(0,i);

                }

        }

        ans=ans+s;
        System.out.print(ans);
    }
    public static void main(String[] args) {
        Palindrome p=new Palindrome();
        p.find("this is an amazing program");
    }
}
