package BinarySearch.answers;

public class MinimumDaysToMakeMBouquets
{

    public int maxDays(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public int minDays(int [] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public boolean possible(int[] arr,int day,int nof,int nob){
        int count=0;
        int possible=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=day){
                count++;
            }else{
                possible+=count/nof;
                count=0;
            }
        }
        possible+=count/nof;
        return possible >= nob;
    }
    public int find(int [] arr,int nof,int nob){
        int n=arr.length;
        int f=nof*nob;
        if(n<f){
            return -1;
        }
        int low =minDays(arr);
        int high=maxDays(arr);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,mid,nof,nob)){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        MinimumDaysToMakeMBouquets m=new MinimumDaysToMakeMBouquets();
        System.out.print(m.find(new int[]{1, 10, 3, 10, 2},2,3));
    }
}
