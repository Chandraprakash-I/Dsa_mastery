package BinarySearch.OneDArray;

public class MinimumInRotatedSortedArray {

    public void find(int[] arr){
        int low=0;
        int high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                //optimization
                index=low;
                System.out.println(arr[low]);
                System.out.println("no of rotation: "+index);
                return;

            }
            if(arr[low]<=arr[mid]){
                //left is sorted

                if(arr[low]<ans){
                    ans=arr[low];
                    index=low;
                }

                low=mid+1;
            }else{

                if(arr[mid]<ans){
                    ans=arr[mid];
                    index=mid;
                }
                high=mid-1;
            }
        }
        System.out.println("minVal "+ans);
        System.out.println("minIndex "+index);
    }
    public static void main(String[] args) {
        MinimumInRotatedSortedArray m=new MinimumInRotatedSortedArray();
        m.find(new int[]{4,5,6,7,0,1,2,3});
    }
}
