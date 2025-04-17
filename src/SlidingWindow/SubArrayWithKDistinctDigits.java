package SlidingWindow;

import java.util.HashMap;

public class SubArrayWithKDistinctDigits {

    public int doIt(int[] arr,int k){
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int right=0;

        while(right<arr.length){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);

            while(map.size()>k){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }

            if(map.size()<=k){
                cnt+=(right-left+1);
            }
            right++;
        }
        return cnt;
    }
    public int find(int[] arr,int k){
        return doIt(arr,k)-doIt(arr,k-1);
    }
    public static void main(String[] args) {
        SubArrayWithKDistinctDigits s=new SubArrayWithKDistinctDigits();
        System.out.println(s.find(new int[]{2, 1 ,3 ,2, 4},2));
    }
}
