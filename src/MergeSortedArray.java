public class MergeSortedArray {

    public void swap(int[] arr1,int[] arr2,int m,int n){
        int temp=arr1[m];
        arr1[m]=arr2[n];
        arr2[n]=temp;
    }
    public void merge(int[] arr1,int[] arr2,int m,int n){
        int gap=(m+n)/2+(m+n)%2;
        int len=arr2.length+arr1.length;

        while(gap>0){
            int left=0;
            int right=left+gap;

            while(right<len){
                if(left<m && right>=n){
                    if(arr1[left]>arr2[right-m]){
                        swap(arr1,arr2,left,right-m);
                    }
                }else if(left>=n){
                    if(arr2[left-m]>arr2[right-m]){
                        swap(arr2,arr2,left-m,right-m);
                    }
                }else{
                    if(arr1[left]>arr1[right]){
                        swap(arr1,arr1,left,right);
                    }
                }
                left++;
                right++;
            }

            if(gap==1) break;
            gap=gap/2+gap%2;
        }
        for(int c: arr1){
            System.out.print(c);
        }
        System.out.println();
        for(int c: arr2){
            System.out.print(c);
        }

    }
    public static void main(String[] args) {
        int[] arr1=new int[]{1,3,5};
        int[] arr2=new int[]{2,4,6};
        MergeSortedArray m=new MergeSortedArray();
        m.merge(arr1,arr2,arr1.length,arr2.length);
    }
}
