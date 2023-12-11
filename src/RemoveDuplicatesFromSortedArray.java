public class RemoveDuplicatesFromSortedArray {

    public void remove(int[] arr){
        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
            j++;
        }
        for(int a: arr){
            System.out.print(a);
        }
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray r=new RemoveDuplicatesFromSortedArray();
        int[] arr=new int[]{1,1,1,2,2,3,3,3,3,4,4};
        r.remove(arr);
    }
}
