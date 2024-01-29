package Arrays.medium;

public class MooresAlgo {

    public void ma(int[] arr){
        int candidate=arr[0];
        int power=1;
        for(int i=1; i<arr.length; i++){

            if(arr[i]==candidate){
                power++;
            }else{
                power--;
            }
            if(power==0){
                candidate=arr[i];
            }
        }
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==candidate){
                count++;
            }
        }
        if(count>arr.length/2){
            System.out.println(candidate);
        }else{
            System.out.println("no majority");
        }

    }
    public static void main(String[] args) {
        MooresAlgo m=new MooresAlgo();
        m.ma(new int[]{2,2,1,1,1,2,2});
    }
}
