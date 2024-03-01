package Arrays.medium;

public class SetMatrickZero
{

    public void set(int[][] arr){
        int col0=1;
        //setting first row and column
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==0){
                    if(i==0 && j==0){
                        arr[i][j]=0;
                    }
                    if(j!=0){
                        arr[i][0]=0;
                        arr[0][j]=0;
                    }else{
                        col0=0;
                    }
                }
            }
        }

        for(int i=1; i<arr.length; i++){
            for(int j=1; j<arr[0].length; j++){
                if(arr[i][j]!=0){
                    if(arr[i][0]==0 || arr[0][j]==0){
                        arr[i][j]=0;
                    }
                }
            }
        }

        if(col0==0){
            for(int j=0; j<arr.length; j++){
                arr[j][0]=0;
            }
        }
        if(arr[0][0]==0){
            for(int i=0; i<arr.length; i++){
                arr[0][i]=0;
            }
        }



        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("col0 :"+col0);
}
    public static void main(String[] args) {
        SetMatrickZero s=new SetMatrickZero();
        s.set(new int[][]{{1,1,1},{1,1,1},{1,1,0}});
    }
}
