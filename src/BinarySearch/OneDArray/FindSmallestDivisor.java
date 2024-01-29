package BinarySearch.OneDArray;

//Find the Smallest Divisor Given a Threshold
//Problem Statement:
// You are given an array of integers ‘arr’ and an integer i.e. a threshold value ‘limit’.
// Your task is to find the smallest positive integer divisor, such that
// upon dividing all the elements of the given array by it,
// the sum of the division’s result is less than or equal to the given threshold value.

//Example 2:
//Input Format: N = 4, arr[] = {8,4,2,3}, limit = 10
//Result: 2
//Explanation: If we choose 1, we get 17 as the sum. If we choose 2,
// we get 9(4+2+1+2) <= 10 as the answer. So, 2 is the answer.

public class FindSmallestDivisor {

    public int findMax(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public int findDivisonSum(int[] arr,int number){
        int sum=0;
        for(int i=0; i<arr.length; i++){

            sum+=Math.ceil((double) arr[i] / number);
        }
        return  sum;
    }
    public void find(int[] arr,int limit){
        int max=findMax(arr);
        int low=1;
        int high=max;

        int divisor=1;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=findDivisonSum(arr,mid);
            if(sum<=limit){
                divisor=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        System.out.print(divisor);
    }
    public static void main(String[] args) {
        FindSmallestDivisor f=new FindSmallestDivisor();
        f.find(new int[]{1,2,3,4,5},8);
    }
}
