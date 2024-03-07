package Recursion.hard;

import java.util.ArrayList;
import java.util.Collections;

public class Rat {

    public static boolean dfs(int[][] arr,int row, int col, int er, int ec, String s
            , ArrayList<String> res){
        if(row==er && col==ec){
            res.add(s);
            return true;
        }
        if(row<0 || row>=arr.length||col<0||col>=arr[0].length||arr[row][col]==0
        ||arr[row][col]==-1){
            return false;
        }
        int temp=arr[row][col];
        arr[row][col]=-1;
        boolean top=dfs(arr,row-1,col,er,ec,s+"T",res);
        boolean down=dfs(arr,row+1,col,er,ec,s+"D",res);
        boolean left=dfs(arr,row,col-1,er,ec,s+"L",res);
        boolean right=dfs(arr,row,col+1,er,ec,s+"R",res);
        arr[row][col]=temp;

        return top||down||left||right;
    }
    public static void main(String[] args) {
        Rat r=new Rat();
        int[][] arr=new int[][]{
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        ArrayList<String> res=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==1){
                    res.clear();
                    if(dfs(arr,i,j,arr.length-1,arr[0].length-1,"",res)){
                        Collections.sort(res);
                        for(String s: res){
                            System.out.println(s);
                        }
                        return;
                    }
                }
            }
        }
    }
}
