public class DutchNationalFlagAlgo {

    public void swap(int[] arr,int low,int mid){
        int temp=arr[low];
        arr[low]=arr[mid];
        arr[mid]=temp;
    }

    public void sort(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                 mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }

            }

        for(int i: arr){
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        DutchNationalFlagAlgo d=new DutchNationalFlagAlgo();
        d.sort(new int[]{0, 2, 1, 2, 0, 1});
    }
}
