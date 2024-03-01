package Recursion.patterns;

public class SubSequence {

    public void find(String s,String ans,int pickedTimes){
        if(pickedTimes==s.length()){
            System.out.println(ans);
            return;
        }
        char c=s.charAt(pickedTimes);
        find(s,ans+c,pickedTimes+1);
        find(s,ans,pickedTimes+1);

    }
    public static void main(String[] args) {
        SubSequence s=new SubSequence();
        s.find("abc","",0);
    }
}
