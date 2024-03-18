package Arrays.hard;

public class MaxProductSubArray {

    public void find(int[] arr){
        int prefix=1,suffix=1; int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(prefix==0)prefix=1;
            if(suffix==0)suffix=1;
            prefix=prefix*arr[i];
            suffix=suffix*arr[arr.length-1-i];
            max=Math.max(max,Math.max(prefix,suffix));
        }
        System.out.print(max);
    }
    public static void main(String[] args) {
        MaxProductSubArray m=new MaxProductSubArray();
        m.find(new int[]{-3,1,0,-1,2});
    }
}
