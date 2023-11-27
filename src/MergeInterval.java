import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeInterval {

    public void merge(int[][] arr){
        int low=arr[0][0];
        int high=arr[0][1];
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(ans.isEmpty() || arr[i][0]>ans.get( ans.size() - 1).get(1)){
               ArrayList<Integer> temp=new ArrayList<>();
                temp.add(arr[i][0]);
                temp.add(arr[i][1]);
                ans.add(temp);
            }else{
                ans.get( ans.size() - 1).remove(1);
                ans.get( ans.size() - 1).add(arr[i][1]);
            }
        }
        System.out.println(Arrays.toString(ans.toArray()));
    }
    public static void main(String[] args) {
        MergeInterval m=new MergeInterval();
        int[][] arr={{1,3},{2,6},{8,10},{15,18}};
        Comparator<int[]> comparator=Comparator.comparingInt(a -> a[0]);
        Arrays.sort(arr,comparator);
        m.merge(arr);
    }
}
