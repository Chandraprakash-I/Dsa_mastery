package SlidingWindow;

public class MaxPoints {

    public void find(int[] arr,int k){
        int lsum=0; int rsum=0;
        int ri=arr.length-1;
        int max=0;
        for(int i=0; i<k;i++){
            lsum+=arr[i];
        }
        max=lsum;
        for(int i=0; i<k; i++){
            lsum-=arr[k-1-i];
            rsum+=arr[ri-i];
            max=Math.max(max,lsum+rsum);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        MaxPoints m=new MaxPoints();
        m.find(new int[]{9 ,7 ,5 ,3 ,2 ,1 ,8},4);
    }
}
