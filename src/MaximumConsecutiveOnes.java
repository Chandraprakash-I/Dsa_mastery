public class MaximumConsecutiveOnes {

    public void maxCount(int[] arr){
        int oCount=0;
        int mCount=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                oCount++;
            }else{
                oCount=0;
            }
            mCount=Math.max(oCount,mCount);
        }
        System.out.print(mCount);
    }
    public static void main(String[] args) {
        MaximumConsecutiveOnes m=new MaximumConsecutiveOnes();
        m.maxCount(new int[]{1, 1, 0, 1, 1, 1});
    }
}
