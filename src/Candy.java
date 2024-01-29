import java.util.Arrays;

public class Candy {


    public void find(int[] ratings){
        int n=ratings.length;
        if(n<=1){
            System.out.print(1);
            return;
        }
        int[] ans=new int[n];
        Arrays.fill(ans, 1);

        for(int i=0; i<n; i++){
            if(i==0){
                if(ratings[i]>ratings[i+1]){
                    ans[i]+=1;
                }
            } else if (i==n-1) {
                if(ratings[i]>ratings[i-1]){
                    ans[i]+=1;
                }
            }else{
                if(ratings[i]>=ratings[i+1] && ratings[i]>=ratings[i-1]){
                    ans[i]+=1;
                }
            }
        }
        int sum=0;
        for(int a:ans){
            sum+=a;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Candy c=new Candy();
        c.find(new int[]{1,2,2});
    }
}
