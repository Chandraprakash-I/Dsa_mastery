package BitManipulation;

public class SubSequenceUsingBit {

    public void find(String s){
        int n=(int)Math.pow(2,s.length());
        for(int i=0; i<n; i++){
            String ans="";
            for(int j=0; j<s.length(); j++){
                if((i&(1<<j))!=0){
                    ans+=s.charAt(j);
                }
            }
            System.out.println(ans);

        }
    }

    public static void main(String[] args) {
        SubSequenceUsingBit s=new SubSequenceUsingBit();
        s.find("abcdefgh");
    }
}
