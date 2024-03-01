package Recursion.patterns;

import java.util.ArrayList;

public class CombinationSumIII {

    public void uCombination(ArrayList<String> res,ArrayList<Integer> ans,int k,int target,
                             int sum,int val){

            if(val>=1 && val<=9) {

                if (sum > target) {
                    return;
                }

                if (sum == target && ans.size()==k) {
                    res.add(ans.toString());
                    return;
                }
                ans.add(val);
                sum += val;
                uCombination(res, ans, k, target, sum, val+1);
                ans.remove(ans.size() - 1);
                sum -= val;
                uCombination(res, ans, k, target, sum, val+1);
            }

    }
    public ArrayList<String> find(int k,int target){
        ArrayList<String> res=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        uCombination(res,ans,k,target,0,1);
        return res;
    }
    public static void main(String[] args) {
        CombinationSumIII c=new CombinationSumIII();
        System.out.println(c.find(3,8));
    }
}
