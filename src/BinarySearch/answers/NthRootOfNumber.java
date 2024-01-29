package BinarySearch.answers;

public class NthRootOfNumber {

    public void find(int n){
        int low=1;
        int high=n;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int x=mid*mid*mid;
            if(x==n){
                ans=mid;
                break;
            }else if(x>n){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        NthRootOfNumber n=new NthRootOfNumber();
        n.find(69);
    }
}
