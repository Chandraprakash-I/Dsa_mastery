public class ReversePairs {
    int count=0;
    public void count(int[] arr,int low,int mid,int high){
        int right=mid+1;
        for(int i=low; i<=mid; i++){
            while(right<=high && arr[i]>2*arr[right]){
                right++;
            }
            count=count+right-(mid+1);
        }

    }
    public void merge(int[] arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int[] temp=new int[arr.length];
        int index=low;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[index]=arr[left];
                left++;
            }else{
                temp[index]=arr[right];
                right++;
            }
            index++;
        }
        while(left<=mid){
            temp[index]=arr[left];
            left++;
            index++;
        }
        while(right<arr.length){
            temp[index]=arr[right];
            right++;
            index++;
        }

        for(int i=low; i<=high; i++){
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
        count(arr,low,mid,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        ReversePairs m=new ReversePairs();
        int[] arr=new int[]{3,2,1,4};
        m.mergeSort(arr,0, arr.length-1);
        for(int i: arr){
            System.out.print(i);
        }
        System.out.println();
        System.out.print(m.count);
    }
}
