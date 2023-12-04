import java.util.HashSet;

public class LongestSubSequence {

    public int longestSub(int[] arr){
        HashSet<Integer> h=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            h.add(arr[i]);
        }
        int max=1;
        for(int i=0; i<arr.length; i++){
            int current=arr[i];
            if(h.contains(current-1)){
              continue;
            }
            int cc=1;
            current+=1;
            while(h.contains(current)){
                cc++;
                current+=1;
            }
            max=Math.max(max,cc);
        }
        return max;
    }
    public static void main(String[] args) {
        LongestSubSequence l=new LongestSubSequence();
        System.out.println(l.longestSub(new int[]{100, 200, 1, 3, 2, 4}));
    }
}
