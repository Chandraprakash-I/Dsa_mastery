package BinarySearch.answers;

public class MedianOfTwoSortedArray {

    public double findUsingBinarySearch(int[] arr1,int[] arr2){

        if(arr2.length<arr1.length){
            findUsingBinarySearch(arr2,arr1);
        }
        int n=arr1.length+arr2.length;
        int left=(arr1.length+arr2.length+1)/2;
        int low=0;
        int high=arr1.length;
        while(low<=high){

            int mid1=(low+high)/2;
            int mid2=left-mid1;
            int l1 = (mid1 > 0) ? arr1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? arr2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < arr1.length) ? arr1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < arr2.length) ? arr2[mid2] : Integer.MAX_VALUE;


            if(l1<=r2 && l2<=r1){
                if(n%2==1){
                    return Math.max(l1,l2);
                }
                return  (double) (Math.max(l1,l2)+Math.min(r1,r2))/2;
            }else if(l1>r2){
                high=mid1-1;
            }else {
                low=mid1+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        MedianOfTwoSortedArray m=new MedianOfTwoSortedArray();
        int[] arr2=new int[]{2,3,6,7,9};
        int[] arr1=new int[]{1,4,8,10};
        System.out.println(m.findUsingBinarySearch(arr1,arr2));
    }
}
