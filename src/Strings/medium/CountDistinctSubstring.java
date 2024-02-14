package Strings.medium;
import java.util.Arrays;
public class CountDistinctSubstring {

    public static int countSubStrings(String str, int k) {

        int[] charArray=new int[26];
        int count=0;
        for(int i=0; i<str.length(); i++){
            String ans="";
            int dc=0;
            Arrays.fill(charArray,0);
            for(int j=i; j<str.length(); j++){

                char c=str.charAt(j);
                if(charArray[c-'a']==0){
                    dc++;
                }
                charArray[c-'a']++;
                if(dc==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CountDistinctSubstring c=new CountDistinctSubstring();
        System.out.println(c.countSubStrings("aacfssa",3));
    }
}
