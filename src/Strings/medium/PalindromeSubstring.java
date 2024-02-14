package Strings.medium;

public class PalindromeSubstring {

    public boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String find(String s){
        String ans="";
        int maxLength=0;
        for(int i=0; i<s.length(); i++){
            for(int j=s.length()-1; j>i; j--){
                if(j-i>maxLength && isPalindrome(s.substring(i,j))){
                    maxLength=j-1;
                    ans=s.substring(i,j);
                }
            }
        }
        return ans;
    }

    public String n2Approach(String word){
        if(word.length()<=1)return word;

        String ans=""; int maxLength=0;
        for(int i=1; i<word.length(); i++){
            int low=i;
            int high=i;

            while(word.charAt(low)==word.charAt(high)){
                low--;
                high++;

                if(word.substring(low+1,high).length()>maxLength){
                    ans=word.substring(low+1,high);
                    maxLength=ans.length();
                }

                if(low==-1 || high==word.length()){
                    break;
                }
            }

            //if even string
            low=i-1;
            high=i;
            while(word.charAt(low)==word.charAt(high)){
                low--;
                high++;

                if(word.substring(low+1,high).length()>maxLength){
                    ans=word.substring(low+1,high);
                    maxLength=ans.length();
                }

                if(low==-1 || high==word.length()){
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        PalindromeSubstring ps=new PalindromeSubstring();
        System.out.println(ps.n2Approach("ababb"));
    }
}
