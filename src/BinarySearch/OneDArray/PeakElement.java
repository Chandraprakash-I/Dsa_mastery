package BinarySearch.OneDArray;

public class PeakElement {

    public int find(int[] arr){
        if(arr.length==1){
            return 0;
        }
        if(arr[0]>arr[1])return 0;
        if(arr[arr.length-1]>arr[arr.length-2])return arr.length-1;
        int low=1;
        int high=arr.length-2;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid-1]){
                //we are in increasing slope ,peak is on our right;
                low=mid+1;
            }else if(arr[mid]<arr[mid-1]){
                //we are in decreasing slope , peak is on our left;
                high=mid-1;
            }else{
                //if we are summmit between two peaks we can move to left or right
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        PeakElement p=new PeakElement();
        System.out.println(p.find(new int[]{1,2,3,4,5,6,7,8,5,1}));
    }
}
