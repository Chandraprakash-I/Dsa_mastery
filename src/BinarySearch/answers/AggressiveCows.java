package BinarySearch.answers;

import java.util.Arrays;

public class AggressiveCows {

    public boolean isPossibleToPlace(int[] arr,int cows,int distance){
        int last=arr[0];
        int cowsPlaced=1;
        for(int i=1; i<arr.length; i++){
            if((arr[i]-last)>=distance){
                last=arr[i];
                cowsPlaced++;
            }
            if(cowsPlaced>=cows){
                return true;
            }
        }
        return false;
    }
    public int findUsingLinearSearch(int[] arr,int cows){
        int n=arr[arr.length-1]-arr[0];
        int ans=0;
        for(int i=1; i<=n; i++){
            if(isPossibleToPlace(arr,cows,i)){
                ans=i;
            }else{
                break;
            }
        }
        return ans;
    }

    public int findUsingBinarySearch(int[] arr,int cows){
        int low=1;
        int high=arr[arr.length-1]-arr[0];

        while(low<=high){
            int mid=(low+high)/2;
            if(isPossibleToPlace(arr,cows,mid)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;//we are returning high because of opposite polarity.
    }
    public static void main(String[] args) {
        AggressiveCows a =new AggressiveCows();
        int[] arr=new int[]{4,2,1,3,6};
        Arrays.sort(arr);
        System.out.println(a.findUsingBinarySearch(arr,2));
    }
}
