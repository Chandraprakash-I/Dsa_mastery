public class Sprint {

    public static void main(String[] args) {
        String s="a100b3";
        int i=0;
        int n=s.length();

        String ans="";
        while(i<n){
            char ch=s.charAt(i);
            int j=i+1;
            String digit="";
            while(j<n && Character.isDigit(s.charAt(j))){
                digit+=s.charAt(j);
                j++;
            }
            i=j;

            for(int k=0; k<Integer.parseInt(digit); k++){
              ans+=ch;
            }
        }
        System.out.println(ans);
    }
}
