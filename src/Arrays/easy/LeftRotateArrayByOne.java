package Arrays.easy;

import java.util.Arrays;

public class LeftRotateArrayByOne {

    public void rotate(int[] arr){
        int temp=arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
    public static void main(String[] args) {
        LeftRotateArrayByOne l=new LeftRotateArrayByOne();
        int[] arr=new int[]{1,2,3,4};
        l.rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
