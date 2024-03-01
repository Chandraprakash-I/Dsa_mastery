package Arrays.easy;

public class SecondLargestInArray {

    public int find(int[] arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){

                max=arr[i];
            }
            if(arr[i]>secondMax && arr[i]<max){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        SecondLargestInArray s=new SecondLargestInArray();
        System.out.println(s.find(new int[]{3,2,1}));
    }
}
