package BinarySearch.answers;

import java.util.*;

public class RowWithMaximumOnes {

    public int lowerbound(ArrayList<Integer> arr){
        int low=0;
        int high=arr.size()-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr.get(mid)>=1){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public int findUsingLowerBound(ArrayList<ArrayList<Integer>> arr){
        int max=0; int index=-1;
        for(int i=0; i<arr.size(); i++){
            int lb=lowerbound(arr.get(i));
            if(lb>=0){
                int oc=arr.get(i).size()-lb;
                if(oc>max){
                    max=oc;
                    index=i;
                }
            }


        }
        return index;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        RowWithMaximumOnes r=new RowWithMaximumOnes();

        System.out.println(r.findUsingLowerBound(matrix));
    }
}
