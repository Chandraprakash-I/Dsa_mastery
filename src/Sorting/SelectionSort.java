package Sorting;

public class SelectionSort {
    //select minimums and switch
    public void swap(int[] arr,int one,int two){
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }
    public void sort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            int min=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    swap(arr,j,min);
                }
            }
        }
        for(int i:arr){
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        SelectionSort s=new SelectionSort();
        s.sort(new int[]{3,2,1,3,0});
    }
}
