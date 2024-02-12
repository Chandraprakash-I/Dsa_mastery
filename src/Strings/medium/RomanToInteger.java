package Strings.medium;

import java.util.HashMap;

public class RomanToInteger {

    public int convert(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int ans=0;
        for(int i=0; i<s.length(); i++){
            int temp=0;
            if(i>0 && map.get(s.charAt(i))>map.get(s.charAt(i-1))){
                ans-=map.get(s.charAt(i-1));
                ans+=(map.get(s.charAt(i))-map.get(s.charAt(i-1)));
            }else{
                temp=map.get(s.charAt(i));
            }
            ans+=temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        RomanToInteger r=new RomanToInteger();
        System.out.println(r.convert("LXXXIX"));
    }
}
