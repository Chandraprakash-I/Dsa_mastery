package Recursion.hard;

import java.util.ArrayList;

public class PalindromePartioning {

    public boolean isPalindrome(String word ,int start,int end){
        while(start<=end){
            if(word.charAt(start++)!=word.charAt(end--)){
                return  false;
            }

        }

        return true;
    }
    public void doIt(String word, int index, ArrayList<ArrayList<String>> ans,ArrayList<String > list){
        if(index==word.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index; i<word.length(); i++){
            if(isPalindrome(word,index,i)){
                list.add(word.substring(index,i+1));
                doIt(word,i+1,ans,list);
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        PalindromePartioning p=new PalindromePartioning();
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        p.doIt("amma",0,ans,new ArrayList<String>());
        for(ArrayList<String> s: ans){
            System.out.print(s);
        }
    }
}
