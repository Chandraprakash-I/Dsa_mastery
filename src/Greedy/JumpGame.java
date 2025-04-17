package Greedy;

public class JumpGame {

    public static boolean optimal(int[] arr){
        int maxIndex=0;
        for(int i=0; i<arr.length; i++){

            if(i>maxIndex){
                return false;
            }
            if(i+arr[i]>maxIndex){
                maxIndex+=arr[i];
            }

        }
        return true;
    }
    public static boolean canMakeIt(int[] arr,int index,int n){
        if(arr.length-2==n){
            return false;
        }
        if(index==arr.length-1){
            return true;
        }
        for(int i=1; i<=arr[index]; i++){
            if(canMakeIt(arr,index+i,n+1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] jumpGame={3,2,1,0,4};
        System.out.println(optimal(jumpGame));
    }
}
