import java.util.Arrays;
import java.util.HashSet;

public class FourSum {

    public void FourSum(int[] arr,int target){
    HashSet<int[]> ans=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                HashSet<Integer> h=new HashSet<>();
                for(int k=j+1; k<arr.length; k++){
                    int val4=target-(arr[i]+arr[j]+arr[k]);
                    if(h.contains(val4)){
                        int[] t=new int[]{arr[i],arr[j],arr[k],val4};
                        Arrays.sort(t);
                        ans.add(t);
                    }
                        h.add(arr[k]);


                }
            }
        }
        for(int[] i:ans){
            System.out.println(Arrays.toString(i));
        }
    }
    public static void main(String[] args) {
        FourSum fs=new FourSum();
        fs.FourSum(new int[]{4,3,3,4,4,2,1,2,1,1}, 9);
    }
}
