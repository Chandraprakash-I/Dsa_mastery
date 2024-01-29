package BinarySearch.answers;

public class FindSqRoot {

    public void find(int n){
        int low=1;
        int high=n;

        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid*mid)==n){
                ans=mid;
                break;
            }else if((mid*mid)>n){
                high=mid-1;
            }else{
                ans=mid;
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        FindSqRoot f=new FindSqRoot();
        f.find(28);
    }
}
