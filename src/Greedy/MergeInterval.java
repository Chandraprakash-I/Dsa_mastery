package Greedy;

import java.util.ArrayList;
import java.util.List;

class Pair{
    public int start;
    public int end;
    public Pair(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
}
public class MergeInterval {

    public static void striverOptimal(List<List<Integer>> list){
        list.sort((a,b)->{
            if(a.get(0)-b.get(0)<0){
                return -1;
            }else if(a.get(0)-b.get(0)>0){
                return 1;
            }else{
                return 0;
            }
        });
        Pair p=new Pair(list.get(0).get(0),list.get(0).get(1));
        ArrayList<Pair> ans=new ArrayList<>();
        for(List<Integer> interval:list)
        {
            if(interval.get(0)<=p.end){
                p.end=Math.max(p.end,interval.get(1));
            }else{
                ans.add(p);
                Pair temp=new Pair(interval.get(0),interval.get(1) );
                p=temp;
            }
        }
        ans.add(p);

        for(Pair l:ans){
            System.out.println(l.start+"-"+l.end);
        }
    }
    public  static  void mergeBrute(List<List<Integer>> list){
        list.sort((a,b)->{
            if(a.get(0)-b.get(0)<0){
                return -1;
            }else if(a.get(0)-b.get(0)>0){
                return 1;
            }else{
                return 0;
            }
        });
        List<List<Integer>> ans=new ArrayList<>();

        for (int i=0; i<list.size(); i++){
            List<Integer> l=list.get(i);
            if(!ans.isEmpty() &&l.get(0)<ans.get(ans.size()-1).get(1)){
                continue;
            }
            for(int j=i+1; j<list.size(); j++){
                List<Integer> c=list.get(j);
                if(c.get(0)<=l.get(1)){
                    l.set(1,Math.max(c.get(1),l.get(1)));
                }
            }

            ans.add(l);
        }

    }
    public static  void main(String[] args){
    List<List<Integer>> list=new ArrayList<>();
    List<Integer> l=new ArrayList<>();
    List<Integer> l2=new ArrayList<>();
        List<Integer> l3=new ArrayList<>();
        List<Integer> l4=new ArrayList<>();
    l.add(1);
        l.add(3);
        l2.add(2);
        l2.add(6);
        l3.add(8);
        l3.add(10);
        l4.add(15);
        l4.add(18);
        list.add(l);
        list.add(l2);

        list.add(l3);
        list.add(l4);
        striverOptimal(list);
    }
}
