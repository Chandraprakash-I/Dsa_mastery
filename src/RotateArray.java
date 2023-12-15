public class RotateArray {

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
        for(int i:r.rotateArray(new int[]{1,2,3},6)){
            System.out.print(i);
        }
    }
}
