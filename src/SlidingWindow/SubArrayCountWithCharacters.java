package SlidingWindow;

import java.util.Arrays;

public class SubArrayCountWithCharacters {

    public void find(String s){
        int[] arr=new int[3];
        Arrays.fill(arr,-1);
        int left=0;
        int right=0;
        int cnt=0;
        while(right<s.length()){
            arr[s.charAt(right)-'a']=right;
            cnt+=Math.min(Math.min(arr[0],arr[1]),arr[2])+1;
            right++;
        }
        System.out.println(cnt);
    }
    public static void main(String[] args){
        SubArrayCountWithCharacters s=new SubArrayCountWithCharacters();
        s.find("baac");
    }
}
