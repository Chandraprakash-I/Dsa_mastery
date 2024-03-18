package BinarySearch.OneDArray;

public class NumberOfTimesRotated {

    public void times(int[] arr){
        int low=0;
        int high=arr.length-1;

        int index=-1;
        int ans=Integer.MAX_VALUE;

        while(low<=high){
            int mid=(low+high)/2;

            //left is sorted.
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    index=low;
                    ans=arr[low];
                }
                low=mid+1;
            }
            //right is sorted
            else{
                if(arr[mid]<ans){
                    index=mid;
                    ans=arr[mid];
                }
                high=mid-1;
            }
        }
        System.out.println(index);

    }
    public static void main(String[] args) {
        NumberOfTimesRotated n=new NumberOfTimesRotated();
        n.times(new int[]{4,5,6,7,3});
    }
}
