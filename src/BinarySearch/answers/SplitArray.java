package BinarySearch.answers;

public class SplitArray {

    public int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public int sum(int [] arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }

    public int isPossible(int[] arr,int noa,int sum){
        int ac=1;
        int cs=0;
        for(int i=0; i<arr.length; i++){
            if(cs+arr[i]<=sum){
                cs+=arr[i];
            }else{
                ac++;
                cs=arr[i];
            }
        }

        return ac;
    }
    public int findUsingLinearSearch(int[] arr,int noa){
        int low=max(arr);
        int high=sum(arr);

        for(int i=low; i<=high; i++){
            if(isPossible(arr,noa,i)==noa){
                return i;
            }
        }
        return -1;
    }

    public int findUsingBinarySearch(int[] arr,int noa){
        int low=max(arr);
        int high=sum(arr);

        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(arr,noa,mid)>noa){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        SplitArray s=new SplitArray();
        int[] arr=new int[]{3,5,1};
        System.out.println(s.findUsingBinarySearch(arr,3));
    }
}
