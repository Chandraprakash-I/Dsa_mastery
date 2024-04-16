package StacksAndQueues.ImplementationProblems;

import java.util.Arrays;
import java.util.Stack;

class Stock{
    int s;
    int cnt;
    Stock(int s,int cnt){
        this.s=s;
        this.cnt=cnt;
    }
}
public class StockSpan {

    public static int[] findStockSpans(int []prices) {

        Stack<Stock> stack=new Stack<>();
        int[] ans=new int[prices.length];
        for(int i=0; i<prices.length; i++){
            int c=1;
            while(!stack.isEmpty() && stack.peek().s<prices[i]){
                c+=stack.pop().cnt;
            }
            stack.push(new Stock(prices[i], c));
            ans[i]=c;
        }
        return ans;
    }

    public static void main(String[] args) {
        StockSpan s=new StockSpan();
        System.out.println(Arrays.toString(s.findStockSpans(new int[]{100, 80, 60, 70, 60, 75, 85})));
    }
}
