public class UniquePaths {

    public int usingCombination(int[][] arr){
        int n=arr[0].length+arr.length-2;
        int r=arr[0].length-1;

        int res=1;
        for(int i=1; i<=r; i++){
            res*=n-r+i/i;
        }
        System.out.println(res);
        return res;
    }

    public int uniquePath(int[][] arr,int[][] dp,int row,int col){
        if(row==arr.length-1&& col==arr[0].length-1){
            return 1;
        }
        if(row >arr.length-1 || col>arr[0].length-1){
            return 0;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        dp[row][col]=uniquePath(arr,dp,row+1,col)+ uniquePath(arr,dp,row,col+1);
        return dp[row][col];
    }
    public static void main(String[] args) {
        UniquePaths u=new UniquePaths();
        int [][] arr=new int[3][2];
        int [][] dp=new int[3][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(u.uniquePath(arr,dp,0,0));
        u.usingCombination(arr);
    }

}
