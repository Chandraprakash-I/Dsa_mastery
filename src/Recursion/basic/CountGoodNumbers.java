package Recursion.basic;

public class CountGoodNumbers {

    public long count(int n,boolean flag,long ans){
        if(n==0){
            return ans;
        }
        ans*=(flag)?4:5;
        return count(n-1,!flag,ans);
    }
    public static void main(String[] args) {
        CountGoodNumbers c=new CountGoodNumbers();
        System.out.println(c.count(1,false,1));
    }
}
