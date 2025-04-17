import java.util.Arrays;

public class Candy {


    public void find(int[] ratings){
         int[] left =new int[ratings.length];
         int[] right=new int[ratings.length];

         left[0]=1;
         right[ratings.length-1]=1;

         for(int i=1; i<left.length; i++)
         {
             if(ratings[i]>ratings[i-1]){
                 left[i]=left[i-1]+1;
             }else{
                 left[i]=1;
             }
         }
System.out.println(Arrays.toString(left));
         for(int i= right.length-2; i>=0; i--)
         {
             if(ratings[i]>ratings[i+1]){
                 right[i]=right[i+1]+1;
             }else{
                 right[i]=1;
             }
         }
         System.out.println(Arrays.toString(right));
         int sum=0;
         for(int i=0; i< left.length; i++){
             if(left[i]>right[i]){
                 sum+=left[i];
             }else{
                 sum+=right[i];
             }
         }
         System.out.println("Minimum number of candies required: "+sum);
    }

    public void optimal(int[] ratings){
        int[] left =new int[ratings.length];

        left[0]=1;

        for(int i=1; i<left.length; i++)
        {
            if(ratings[i]>ratings[i-1]){
                left[i]=left[i-1]+1;
            }else{
                left[i]=1;
            }
        }
        System.out.println(Arrays.toString(left));
        int sum=Math.max(left[left.length-1],1 ); int right=1;
        int current=1;
        for(int i= left.length-2; i>=0; i--)
        {
            if(ratings[i]>ratings[i+1]){
                current=right+1;

            }else{
                current=1;
            }
            right=current;
            sum+=current;
        }
        System.out.println("minimum candies: "+sum);
    }
    public static void main(String[] args) {
        Candy c=new Candy();
        c.optimal(new int[]{1,2,2});
    }
}
