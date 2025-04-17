package Greedy;

public class JumpGame2 {

    public static int optimal(int[] arr,int l,int h,int jump){
        if(h==arr.length-1){
            return jump;
        }
        return optimal(arr,h+1,arr[l],jump+1);
    }
    public static int findMinJump(int[] arr,int index,int count){
        if(index==arr.length-1){
            return count;
        }
        int minCount=Integer.MAX_VALUE;
        for(int i=1; i<=arr[index]; i++){
            minCount=Math.min(minCount,findMinJump(arr,index+i,count+1));
        }
        return minCount;
    }
    public static void main(String[] args){
        int[] arr={2,3,0,1,4};
        System.out.println(optimal(arr,0,0,0));
    }
}
