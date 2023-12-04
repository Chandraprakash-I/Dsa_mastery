import java.util.HashMap;

public class TwoSum {

    public void twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int val1=arr[i];
            int val2=target-val1;
            if(map.containsKey(val2)){
                System.out.print(" yes, indexes :"+map.get(val2)+" "+i);
                return;
            }
            map.put(val1,i);
        }
        System.out.print("no, indexes: -1 -1");
    }
    public static void main(String[] args) {
        TwoSum t=new TwoSum();
        t.twoSum(new int[]{-1,1,1},0);
    }
}
