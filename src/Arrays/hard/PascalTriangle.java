package Arrays.hard;

public class PascalTriangle {
    public void printElement(int row,int col){
        int n=row-1;
        int r=col-1;
        int ans=1;
        for(int i=0; i<r; i++){
            ans*=(n-i);
            ans=ans/(i+1);
        }
        System.out.println(ans);

    }
    public void printRowNaive(int row){


        for(int i=1; i<=row; i++){
            printElement(row,i);
        }
    }

    public void printRowOptimal(int row){
        int ans=1;
        System.out.println(ans);
        for(int i=1; i<row; i++){
            ans*=(row-i);
            ans=ans/(i);
            System.out.println(ans+" ");
        }
    }

    public void printRows(int rows){
        for(int i=1; i<=rows; i++){
            printRowNaive(i);
        }
    }
    public static void main(String[] args) {
        int n=5;
        PascalTriangle pt=new PascalTriangle();
        pt.printRows(5);
    }
}
