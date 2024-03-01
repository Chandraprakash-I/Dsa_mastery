package Arrays.medium;

public class MaxSumSubArray {

    public int find(int[] arr){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        MaxSumSubArray m=new MaxSumSubArray();
        System.out.println(m.find(new int[]{-1,-2,-3}));
    }
}
