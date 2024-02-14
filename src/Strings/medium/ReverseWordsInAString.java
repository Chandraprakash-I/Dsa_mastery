package Strings.medium;

public class ReverseWordsInAString {

    public String reverse(String s){

        String temp=s;
        StringBuilder ans=new StringBuilder();
        int beg=0;
        for(int i=0; i<s.length(); i++){
            if(temp.charAt(i)==' '){
                if(ans.isEmpty()){
                    ans.append(temp.substring(beg,i));
                    beg=i+1;
                    continue;
                }
                ans.insert(0,temp.substring(beg,i)+" ");
                beg=i+1;
            }
        }
        ans.insert(0,temp.substring(beg)+" ");
        System.out.println(ans.length());
        return ans.toString();
    }
    public static void main(String[] args) {
        ReverseWordsInAString r=new ReverseWordsInAString();
        System.out.println(r.reverse("who am i"));
    }
}
