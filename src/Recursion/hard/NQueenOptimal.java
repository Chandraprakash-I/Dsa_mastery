package Recursion.hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueenOptimal {

    public static ArrayList<ArrayList<String>> dfs(char[][] arr,ArrayList<ArrayList<String>> res
            ,int col,int[] left,int[] upleft,int[] lowleft){
        if(col==arr.length){

            res.add(new ArrayList<>(construct(arr)));

            return res;
        }
        for(int i=0; i<arr.length; i++){
            if(left[i]==1 || lowleft[i+col]==1 || upleft[(arr.length-1)+(col-i)]==1){
                return res;
            }
            left[i]=1;
            lowleft[i+col]=1;
            upleft[(arr.length-1)+(col-i)]=1;
            arr[i][col]='Q';
            dfs(arr,res,col+1,left,upleft,lowleft);
            arr[i][col]='.';
            left[i]=0;
            lowleft[i+col]=0;
            upleft[(arr.length-1)+(col-i)]=0;
        }
        return res;
    }

    static List< String > construct(char[][] board) {
        List< String > res = new LinkedList< String >();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    public static void main(String[] args) {
        NQueenOptimal n=new NQueenOptimal();

        int size=4;
        char[][] arr=new char[size][size];
        construct(arr);
        ArrayList<ArrayList<String>> res=new ArrayList<>();
        int[] left=new int[arr.length];
        int[] upperLeftDiagnal=new int[(arr.length*2)-1];
        int[] lowerLeftDiagnal=new int[(arr.length*2)-1];

        for(ArrayList<String> i:dfs(arr,res,0,left,upperLeftDiagnal,lowerLeftDiagnal)){

            System.out.println(i);


        }
    }
}
