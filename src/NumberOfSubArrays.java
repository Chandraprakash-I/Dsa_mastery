import java.util.HashMap;

public class NumberOfSubArrays {

    public void count(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int preSum=0;
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            preSum+=arr[i];
            int remove=preSum-target;
            if(map.containsKey(remove)){
                cnt+=map.get(remove);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        NumberOfSubArrays ns=new NumberOfSubArrays();
        ns.count(new int[]{1,2,3},3);
    }
}
