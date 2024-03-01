package Recursion.patterns;

public class GenerateBinaryString {

    public void generate(String s,int n){
        if(n==0){
            System.out.println(s);
            return ;
        }
        if(s.isEmpty()){
            generate(s+"0",n-1);
            generate(s+"1",n-1);
        }else{
            if( s.charAt(s.length()-1)=='0'){
                generate(s+"0",n-1);
                generate(s+"1",n-1);
            }else{
                generate(s+"0",n-1);
            }
        }


    }
    public static void main(String[] args) {
        GenerateBinaryString g=new GenerateBinaryString();
       g.generate("",5);
    }
}
