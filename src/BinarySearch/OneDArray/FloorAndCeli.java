package BinarySearch.OneDArray;

public class FloorAndCeli {

    public void findCeli(int[] arr,int target){//lower bound
        int low=0;
        int high=arr.length-1;

        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                //might be our answer
                ans=arr[mid];
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }

    public void findFloor(int[] arr,int target){
        int low=0;
        int high=arr.length-1;

        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=target){
                //might be our answer
                ans=arr[mid];
                low=mid+1;

            }else{
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        FloorAndCeli f=new FloorAndCeli();
        f.findFloor(new int[]{3, 4, 4, 7, 8, 10},5);
        f.findCeli(new int[]{3, 4, 4, 7, 8, 10},5);
    }
}
