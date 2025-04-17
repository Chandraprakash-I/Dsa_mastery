package Recursion.patterns;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumThree {

    public List<List<Integer>> rFunction(int number, int k,int sum,int s, List<Integer> list,List<List<Integer>> res)
    {

        if(list.size()==k )
        {

            if(s==sum)
            {
                List<Integer> l = new ArrayList<>(list);
                res.add(l);

            }
            return res;
        }
        if(!list.contains(number))
        {
            list.add(number);
        }
        if(number<10)
        {
            rFunction(number+1,k,sum,s+number,list,res);
            list.remove(list.size()-1);
            rFunction(number+1,k,sum,s,list,res);
          
        }




        return res;
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        return rFunction(1,k,n,0,new ArrayList<>(),new ArrayList<>());
    }
    public static void main(String[] args){
    CombinationSumThree th=new CombinationSumThree();
    System.out.println(th.combinationSum3(3,7));
    }
}
