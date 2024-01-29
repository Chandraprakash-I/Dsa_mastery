package Arrays.hard;

public class MaxProductSubArray {

    public void find(int[] arr){
        int current=1; int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(current==0)current=1;
            current=current*arr[i];
            if(current>max){
                max=current;
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args) {
        MaxProductSubArray m=new MaxProductSubArray();
        m.find(new int[]{-3,1,0,-1,2});
    }
}
