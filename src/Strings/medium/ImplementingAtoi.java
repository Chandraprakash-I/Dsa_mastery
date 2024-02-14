package Strings.medium;

public class ImplementingAtoi {

    public int find(String word){
        int ans=0;
        for(int i=0; i<word.length(); i++){
            char c=word.charAt(i);
            int val=c-'0';

            if(val>=0 && val<=9){
                if(ans==0){
                    ans=val;
                    continue;
                }
                ans=(ans*10)+val;
            }else{
                return -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ImplementingAtoi im=new ImplementingAtoi();
        System.out.println(im.find("32"));
    }
}
