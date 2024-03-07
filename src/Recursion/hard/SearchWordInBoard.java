package Recursion.hard;

public class SearchWordInBoard {

    public boolean findOtherLetters(char[][] arr,String word,int i,int j,int rows,
                                 int cols,int index){
        if(index==word.length()){
            return true;
        }
        if(i>rows || i<0 || j>cols || j<0 || arr[i][j]=='!'||arr[i][j]!=word.charAt(index)){
            return false;
        }
        char temp=arr[i][j];
        arr[i][j]='!';

        boolean left=findOtherLetters(arr,word,i,j-1,rows,cols,index+1);
        boolean right=findOtherLetters(arr,word,i,j+1,rows,cols,index+1);
        boolean top=findOtherLetters(arr,word,i+1,j,rows,cols,index+1);
        boolean bottom=findOtherLetters(arr,word,i-1,j,rows,cols,index+1);

        arr[i][j]=temp;
        return left||right||top||bottom;
    }
    public boolean findFirstLetter(char[][] arr,String word){
        char c=word.charAt(0);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==c){
                    if(findOtherLetters(arr,word,i,j,arr.length-1,arr[0].length-1,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SearchWordInBoard s=new SearchWordInBoard();

        char[][] board = {{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};

        String word = "ABCCED";
        System.out.println(s.findFirstLetter(board,word));
    }
}
