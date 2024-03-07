package Recursion.patterns;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneNumber {

    public void find(String digits, HashMap<Character,String> map, int index, String ans,
                     ArrayList<String> res){
       if(ans.length()==digits.length()){
           res.add(ans);
           return;
       }

        String s=map.get(digits.charAt(index));
        for(int i=0; i<s.length(); i++){

            find(digits,map,index+1,ans+s.charAt(i),res);

        }
    }
    public static void main(String[] args) {
        PhoneNumber p=new PhoneNumber();
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        ArrayList<String> res=new ArrayList<>();
        p.find("78",map,0,"",res);
        System.out.println(res);
    }
}
