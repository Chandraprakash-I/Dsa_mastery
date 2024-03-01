package Recursion.basic;

public class Power {

    public double find(double x,int n){
        if(n==1){
            return x;
        }
        return x*find(x,n-1);
    }
    public static void main(String[] args) {
        Power p=new Power();
        System.out.println(p.find(2.0,10));
    }
}
