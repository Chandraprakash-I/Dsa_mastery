package Greedy;

import java.util.ArrayList;
import java.util.List;

public class NonOverlappingInterval {

    public static void nonOverlappingInterval(List<Pair> list){
    list.sort((a,b)->a.end-b.end);
    int intervalcount=1;
    int pe=list.get(0).end;
    for(Pair p:list){
        if(p.start>=pe){
            intervalcount++;
            pe=p.end;
        }

    }
    System.out.println(list.size()-intervalcount);
    }
    public static void main(String[] args){

        ArrayList<Pair> a=new ArrayList<>();
        a.add(new Pair(1,2));
        a.add(new Pair(1,2));
        a.add(new Pair(1,2));
        
        nonOverlappingInterval(a);
    }
}
