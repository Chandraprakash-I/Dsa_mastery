public class ArrayInversion {
    int count=0;
    public void merge(int[] arr,int low ,int mid){
        int[] temp=new int[arr.length];
        int left=low;
        int right=mid+1;
        int index=0;
        while(left<=mid && right<arr.length){
            if(arr[left]<=arr[right]){
                temp[index++]=arr[left];
                left++;
            }else{
                temp[index++]=arr[right];
                count+=(mid-left+1);
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
        System.arraycopy(temp, 0, arr, 0, temp.length);

    }
    public void mergeSort(int[] arr,int low,int high){
        if(low==high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid);
    }
    public void inverse(int[] arr){
        mergeSort(arr,0,arr.length-1);
        for(int a: arr){
            System.out.println(a);
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr=new int[]{5,4,3,2,1};
        ArrayInversion a=new ArrayInversion();
        a.inverse(arr);
    }
}
