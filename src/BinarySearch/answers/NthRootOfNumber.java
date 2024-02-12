package BinarySearch.answers;

public class NthRootOfNumber {

    public int pow(int number,int power,int m){
        int ans=1;
        for(int i=0; i<power; i++){
            ans*=number;
            if(ans>m){
                return -1;
            }
            if(ans==m){
                return 1;
            }

        }
        return 2;

    }
    public int find(int n,int m){
      int low=1;
      int high=m;

      while(low<=high){
          int mid=(low+high)/2;
          int value=pow(mid,n,m);
          if(value==1){
              return mid;
          } else if (value==2) {
              low=mid+1;
          }else{
              high=mid-1;
          }
      }
      return -1;
    }
    public static void main(String[] args) {
        NthRootOfNumber n=new NthRootOfNumber();
        System.out.println(n.find(4,81));
    }
}
