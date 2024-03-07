package Recursion.hard;

import java.util.ArrayList;

public class WordBreak {

    public static boolean dfs(String s,ArrayList<String> words,int index,int len,int count){
        if(count>=len){
           return false;
        }
        if(s.isEmpty()){
            return true;
        }
        if(words.contains(s.substring(0,index+1))){
            s=s.substring(index+1);
            index=-1;
        }
        return dfs(s,words,index+1,len,count+1);

    }
    public static void main(String[] args) {
        WordBreak w=new WordBreak();
        ArrayList<String> words=new ArrayList<>();
        words.add("cat");
        words.add("sand");
        words.add("dog");
        System.out.println(dfs("catsandog",words,0,9,0));

    }
}
