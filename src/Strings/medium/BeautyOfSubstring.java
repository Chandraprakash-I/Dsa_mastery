package Strings.medium;

public class BeautyOfSubstring {


    public int beauty(int[] arr){

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            max=Math.max(max,arr[i]);
            if(arr[i]>=1){
                min=Math.min(min,arr[i]);
            }

        }
        return max-min;
    }
    public int find(String s){
        int res=0;
        for(int i=0; i<s.length(); i++){
            int[] arr=new int[26];
            for(int j=i; j<s.length(); j++){
                arr[s.charAt(j)-'a']++;
                res=res+beauty(arr);
            }

        }
        return res;
    }
    public static void main(String[] args) {
        BeautyOfSubstring bs=new BeautyOfSubstring();
        System.out.println(bs.find("aabcb"));
    }
}
