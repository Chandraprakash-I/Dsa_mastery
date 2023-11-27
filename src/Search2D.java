public class Search2D {

    public boolean binarySearch(int[][] arr,int low ,int high,int target){
        if(low!=high){
            int mid=(low+high)/2;
            int size=arr[0].length;
            int row=mid/size;
            int col=mid%size;
            if(arr[row][col]==target){
                return true;
            }
            if(target>arr[row][col]){
                return binarySearch(arr,mid+1,high,target);
            }else{
                return binarySearch(arr,low,mid,target);
            }
        }

    return false;

    }


    public static void main(String[] args) {
        Search2D s=new Search2D();
        int[][] arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(s.binarySearch(arr,0,8,15));
    }
}
