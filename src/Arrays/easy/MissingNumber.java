package Arrays.easy;

public class MissingNumber {

    public int find(int[] arr){
        int j=0;
        for(int i=0; i<arr.length; i++){
            j+=1;
            if(arr[i]==j){
                continue;
            }
            return j;
        }
        return -1;
    }
    public static void main(String[] args) {
        MissingNumber m=new MissingNumber();
        System.out.println(m.find(new int[]{1,3,4}));
    }
}
