import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SetMatrixZero {

    public void makeZero(int[][] arr, HashMap<Integer,ArrayList<Integer>> map){
        for(Map.Entry<Integer,ArrayList<Integer>> entry: map.entrySet()){
            int row=entry.getKey();
            ArrayList<Integer> col=entry.getValue();
            for(int i=0; i<arr[0].length; i++){
                arr[row][i]=0;
            }
            int j=0;
            while (j<col.size()){
                for(int k=0; k<arr.length; k++){
                    arr[k][col.get(j)]=0;
                }
                j++;
            }
        }

    }

    public int[][] setZero(int[][] arr){
        HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
        for(int r=0; r<arr.length; r++){
            ArrayList<Integer> pc=new ArrayList<>();
            for(int c=0; c<arr[0].length; c++){
                if(arr[r][c]==0){
                    pc.add(c);
                }
            }
            if(!pc.isEmpty()){
                map.put(r,pc);
            }


        }
        makeZero(arr,map);
        return arr;
    }
    public static void main(String[] args) {
        int[][] a=new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        SetMatrixZero s=new SetMatrixZero();
        for(int[] b:s.setZero(a)){
            for (int j : b) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
