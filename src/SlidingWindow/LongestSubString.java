package SlidingWindow;

import java.util.HashMap;

public class LongestSubString {

    public void useBruteForce(String s){
        int maxCount=0;
        for(int i=0; i<s.length(); i++){
            String temp=""+s.charAt(i);
            for(int j=i+1; j<s.length(); j++){
                if(!temp.contains(""+s.charAt(j))){
                    temp+=s.charAt(j);
                    continue;
                }
                maxCount=Math.max(temp.length(),maxCount);
                break;
            }
        }
        System.out.println(maxCount);
    }

    public void use2Pointer(String  s){
        int left=0;
        int right=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int maxlen=0;
        while(right<n){
            char ch=s.charAt(right);
            if(map.containsKey(ch) && map.get(ch)>=left){
                left=map.get(ch)+1;
            }
            map.put(ch,right);
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        System.out.println(maxlen);
    }
    public static void main(String[] args) {
        LongestSubString l=new LongestSubString();
        l.useBruteForce("asaa");
    }
}
