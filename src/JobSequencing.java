import java.util.Arrays;
import java.util.Comparator;

class Job{
    int jobId;
    int deadLine;
    int profit;
    Job(int jobId,int deadLine,int profit){
        this.deadLine=deadLine;
        this.jobId=jobId;
        this.profit=profit;
    }
}

class C implements Comparator<Job>{

    @Override
    public int compare(Job o1, Job o2) {
        if(o1.profit<o2.profit){
            return 1;
        }else if(o1.profit>o2.profit){
            return -1;
        }
        return 0;
    }
}
public class JobSequencing {

    public void jobProfitCount(Job[] arr){
        C c=new C();
        Arrays.sort(arr,c);
        int maxDeadLine=0;
        for(Job j: arr){
            if(j.deadLine>maxDeadLine){
                maxDeadLine=j.deadLine;
            }
        }
        int[] temp=new int[maxDeadLine+1];
        for(int i=0; i<temp.length; i++){
            temp[i]=-1;
        }

        int jCount=0;int profit=0;
        for(int i=0; i<arr.length; i++){

            for(int j=arr[i].deadLine; j>0; j--){
                if(temp[j]==-1){
                    temp[j]=i+1;
                    jCount++;
                    profit+=arr[i].profit;
                    break;
                }
            }
        }
        System.out.print("Jcount : "+jCount+" Profit : "+profit);
    }
    public static void main(String[] args) {
        Job[] arr = new Job[4];
        arr[0] = new Job(1,4,20);
        arr[1] = new Job(2, 1, 10);
        arr[2] = new Job(3,1,40);
        arr[3] = new Job(4, 1, 30);
        JobSequencing j=new JobSequencing();
        j.jobProfitCount(arr);
    }
}
