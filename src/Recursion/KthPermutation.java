package Recursion;

import java.util.ArrayList;

public class KthPermutation {

    public void doIt(int n,int k){
        ArrayList<Integer> nums=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++){
            nums.add(i);
            fact*=i;
        }
        nums.add(n);
        k=k-1;
        String ans="";
        while(true){
            ans+=Integer.toString(nums.get(k/fact));
            nums.remove(k/fact);
            if(nums.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/nums.size();
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        KthPermutation n=new KthPermutation();
        int N=4,K=17;
        n.doIt(N,K);
    }
}
