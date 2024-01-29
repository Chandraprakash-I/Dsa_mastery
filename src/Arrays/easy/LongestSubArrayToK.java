package Arrays.easy;

import java.util.HashMap;

public class LongestSubArrayToK {

    public void twoPointer(int[] arr,int target){
        int left=0;
        int right=0;
        int sum=arr[0];
        int max=0;
        while(right<arr.length){
            while(left<=right && sum>target){
                sum-=arr[left];
                left++;
            }
            if(sum==target){
                max=Math.max(max,right-left+1);
            }
            right++;
            if(right<arr.length)sum+=arr[right];
        }
        System.out.println(max);
    }
    public void length(int[] arr,int target){
        HashMap<Integer,Integer> prefix=new HashMap<>();

        int sum=0;int max=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum==target){
                max=Math.max(max,i+1);
            }
            int rem=sum-target;
            if(prefix.containsKey(rem)){
                max=Math.max(max,i-prefix.get(rem)+1);
            }
            if(!prefix.containsKey(sum)){
                prefix.put(sum,i);
            }

        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        LongestSubArrayToK l=new LongestSubArrayToK();
        l.twoPointer(new int[]{2, 3, 5},5);
    }
}
