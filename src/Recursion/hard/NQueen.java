package Recursion.hard;

import java.util.ArrayList;
import java.util.Arrays;

public class NQueen {

    public static boolean possible(char[][] arr,int row,int col){

        int duprow=row;
        int dupcol=col;

        while(duprow>=0 && dupcol>=0){
            if(arr[duprow][dupcol]=='Q')return false;
            duprow--;
            dupcol--;
        }
        dupcol=col;
        duprow=row;
        while(dupcol>=0 && duprow< arr.length){
            if(arr[duprow][dupcol]=='Q')return false;
            duprow++;
            dupcol--;
        }
        dupcol=col;
        while(dupcol>=0){
            if(arr[row][dupcol]=='Q')return false;
            dupcol--;
        }

        return true;

    }
    public static ArrayList<ArrayList<String>> dfs(char[][] arr,ArrayList<ArrayList<String>> res,int col){
        if(col==arr.length){
            ArrayList<String> temp=new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                temp.add(Arrays.toString(arr[i]));
            }
            res.add(temp);

            return res;
        }
        for(int i=0; i<arr.length; i++){
            if(possible(arr,i,col)){
                arr[i][col]='Q';
                dfs(arr,res,col+1);
                arr[i][col]='.';
            }

        }
        return res;
    }


    public static void main(String[] args) {
        NQueen n=new NQueen();

        int size=4;
        char[][] arr=new char[size][size];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j]='.';
            }
        }
        ArrayList<ArrayList<String>> res=new ArrayList<>();
        for(ArrayList<String> i:dfs(arr,res,0)){

                    System.out.println(i);


        }
    }
}
