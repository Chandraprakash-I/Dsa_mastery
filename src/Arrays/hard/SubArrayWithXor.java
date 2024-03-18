package Arrays.hard;

import java.util.HashMap;

public class SubArrayWithXor {

    public void find(int[] arr,int target){

        int cnt=0; int xr=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0; i<arr.length; i++){
            xr=xr^arr[i];

            int rem=xr^target;

            if(map.containsKey(rem)){
                cnt+=map.get(rem);
            }
            map.put(xr,map.getOrDefault(xr,0)+1);
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        SubArrayWithXor s=new SubArrayWithXor();
        s.find(new int[]{4, 2, 2, 6, 4},6);
    }
}
