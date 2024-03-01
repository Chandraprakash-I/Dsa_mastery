package Arrays.easy;

public class RotateArray {

    public int[] usingBruteForce(int[] arr,int k){
        k=k%arr.length;
        int[] temp=new int[arr.length];
        int j=0;
        int w=arr.length-k;
        for(int i=w; i<arr.length; i++){
            temp[j]=arr[i];
            j++;
        }
        for(int i=0; i<w; i++){
            temp[j]=arr[i];
            j++;
        }
        return temp;
    }
    public void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
//        for(int i:arr){
//            System.out.print(i);
//        }
    }
    public int[] rotateArray(int[] a, int k) {
        // Write your code here.

        k=k%a.length;
        int n=a.length;
        reverse(a,0,k-1);
        reverse(a,k,n-1);
        reverse(a,0,n-1);
        return a;
    }
    public static void main(String[] args) {
        RotateArray r=new RotateArray();
        for(int i:r.usingBruteForce(new int[]{1,2,3,4,5,6,7},2)){
            System.out.print(i);
        }
    }
}
