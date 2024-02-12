package Strings.easy;

import java.util.HashMap;

public class IsomorphicStrings {

    public boolean find(String s1,String s2){
        HashMap<Character,Character> map=new HashMap<>();
        if(s1.length()!=s2.length()) return false;
        for(int i=0; i<s2.length(); i++){
            char key=s1.charAt(i);
            char val=s2.charAt(i);
            if(!map.containsKey(key)){
                if(!map.containsValue(val)){
                    map.put(key,val);
                }else{
                    return false;
                }

            }else{
                if(!(map.get(key)==val)){
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        IsomorphicStrings i=new IsomorphicStrings();
        System.out.println(i.find("aaa","bbb"));

    }
}
