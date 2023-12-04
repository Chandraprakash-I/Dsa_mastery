import java.util.HashMap;

public class LongestSubArray {

    public void longestSubArray(int[] arr){
        HashMap<Integer,Integer> prefixSum=new HashMap<>();
        int maxlength=0;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum==0){
                maxlength=i+1;
            } else if (prefixSum.containsKey(sum)) {
                maxlength=Math.max(maxlength,i-prefixSum.get(sum));
            }else{
                prefixSum.put(sum,i);
            }
        }
        System.out.println(maxlength);
    }
    public static void main(String[] args) {
        LongestSubArray ls=new LongestSubArray();
        ls.longestSubArray(new int[]{6, -2, 2, -8, 1, 7, 4, -10});
    }
}
