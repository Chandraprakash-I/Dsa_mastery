public class RotateMatrix {

    public void rotate(int[][] arr,int[][] ans){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[0].length; col++){
                 ans[col][arr.length-1-row]=arr[row][col];
            }
        }

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[0].length; col++){
                System.out.print(ans[row][col]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RotateMatrix r=new RotateMatrix();
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans=new int[3][3];
        r.rotate(arr,ans);
    }
}
