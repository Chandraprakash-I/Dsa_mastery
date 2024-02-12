package BinarySearch.answers;

public class DivideBoards {

    public int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public int sum(int [] arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }

    public int isPossible(int[] arr,int painters,int time){
        int pc=1; int ct=0;
        for(int i=0; i<arr.length; i++){
            if(ct+arr[i]<=time){
                ct+=arr[i];
            }else{
                pc++;
                ct=arr[i];
            }
        }
        return pc;
    }
    public int findUsingLinearSearch(int[] arr,int painters){
        int low=max(arr);
        int high=sum(arr);

        for(int i=low; i<=high; i++){
            if(isPossible(arr,painters,i)==painters){
                return i;
            }
        }
        return -1;
    }
    public int findUsingBinarySearch(int[] arr,int painters){
        int low=max(arr);
        int high=sum(arr);

        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(arr,painters,mid)>painters){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        DivideBoards d=new DivideBoards();
        int[] arr=new int[]{10,20,30,40};
        System.out.println(d.findUsingBinarySearch(arr,2));
    }
}
