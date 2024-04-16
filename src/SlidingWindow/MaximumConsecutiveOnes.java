package SlidingWindow;

public class MaximumConsecutiveOnes {

    public void useMostOptimalApproach(int[] arr,int k){
        int left=0;
        int right=0;
        int n=arr.length;
        int zcount=0;
        int maxlen=0;

        while(right<n){
            if(arr[right]==0){
                zcount++;
            }
            if(zcount>k){
                if(arr[left]==0){
                    zcount--;
                }
                left++;
            }else{
                maxlen=Math.max(maxlen,right-left+1);
            }

            right++;
        }
        System.out.println(maxlen);
    }
    public static void main(String[] args) {
        MaximumConsecutiveOnes m=new MaximumConsecutiveOnes();
        m.useMostOptimalApproach(new int[]{1 ,0 ,0 ,1 ,0 ,1 ,0 ,1 ,0 ,1},2);
    }
}
