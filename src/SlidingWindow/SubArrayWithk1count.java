package SlidingWindow;

public class SubArrayWithk1count {

    public  int subarrayWithSum(int []arr, int k) {
        // Write your code here
        int left=0;
        int right=0;
        int sum=0;
        int cnt=0;
        while(right<arr.length){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }

                cnt+=(right-left+1);


            right++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        SubArrayWithk1count s=new SubArrayWithk1count();
        int[] arr={2 ,1 ,3 ,2 ,4 };
        System.out.println(s.subarrayWithSum(arr,2)-s.subarrayWithSum(arr,1));
    }
}
