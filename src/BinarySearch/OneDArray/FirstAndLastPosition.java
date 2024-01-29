package BinarySearch.OneDArray;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastPosition {


        public static int lb(ArrayList<Integer> arr,int k){
            int start=0;
            int low=0;int high=arr.size()-1;
            //lower bound
            while(low<=high){
                int mid=(low+high)/2;

                if(arr.get(mid)>=k){
                    start=mid;
                    high=mid-1;//next small index which is greater0requal
                }else{
                    low=mid+1;
                }
            }
            return start;
        }

        public static int ub(ArrayList<Integer> arr,int k){
            //upper bound
            int end=arr.size();
            int low=0;int high=arr.size()-1;
            while(low<=high){
                int mid=(low+high)/2;

                if(arr.get(mid)>k){
                    end=mid;
                    high=mid-1;//next small index which is greater

                }else{

                    low=mid+1;
                }
            }
            return end;
        }

        public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
            // Write your code here.
            if(lb(arr,k)==arr.size() || arr.get(lb(arr,k))!=k){
                return new int[]{-1,-1};
            }

            return new int[]{lb(arr,k),ub(arr,k)-1};
        }

    public static void main(String[] args) {
        FirstAndLastPosition f=new FirstAndLastPosition();

        for(int i:firstAndLastPosition(new ArrayList<Integer>(Arrays.asList(0, 0, 1, 1, 2, 2, 2, 2)),8,2)){
            System.out.print(i);
        }
    }

}
