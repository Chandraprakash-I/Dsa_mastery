package Recursion;

public class Recursion {
    public int sod(int n){
        if(n<10){
            return n;
        }
        return n%10+sod(n/10);
    }
    public int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
