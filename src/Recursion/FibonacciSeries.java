package Recursion;

public class FibonacciSeries {

    public int fibo(int n){

            if(n==0)return 0;
            if(n==1)return 1;

            return(fibo(n-1)+fibo(n-2));



    }
    public static void main(String[] args) {
        FibonacciSeries f=new FibonacciSeries();
        System.out.print(f.fibo(1));
    }
}
