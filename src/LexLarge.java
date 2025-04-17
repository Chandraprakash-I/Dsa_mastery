public class LexLarge {

    public static void main(String[] args){
        String s="welcometojava";
        String max="";
        String min="";

        boolean f=true;
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<s.length(); j++){
               for(int k=0; k<s.length(); k++){
                   if(i!=j && j!=k && i!=k){
                       String temp="";
                       temp+=s.charAt(i);
                       temp+=s.charAt(j);
                       temp+=s.charAt(k);
                       if(f){
                          max= temp;
                          min=temp;
                          f=false;
                       }else{
                           if(temp.compareTo(max)>0){
                               max=temp;
                           }
                           if(temp.compareTo(min)<0){
                               min=temp;
                           }
                       }
                       break;
                   }
               }
            }
        }

        System.out.println(max+" "+min);
    }
}
