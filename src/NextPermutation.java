public class NextPermutation {

    public void swap(int[] arr,int one,int two){
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }

    public void reverse(int[] arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public void next(int[] arr){
        int index=-1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(arr,0,arr.length-1);
            for(int i:arr){
                System.out.print(i);
            }
            return;
        }
        for(int i=arr.length-1; i>index; i--){
            if(arr[i]>arr[index]){
                swap(arr,i,index);
            }
        }
        reverse(arr,index+1,arr.length-1);
        for(int i:arr){
            System.out.print(i);
        }

    }
    public static void main(String[] args) {
        NextPermutation n=new NextPermutation();
        n.next(new int[]{3,2,1});
    }
}
