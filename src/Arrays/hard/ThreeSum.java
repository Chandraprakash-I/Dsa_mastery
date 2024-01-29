package Arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ThreeSum {

    public void threeSumThreePointer(int[] arr,int target){
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(i>0 && arr[i]==arr[i-1])continue;
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<target){
                    j++;
                }else if(sum>target){
                    k--;
                }else{
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+".");
                    j++;
                    k--;
                    while(arr[j]==arr[j-1])j++;
                    while(arr[k]==arr[k+1])k--;
                }
            }
        }
    }
    public void threeSum(int[] arr){
        HashSet<ArrayList<Integer>> ans=new HashSet<>();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int val3=-(arr[i]+arr[j]);

                for(int k=j+1; k<arr.length; k++){
                    if(arr[k]==val3 ){
                        ArrayList<Integer> a=new ArrayList<>();
                        a.add(arr[i]);
                        a.add(arr[j]);
                        a.add(arr[k]);
                        ans.add(a);
                    }
                }
            }
        }
        for (ArrayList<Integer> triplet : ans) {
            System.out.println(triplet);
        }
    }
    public static void main(String[] args) {
        ThreeSum s=new ThreeSum();
        s.threeSumThreePointer(new int[]{-1,0,1,0},0);
    }
}
