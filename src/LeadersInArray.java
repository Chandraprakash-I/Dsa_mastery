public class LeadersInArray {

    public void print(int[] arr){
        System.out.print(arr[arr.length-1]);
        int max=arr.length-1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]>arr[max]){
                System.out.print(arr[i]);
                max=i;
            }
        }
    }
    public static void main(String[] args) {
        LeadersInArray l=new LeadersInArray();
        l.print(new int[]{4, 7, 1, 0});
    }
}
