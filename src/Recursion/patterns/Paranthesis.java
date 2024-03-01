package Recursion.patterns;

public class Paranthesis {

    public void find(String s,int n,int oc,int cc){
        if(oc==n && cc==n){
            System.out.println(s);
            return;
        }
        if(oc<n){
            find(s+"(",n,oc+1,cc);
        }
        if(cc<oc){
            find(s+")",n,oc,cc+1);
        }
    }
    public static void main(String[] args) {
        Paranthesis p=new Paranthesis();
        p.find("",3,0,0);
    }
}
