package Arrays.easy;

public class MaxConsecutiveOnes {

    public void max(int[] arr){
        int count=0;
        int max=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                count++;
                max=Math.max(max,count);
            }else{
                count=0;
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args) {
        MaxConsecutiveOnes mm=new MaxConsecutiveOnes();
        mm.max(new int[]{1, 1, 0, 1, 1, 1});
    }
}
