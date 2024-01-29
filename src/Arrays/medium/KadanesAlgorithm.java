package Arrays.medium;

public class KadanesAlgorithm {

    public int subarray(int[] arr){

        int max=Integer.MIN_VALUE;
        int sum=0;int starti=-1; int endi=-1;
        for(int start=0; start<arr.length; start++){
            if(sum==0){
                starti=start;
            }
            sum=sum+arr[start];

            if(sum>max){
                max=sum;
                endi=start;
            }

            if(sum<0){
                sum=0;
            }


        }
        for(int i=starti; i<=endi; i++){
            System.out.print(arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        KadanesAlgorithm k=new KadanesAlgorithm();
        System.out.println(k.subarray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
