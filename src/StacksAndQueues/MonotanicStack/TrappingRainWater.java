package StacksAndQueues.MonotanicStack;

public class TrappingRainWater {

    public void optimalApproach(int[] arr){
        int left=0;
        int right=arr.length-1;
        int leftMax=0;
        int rightMax=0;
        int waterCount=0;
        while(left<right){
            if(arr[left]<arr[right]){
                if(arr[left]>leftMax){
                    leftMax=arr[left];
                }else{
                   waterCount+=leftMax-arr[left];
                }
                left++;
            }else{
                if(arr[right]>rightMax){
                    rightMax=arr[right];
                }else{
                    waterCount+=rightMax-arr[right];
                }
                right--;
            }
        }
        System.out.println(waterCount);
    }
    public void betterApproach(int[] arr){
        int[] prefix=new int[arr.length];
        int[] suffix=new int[arr.length];
        int waterCount=0;
        suffix[arr.length-1]=arr[arr.length-1];
        prefix[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i]=Math.max(arr[i],prefix[i-1]);
        }
        for(int i=arr.length-2; i>=0; i--){
            suffix[i]=Math.max(arr[i],suffix[i+1]);
        }
        for(int i=0; i<arr.length; i++){
            waterCount+=Math.min(prefix[i],suffix[i])-arr[i];
        }
        System.out.println(waterCount);
    }
    public void waterCount(int[] arr){

        int waterCount=0;

        for(int i=0; i<arr.length; i++){
            int maxLeft=0;
            int fml=i;
            while(fml>=0){
                maxLeft=Math.max(maxLeft,arr[fml]);
                fml--;
            }

            fml=i;
            int maxRight=0;
            while(fml<arr.length){
                maxRight=Math.max(maxRight,arr[fml]);
                fml++;
            }
            waterCount+=Math.min(maxLeft,maxRight)-arr[i];
        }
        System.out.print(waterCount);
    }
    public static void main(String[] args) {
        int[] arr=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainWater t=new TrappingRainWater();
        t.waterCount(arr);
        t.betterApproach(arr);
        t.optimalApproach(arr);
    }
}
