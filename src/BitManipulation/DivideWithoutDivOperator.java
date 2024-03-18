package BitManipulation;

public class DivideWithoutDivOperator {

    public int divide(int divident,int divisor){
        //33=11x(2^1+2^0)
        if(divident==divisor){
            return 1;
        }
        boolean sign=true;
        if(divident>=0 && divisor<0){
            sign=false;
        }
        if(divident<0 && divisor>0){
            sign=false;
        }
        divident=Math.abs(divident);
        divisor=Math.abs(divisor);

        int ans=0;
        while(divident>=divisor){
            int cnt=0;
            while(divident>=(divisor<<(cnt+1))){
                cnt++;
            }
            ans+=1<<cnt;
            divident-=(divisor*(1<<cnt));
        }
        return (sign)?ans:-1*ans;
    }

    public static void main(String[] args) {
        DivideWithoutDivOperator d=new DivideWithoutDivOperator();
        System.out.println(d.divide(10,3));
    }
}
