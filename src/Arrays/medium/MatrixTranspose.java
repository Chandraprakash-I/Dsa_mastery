package Arrays.medium;

public class MatrixTranspose {

    public void doTrans(int[][] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MatrixTranspose m=new MatrixTranspose();
        m.doTrans(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
