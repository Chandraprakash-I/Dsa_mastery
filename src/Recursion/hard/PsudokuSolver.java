package Recursion.hard;

public class PsudokuSolver {

    public static boolean validate(char[][] arr,int number,int row,int col){

        for(int i=0; i<arr.length; i++){
            if(arr[i][col]==number){
                return false;
            }
            if(arr[row][i]==number){
                return false;
            }
            if(arr[3*(row/3)+(i/3)][3*(col/3)+(i%3)]==number){
                return false;
            }
        }
        return true;
    }
    public static boolean solve(char[][] arr,int row,int col){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j]=='.'){
                    for(char n='1'; n<='9'; n++){
                        if(validate(arr,n,i,j)){
                            arr[i][j]=n;
                            if(solve(arr,row,col)){
                                return true;
                            }
                            arr[i][j]='.';

                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        PsudokuSolver ps=new PsudokuSolver();
        char[][] Puzzle = {
                {'5', '.', '.', '4', '.', '9', '.', '6', '2'},
                {'.', '.', '.', '8', '.', '.', '.', '3', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '9'},
                {'7', '.', '.', '.', '.', '.', '.', '9', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '2', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '9', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'1', '.', '.', '.', '.', '.', '5', '.', '.'}
        };
        solve(Puzzle,Puzzle.length,Puzzle.length);
        for(int i=0; i<Puzzle.length; i++){
            for(int j=0; j<Puzzle.length; j++){
                System.out.print(Puzzle[i][j]);
            }

            System.out.println();
        }

    }
}
