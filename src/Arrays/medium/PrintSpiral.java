package Arrays.medium;

public class PrintSpiral {

    public  void print(int[][] arr){
        int top=0;
        int bottom=arr.length-1;
        int right=arr[0].length-1;
        int left=0;

        while(left<=right && top<=bottom){

            for(int i=left; i<=right; i++){
                System.out.print(arr[top][i]);
            }

            top++;

            for(int i=top; i<=bottom; i++){
                System.out.print(arr[i][right]);
            }
            right--;


            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    System.out.print(arr[bottom][i]);
                }
                bottom--;

            }


            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    System.out.print(arr[i][left]);
                }
                System.out.println("----");
                left++;
            }


        }
    }
    public static void main(String[] args) {
        PrintSpiral p=new PrintSpiral();
        p.print(new int[][]{
                {1, 2, 3, 4},{5,6,7,8},{9,10,11,12}});
    }
}
