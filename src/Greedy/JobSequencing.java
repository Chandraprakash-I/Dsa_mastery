package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Triplet {
    int first;
    int deadline;
    int profit;

    public Triplet(int first, int second, int third) {
        this.first = first;
        this.deadline = second;
        this.profit = third;
    }


}

public class JobSequencing {

    public static void noOfJobs(List<Triplet> list)
    {
        list.sort((a, b) -> {
            return b.profit - a.profit;
        });
        //maxdeadline
        int maxDl=0;
        for(int i=0; i<list.size(); i++){
            maxDl=Math.max(maxDl,list.get(i).deadline);
        }
        int[] days=new int[maxDl+1];
        int profit=0;
        Arrays.fill(days,-1);
        for(Triplet job:list){
            int due=job.deadline;
            if(days[job.deadline]==-1){
                days[job.deadline]=job.first;
                profit+=job.profit;
            }else{
                int index=job.deadline-1;
                while (index>0 && days[index]!=-1){
                    index--;
                }
                if(index>0){
                    days[index]=job.first;
                    profit+=job.profit;
                }
            }
        }
        int count=0;
        for(int a:days){
            if(a!=-1){
                count++;
            }
        }

        
        System.out.println(count+" "+profit);
    }
    public static void main(String[] args) {
        List<Triplet> list = new ArrayList<>();

        list.add(new Triplet(1,4,20));
        list.add(new Triplet(2,1,10));
        list.add(new Triplet(3,1,40));
        list.add(new Triplet(4,1,30));


        noOfJobs(list);
    }
}


