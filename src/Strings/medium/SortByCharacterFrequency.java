package Strings.medium;

import java.util.*;

public class SortByCharacterFrequency {

    public String sort(String s){
        Map<Character,Integer> m=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>> ans=new ArrayList<>(m.entrySet());
        Collections.sort(ans,(a,b)->b.getValue()-a.getValue());

        for(Map.Entry<Character,Integer> entry:ans){
            Character c=entry.getKey();
            int val=entry.getValue();
            for(int i=0; i<val; i++){
                sb.append(c);

            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        SortByCharacterFrequency s=new SortByCharacterFrequency();
        System.out.println(s.sort("treeaaa"));
    }
}
