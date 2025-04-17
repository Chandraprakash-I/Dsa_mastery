import java.util.HashSet;
import java.util.Set;

public class SingleIteration {

    public static void main(String[] args){
        String ans="program";

        Set<Character> c=new HashSet<>();
        for(int i=0; i<ans.length(); i++){
            if(c.contains(ans.charAt(i))){
                System.out.println(ans.charAt(i));
            }else{
                c.add(ans.charAt(i));
            }
        }
    }
}
