package BinarySearch.OneDArray;

public class TotalOccurance {

    public static void anotherMethod(int[] arr,int target){
        int start=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                start=mid;
                high=mid-1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.print(start);

        int end=-1;
        low=0;high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                end=mid;
                low=mid+1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.print(end);
        System.out.println(end-start+1);
    }
    public void upperBound(int[] arr,int target){
        int ub=arr.length;
        int low=0;int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ub=mid;
                high=mid-1;
            }else{

                low=mid+1;
            }
        }
        System.out.print(ub);

    }
    public static void main(String[] args) {

        anotherMethod(new int[]{0, 0, 1, 1, 2, 2, 2, 2},2);
    }
}
