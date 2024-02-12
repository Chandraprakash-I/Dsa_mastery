package Strings.easy;

public class Palindrome {

    public boolean palindromeWord(String word){
        String reverse="";
        for(int i=word.length()-1; i>=0; i--){
            reverse+=word.charAt(i);
        }
        if(reverse.equals(word)){
            return true;
        }
        return false;
    }
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
        System.out.println(p.palindromeWord("amaa"));
    }
}
