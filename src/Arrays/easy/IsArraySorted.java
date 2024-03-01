package Arrays.easy;

public class IsArraySorted {

    public boolean isSorted(int[] arr){
        for(int i=0; i<arr.length-2; i++){
            if(arr[i]<=arr[i+1]){
                continue;
            }
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        IsArraySorted is=new IsArraySorted();
        System.out.println(is.isSorted(new int[]{1,2,3}));
    }
}
