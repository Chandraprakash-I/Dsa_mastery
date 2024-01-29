package BinarySearch.answers;

public class MissingPositiveNumbers {


    //first find the nearest number or interval
    public int findUsingBinarySearch(int[] arr,int k){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if((arr[mid]-(mid+1))>k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return k+high+1;
    }
    public int findUsingBruteForce(int[] arr,int k){

        for(int i=0; i<arr.length; i++){
            if(arr[i]<=k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        MissingPositiveNumbers m=new MissingPositiveNumbers();
        int[] arr=new int[]{4,7,9,10};
        System.out.println(m.findUsingBruteForce(arr,1));
        System.out.println(m.findUsingBinarySearch(arr,1));
    }
}
