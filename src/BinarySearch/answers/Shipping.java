package BinarySearch.answers;

public class Shipping {

    //i need to find the minimum weight capacity for the ship in a way that the ship can carry all the packages
    //within given days

    //intution1
    //i can take 1 as low and sum of all weights as high and try to use binary search

    public int findHigh(int[] arr){
        int h=0;
        for (int j : arr) {
            h += j;
        }
        return h;
    }

    public boolean possible(int[] arr,int weight,int days){
        int currentWeight=0;
        int d=0;
        for(int i=0; i<arr.length; i++){
            currentWeight+=arr[i];
            if(currentWeight > weight){
                currentWeight=arr[i];
                d++;
            }
        }

        return d == days;
    }
    public int findWeight(int[] arr,int days){
        int low=1;
        int high=findHigh(arr);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,mid,days)){
                low=mid+1;
                ans=low;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Shipping s=new Shipping();
        int [] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(s.findWeight(arr,1));
    }

}
