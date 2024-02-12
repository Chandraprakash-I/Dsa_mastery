package BinarySearch.answers;

public class PumpingStation {

    public int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public int count(int[] arr,double distance){
        int count=0;
        for(int i=0; i<arr.length-1; i++){
            double inBetween=(arr[i+1]-arr[i])/distance;
            if(inBetween==inBetween*distance){
                inBetween--;
            }
            count+=inBetween;
        }
        return count;
    }
    public double findUsingBinarySearch(int[] arr,int pumps){
        double low=0;
        double high=max(arr);

        while(high-low>1e-6){
            double mid=(low+high)/2.0;
            int countOfPumps=count(arr,mid);
            if(countOfPumps>pumps){
                low=mid;
            }else{
                high=mid;
            }
        }
        return high;
    }
    public double findUsingBruteForce(int[] arr,int pumps){
        int[] segments=new int[arr.length-1];
        for(int i=0; i<pumps; i++){

            double maxLength=0; int maxIndex=0;
            for(int j=0; j<arr.length-1; j++){

                double sectionLength=(double)(arr[j+1]-arr[j])/(double) (segments[j]+1);;
                if(sectionLength>maxLength){
                    maxLength=sectionLength;
                    maxIndex=j;
                }
            }
            segments[maxIndex]++;
        }

        double maxAns=-1;

        for(int i=0; i<arr.length-1; i++){
            double ans=(double)(arr[i+1]-arr[i])/(double) (segments[i]+1);
            if(ans>maxAns){
                maxAns=ans;
            }
        }
        return maxAns;
    }
    public static void main(String[] args) {
        PumpingStation p=new PumpingStation();
        int[] arr=new int[]{1,2,3,4,5};
        System.out.println(p.findUsingBinarySearch(arr,4));//0.5answer
    }

    public static class FindSmallestDivisor {

        public int findMax(int[] arr)
        {
            int max=Integer.MIN_VALUE;
            for (int j : arr) {
                if (j > max) {
                    max = j;
                }
            }
            return max;
        }

        public int findDivisonSum(int[] arr,int number){
            int sum=0;
            for(int i=0; i<arr.length; i++){

                sum+=Math.ceil((double) arr[i] / number);
            }
            return  sum;
        }
        public void find(int[] arr,int limit){
            int max=findMax(arr);
            int low=1;
            int high=max;

            int divisor=1;
            while(low<=high){
                int mid=(low+high)/2;
                int sum=findDivisonSum(arr,mid);
                if(sum<=limit){
                    divisor=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }

            }
            System.out.print(divisor);
        }
        public static void main(String[] args) {
            FindSmallestDivisor f=new FindSmallestDivisor();
            f.find(new int[]{1,2,3,4,5},8);
        }
    }
}
