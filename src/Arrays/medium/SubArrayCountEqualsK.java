package Arrays.medium;

import java.util.HashMap;

public class SubArrayCountEqualsK {

    public void find(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0; int cnt=0;
        for(int i=0; i<arr.length; i++){

            sum+=arr[i];

            if(map.containsKey(sum)){
                map.put(sum,map.getOrDefault(sum,0)+1);
            }else{
                map.put(sum,1);
            }
            int rem=sum-k;
            if(map.containsKey(rem)){
                cnt+=map.get(rem);
            }

        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        SubArrayCountEqualsK s=new SubArrayCountEqualsK();
        s.find(new int[]{ 1, 2, 1},3);//2
    }
}
