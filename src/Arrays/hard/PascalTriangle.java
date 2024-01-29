package Arrays.hard;

public class PascalTriangle {
    public void printPattern(int row,int col){
        for(int i=0; i<row; i++){
            int num=1;
            for(int j=0; j<=i; j++){
                System.out.print(num+" ");
//                if(i==row-1 && col==j){
//                    System.out.print("e :"+num);
//                }
                num=num*(i-j)/(j+1);

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        PascalTriangle pt=new PascalTriangle();
        pt.printPattern(n,2);
    }
}
