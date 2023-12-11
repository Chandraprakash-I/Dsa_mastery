import java.util.Arrays;

public class MaximumNumberOfPlatforms {

    public void optimalApproach(int[] arrival,int[] depature){
        Arrays.sort(arrival);
        Arrays.sort(depature);

        int i=1,j=0;
        int max=1; int count=1;
        while(i<arrival.length && j<depature.length){
            if(arrival[i]<=depature[j]){
                count++;
                i++;
            }else if(arrival[i]>depature[j]){
                count--;
                j++;
            }
            max=Math.max(max,count);
        }
        System.out.print(max);
    }
    public void count(int[] arrival,int[] depature){

        int ans=1;
        for(int i=0; i<arrival.length; i++){
            int count=1;
            int firstArrival=arrival[i];
            int firstDepature=depature[i];
            for(int j=i+1; j<arrival.length; j++){
                if((arrival[j]<=firstArrival && depature[j]<=firstDepature)||
                        (arrival[j]>=firstArrival && depature[j]<=firstDepature)){
                    count++;
                }
            }
            ans=Math.max(ans,count);

        }
        System.out.print(ans);
    }
    public static void main(String[] args) {
        MaximumNumberOfPlatforms m=new MaximumNumberOfPlatforms();
        m.count(new int[]{1020,1200},new int[]{1050,1230});
        m.optimalApproach(new int[]{1020,1200},new int[]{1050,1230});
    }
}
