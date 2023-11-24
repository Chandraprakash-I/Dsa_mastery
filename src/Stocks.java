public class Stocks {

    public void profit(int[] arr){
        int mcp=arr[0];
        int profit=0;
        for(int i=1; i<arr.length; i++){
            int msp=arr[i];
             profit=Math.max(profit,msp-mcp);
            mcp=Math.min(msp,mcp);
        }
        System.out.println(profit);
    }
    public static void main(String[] args) {
        Stocks s=new Stocks();
        s.profit(new int[]{7,6,4,3,1});
    }
}
