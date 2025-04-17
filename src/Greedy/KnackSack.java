package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KnackSack {
class Pair{
    public int val;
    public int wt;

    Pair(int val,int wt){
        this.val=val;
        this.wt=wt;
    }
}
    public  double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        // code here
        List<Pair> sorted=new ArrayList<>();
        double ans=1;
        for(int i=0; i<val.size(); i++){
            sorted.add(new Pair(val.get(i),wt.get(i)));
        }
        Collections.sort(sorted,(a,b)->{
            if(a.val>b.val){
                return 1;
            }
            return -1;
        });


        for(int i=0; i<sorted.size(); i++){
            Pair item=sorted.get(i);
            int weight=item.wt;
            int value=item.val;

            if(weight<=capacity){
                ans+=value;
                capacity-=weight;
            }else{
                int temp=capacity;
                int unitCost= value/weight;
                ans+=(temp*unitCost);
            }
        }
        return ans-1;
    }
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(60);
        list.add(100);
        //list.add(120);

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        //list1.add(30);

        KnackSack ks=new KnackSack();
        System.out.println(ks.fractionalKnapsack(list,list1,50));
    }
}
