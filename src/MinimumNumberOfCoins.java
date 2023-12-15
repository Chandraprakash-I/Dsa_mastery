import java.util.ArrayList;

public class MinimumNumberOfCoins {

    public void count(int[] arr,int val){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=arr.length-1; i>0; i--){

            while(val>=arr[i]){
                val-=arr[i];
                ans.add(arr[i]);
            }
        }
        for(int i:ans){
            System.out.print(i);
        }
        System.out.println();
        System.out.println(ans.size());
    }
    public static void main(String[] args) {
        MinimumNumberOfCoins m=new MinimumNumberOfCoins();
        int[] denominations=new int[]{1,2,5,10,20,50,100,500,1000};
        m.count(denominations,70);
    }
}
