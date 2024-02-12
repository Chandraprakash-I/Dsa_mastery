package BinarySearch.answers;

public class PeakElement2D {

    public int findMax(int[][] arr,int col,int cols){
        int max=0;

        for(int i=0; i<cols; i++){
            if(arr[i][col]>arr[max][col]){
                max=i;
            }
        }
        return max;
    }
    public int findUsingBinarySearch(int[][] arr,int rows,int cols){
        int low=0;
        int high=cols-1;

        while(low<=high){
            int mid=(low+high)/2;
            int rowNumber=findMax(arr,mid,cols);

            if(mid+1>cols-1 || arr[rowNumber][mid]>arr[rowNumber][mid+1]
                    &&
                    mid-1<0 || arr[rowNumber][mid]>arr[rowNumber][mid-1]){
                return arr[rowNumber][mid];
            }else if(arr[rowNumber][mid]<arr[rowNumber][mid+1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        PeakElement2D p=new PeakElement2D();
        int[][] arr=new int[][]{{9,8,4},{1,2,3},{12,5,3}};
        System.out.println(p.findUsingBinarySearch(arr,3,3));
    }
}
