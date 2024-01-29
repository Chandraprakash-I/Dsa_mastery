package Arrays.hard;

public class n3Algo {

    public void find(int[] arr){
        int c1=Integer.MIN_VALUE,p1=0,c2=Integer.MIN_VALUE,p2=0;

        for(int i=0; i<arr.length; i++){
            if(p1==0 && arr[i]!=c2){
                c1=arr[i];
            }
            if(p2==0 && arr[i]!=c1){
                c2=arr[i];
            }
            if(arr[i]==c1){
                p1++;
            }else if(arr[i]==c2)
            {
                p2++;
            }else{
                p1--;
                p2--;
            }
        }
        int c1c=0; int c2c=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==c1){
                c1c++;
                continue;
            }
            if(arr[i]==c2){
                c2c++;
            }
        }
        if(c2c>arr.length/3){
            System.out.println(c2);
        }
        if(c1c>arr.length/3){
            System.out.println(c1);
        }
    }
    public static void main(String[] args) {
        n3Algo a=new n3Algo();
        a.find(new int[]{1,2,2,3,2});

    }
}
