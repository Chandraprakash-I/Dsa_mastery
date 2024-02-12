package BinarySearch.answers;

public class DistributeBooks {

    public int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    public int sum(int[] arr){
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        return  sum;
    }

    public int isPossible(int[] arr,int students,int pages){
        int curPages=0; int stuCount=1;
        for(int i=0; i<arr.length; i++){
            if(curPages+arr[i]<=pages){
                curPages+=arr[i];
            }else{
                stuCount++;
                curPages=arr[i];
            }
        }
        return stuCount;
    }
    public int findUsingLinearSearch(int[] arr,int students){
        int low=max(arr);
        int high=sum(arr);
        int ans=-1;
        for(int i=low; i<=high; i++){
            int sc=isPossible(arr,students,i);
            if(sc==students){
                ans=i;
                break;
            }
        }
        return ans;
    }

    public int findUsingBinarySearch(int[] arr,int students){
        int low=max(arr);
        int high=sum(arr);

        while(low<=high){
            int mid=(low+high)/2;
            int sc=isPossible(arr,students,mid);
            if(sc>students){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        DistributeBooks d=new DistributeBooks();
        int[] arr=new int[]{25, 46, 28, 49, 24};
        System.out.println(d.findUsingBinarySearch(arr,4));
    }
}
