package Sorting;

public class InsertionSort {
    //place a element in its correct position

    public void swap(int[] arr,int one,int two){
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }
    public void sort(int[] arr){


            for(int j=0; j<arr.length; j++){
                while(j>0 && arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }


        for(int i:arr){
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        InsertionSort i=new InsertionSort();
        i.sort(new int[]{0,9,2,1,7});
    }
}
