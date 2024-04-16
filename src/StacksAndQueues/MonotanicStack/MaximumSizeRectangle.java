package StacksAndQueues.MonotanicStack;

import java.util.Stack;

public class MaximumSizeRectangle {

    public int findMaxHistogram(int[] arr){
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        //leftmax
        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                left[i]=stack.peek()+1;
            }else{
                left[i]=0;
            }
            stack.push(i);
        }
        stack.clear();
        //rightmax
        for(int i=arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                right[i]=stack.peek()-1;
            }else{
                right[i]=arr.length-1;
            }
            stack.push(i);
        }

        //finding max
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max=Math.max(max,arr[i]*(right[i]-left[i]+1));
        }
        return max;
    }
    public void find(int[][] arr){
        int[] row=arr[0];
        int max=findMaxHistogram(row);
        for(int i=1;i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==1){
                    row[j]+=1;
                }else{
                    row[j]=0;
                }
            }
            int curmax=findMaxHistogram(row);
            max=Math.max(max,curmax);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        MaximumSizeRectangle m=new MaximumSizeRectangle();
        m.find(new int[][]{
                {1, 1 ,1, 1},
                {1, 1 ,1, 1},
                {0 ,0 ,1, 1},
                {0 ,0 ,1, 1},
                });

    }
}
