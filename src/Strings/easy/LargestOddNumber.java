package Strings.easy;

public class LargestOddNumber {

    public String find(String s){
        if(s.charAt(s.length()-1)%2==1){
            return s;
        }
        int n=s.length()-2;
        while(n>=0){
            if(s.charAt(n)%2==1){
                return s.substring(0,n+1);
            }
            n--;
        }
        return "";
    }
    public static void main(String[] args) {
        LargestOddNumber l=new LargestOddNumber();
        System.out.println(l.find("527"));
    }
}
