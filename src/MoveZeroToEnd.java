public class MoveZeroToEnd {

    public void swap(int[] arr,int one,int two){
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }
    public void optimal(int[] arr){
        int i=0;
        for(int k=0; k<arr.length; k++){
            if(arr[k]==0){
                i=k;
                break;
            }
        }
        int j=i+1;
        while(j<arr.length){
            if(arr[j]!=0){
                swap(arr,i,j);
                i++;
            }
            j++;
        }
        for(int l: arr){
            System.out.print(l);
        }
    }
    public void doIt(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                continue;
            }
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]!=0){
                    swap(arr,i,j);
                    break;
                }
            }
        }
        for(int i: arr){
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        MoveZeroToEnd m=new MoveZeroToEnd();
        m.optimal(new int[]{1,0,2,3,0,4,0,1});

    }
}
