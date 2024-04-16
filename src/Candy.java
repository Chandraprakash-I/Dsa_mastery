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
        for(int i=0; i<ratings.length; i++){
            if((i==n-1||ratings[i]>ratings[i+1]) && (i==0||ratings[i]>ratings[i-1])){
                ans[i]=ans[i]+1;
            }else if((i==n-1||ratings[i]<ratings[i+1] ) && (i==0|| ratings[i]>ratings[i-1])){
                if(i!=0 && i!=n-1){
                    ans[i]=ans[i]+1;
                    ans[i+1]=ans[i+1]+2;
                }

            }else if((i==n-1||ratings[i]>ratings[i+1]) && (i==0||ratings[i]<ratings[i-1])){
                if(i!=0 && i!=n-1){
                    ans[i]=ans[i]+1;
                    ans[i-1]=ans[i-1]+2;
                }

            }
        }
        System.out.println(Arrays.toString(ans));

    }
    public static void main(String[] args) {
        Candy c=new Candy();
        c.find(new int[]{1,2,2});
    }
}
