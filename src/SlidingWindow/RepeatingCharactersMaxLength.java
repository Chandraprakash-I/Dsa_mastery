package SlidingWindow;

public class RepeatingCharactersMaxLength {

    public  int longestRepeatingSubstring(String str, int k) {
        // Write your code here.

        System.out.println(str.length());

        int left=0;
        int right=0;
        int n=str.length();
        int maxf=0;
        int maxlen=0;
        int [] arr=new int[26];

        while(right<n){
            char ch=str.charAt(right);
            arr[ch-'A']+=1;
            maxf=Math.max(maxf,arr[ch-'A']);

                //trim left
                while((right-left+1)-maxf>k){
                    char ch1=str.charAt(left);
                    arr[ch1-'A']-=1;
                    maxf=0;
                    for(int a:arr){
                        if(a>maxf){
                            maxf=a;
                        }
                    }
                    left++;
                }


            if((right-left+1)-maxf<=k){
                maxlen=Math.max(maxlen,(right-left+1));
            }

            right++;
        }

        return maxlen;

    }

    public static void main(String[] args) {
        RepeatingCharactersMaxLength r=new RepeatingCharactersMaxLength();
        System.out.println(r.longestRepeatingSubstring("MLLLLLLWWVVVVVBBBVVVYYYVVVVV" ,7));
    }
}
