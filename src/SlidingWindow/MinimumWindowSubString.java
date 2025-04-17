package SlidingWindow;

public class MinimumWindowSubString {

    public void findUsingSlidingWindow(String word ,String contain){
        int left=0;
        int right=0;
        int[] arr=new int[256];
        int startIndex=-1;
        int minlen=Integer.MAX_VALUE;
        int cnt=0;
        for(int p=0; p<contain.length(); p++){
            arr[contain.charAt(p)]++;
        }
        while (right<word.length()){
            if(arr[word.charAt(right)]>0){
                cnt++;
            }
            arr[word.charAt(right)]--;
            while(cnt==contain.length()){
                if(right-left+1<minlen){
                    minlen=right-left+1;
                    startIndex=left;
                }
                arr[word.charAt(left)]++;
                if(arr[word.charAt(left)]>0){
                    cnt--;
                }
                left++;
            }
            right++;
        }
        System.out.println(minlen);
        System.out.println("start index: "+startIndex);
        System.out.println(word.substring(startIndex,startIndex
                +minlen));
    }

    public void findUsingBruteForce(String word,String contain){

        int c=contain.length();

        int cnt=0; int startIndex=-1;
        int minlen=Integer.MAX_VALUE;
        int n=word.length();

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                //set map
                int[] arr=new int[256];
                for(int p=0; p<contain.length(); p++){
                    arr[contain.charAt(p)]++;
                }
                for(int k=i; k<=j; k++){
                    if(arr[word.charAt(k)]>0){
                        cnt++;
                    }
                    arr[word.charAt(k)]--;
                    if(cnt==contain.length()){
                        if(k-i+1<minlen){
                            startIndex=i;
                            minlen=k-i+1;
                            break;
                        }

                    }
                }
                cnt=0;
            }

        }
        System.out.println(minlen);
        System.out.println("start index: "+startIndex);
        System.out.println(word.substring(startIndex,startIndex
        +minlen));
    }
    public static void main(String[] args) {
        MinimumWindowSubString m=new MinimumWindowSubString();
        m.findUsingBruteForce("abbca","abc");
    }
}
