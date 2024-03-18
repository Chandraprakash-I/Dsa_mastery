package BitManipulation;

public class XorOfNumbersWithinRange {

    public int helper(int n){
        if(n%4==0){
            return n;
        }else if(n%4==1){
            return 1;
        }else if(n%4==2){
            return n+1;
        }else{
            return 0;
        }
    }
    public void find(int low,int high){
        int l=helper(low-1);
        int h=helper(high);
        System.out.println(h^l);
    }
    public static void main(String[] args) {
        XorOfNumbersWithinRange x=new XorOfNumbersWithinRange();
        x.find(3,5);
    }
}
