import java.util.HashMap;

public class LongestSubString {

    public void maxLength(String s){
        HashMap<Character,Integer> map=new HashMap<>();

        int left=0;
        int right=0;
        int length=0;
        while(right<s.length()){
            Character c=s.charAt(right);
            System.out.println(c);
            if(map.containsKey(c)){
                left=Math.max(map.get(s.charAt(right))+1,left);
                length=Math.max(right-left+1,length);
            }
            map.put(c,right);


            right++;
        }
        System.out.println(length);
    }
    public static void main(String[] args) {
        LongestSubString lss=new LongestSubString();
        lss.maxLength("abcabcbb");
    }
}
