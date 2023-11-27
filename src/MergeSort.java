public class MergeSort {

    public void merge(int[] arr,int low ,int mid,int high){
        int[] temp=new int[arr.length];
        int left=low;
        int right=mid+1;
        int index=low;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[index++]=arr[left];
                left++;
            }else{
                temp[index++]=arr[right];
                right++;
            }
        }
        while(left<=mid){
            temp[index++]=arr[left];
            left++;
        }
        while(right<arr.length){
            temp[index++]=arr[right];
            right++;
        }
        for(int i=0; i<temp.length; i++){
            arr[i]=temp[i];
        }

    }
    public void mergeSort(int[] arr,int low,int high){
        if(low==high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void main(String[] args) {
        MergeSort m=new MergeSort();
        int[] arr=new int[]{5,4};
        m.mergeSort(arr,0, arr.length-1);
        for(int i: arr){
            System.out.print(i);
        }
    }
}
