package Recursion.basic;

public class Atoi {

    public int doIt(String s,int n){
        if(n==1){
            char a=s.charAt(n-1);
            int c=s.charAt(n-1)-'0';
            return c;
        }
       int b=(10*doIt(s,n-1))+s.charAt(n-1)-'0';
        return b;
    }
    public static void main(String[] args) {
        Atoi a=new Atoi();
        System.out.println(a.doIt("123",3));
    }
}
