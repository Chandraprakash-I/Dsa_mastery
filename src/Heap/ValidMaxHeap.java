package Heap;

public class ValidMaxHeap {
    public int left(int index){
        return (index*2)+1;
    }

    public int right(int index){
        return (index*2)+2;
    }

    public boolean countSub(long arr[], long n)
    {
        // Your code goes here

        for(int i=0; i<arr.length; i++){

            if(left(i)<arr.length-1&&arr[i]<arr[left(i)] || right(i)<arr.length&&arr[i]<arr[right(i)]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        ValidMaxHeap v=new ValidMaxHeap();
        System.out.println(v.countSub(new long[]{9,5,3,8},6));

    }
}
