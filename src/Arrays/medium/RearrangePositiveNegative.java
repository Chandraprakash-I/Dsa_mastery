package Arrays.medium;

import java.util.Arrays;

public class RearrangePositiveNegative {

    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] rearrange(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            int j=i+1;
            if(arr[i]<0){
                int k=i+1;
                while(k< arr.length){
                    if(arr[k]>0){
                        swap(arr,i,k);
                    }
                    k++;
                }
            }
            if(arr[j]>0){
                int k=j+1;
                while(k< arr.length){
                    if(arr[k]<0){
                        swap(arr,j,k);
                    }
                    k++;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        RearrangePositiveNegative r=new
                RearrangePositiveNegative();
        System.out.println(Arrays.toString(r.rearrange(new int[]{1,2,-1})));
    }
}
