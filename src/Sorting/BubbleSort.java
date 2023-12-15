package Sorting;

public class BubbleSort {
//move the maximum to the last using adjacent swaps

    public void swap(int[] arr,int one,int two){
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }
    public void sort(int[] arr){

        for(int i=arr.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        for(int i:arr){
            System.out.print(i);
        }

    }
    public static void main(String[] args) {
        BubbleSort b=new BubbleSort();
        b.sort(new int[]{-3,2,1,3,0});
    }
}
