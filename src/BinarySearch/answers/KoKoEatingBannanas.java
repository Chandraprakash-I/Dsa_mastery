package BinarySearch.answers;

public class KoKoEatingBannanas {

    public void find(int[] arr,int h){
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>high){
                high=arr[i];
            }
        }

        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            double totalHours=0;
            for(int i=0; i<arr.length; i++){
                totalHours+=Math.ceil((double) arr[i]/mid);
            }
            if(totalHours<=h){
                ans=mid;
                high=mid-1;
            } else if(totalHours>h){
                low=mid+1;
            }
        }
        System.out.print(ans);
    }
    public static void main(String[] args) {
        KoKoEatingBannanas k=new KoKoEatingBannanas();
        k.find(new int[]{25, 12, 8, 14, 19},5);
    }
}
