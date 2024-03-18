
package BitManipulation;

public class SieveOfErthosthenesToFindPrimeFactor {

    public void find(int n){
        int[] arr=new int[n+1];
       if(n>1) {

           for (int i = 2; i <= arr.length - 1; i++) {
               if (n % i == 0) {
                   if (arr[i] != 1) {
                       System.out.println(i);
                       int k = 2;
                       for (int j = i * k; j <= arr.length - 1; j = k * i) {
                           arr[j] = 1;
                           k++;
                       }
                   }
               }
           }
       }else{
           System.out.println("Invalid output.");
       }
    }
    public static void main(String[] args) {
        SieveOfErthosthenesToFindPrimeFactor s=new SieveOfErthosthenesToFindPrimeFactor();
        s.find(10);
    }
}
