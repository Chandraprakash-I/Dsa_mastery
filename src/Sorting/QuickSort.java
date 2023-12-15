package Sorting;

public class QuickSort {
   //pick a pivot,partion, repeat.
   public void swap(int[] arr,int one,int two){
       int temp=arr[one];
       arr[one]=arr[two];
       arr[two]=temp;
   }
    public int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<pivot && i<=high-1){
                i++;
            }
            while(arr[j]>=pivot && j>=low+1){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }

        }
        swap(arr,low,j);
        return j;
    }
    public void sort(int[] arr,int low ,int high){
       if(low<high){
           int partitionIndex=partition(arr,low,high);
           sort(arr,low,partitionIndex-1);
           sort(arr,partitionIndex+1,high);
       }

    }
    public static void main(String[] args) {
        QuickSort q=new QuickSort();
        int[] arr=new int[]{0,9,2,1,7};
        q.sort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i);
        }
        }
}
