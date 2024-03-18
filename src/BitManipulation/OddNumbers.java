package BitManipulation;

public class OddNumbers {

    public void find(int [] arr){
        int odd=0;
        for(int i=0; i<arr.length; i++){
            odd=odd^arr[i];
        }
        System.out.println(odd);
        int bitno=0;
        while(true){
            if((odd&1<<++bitno)!=0){
                break;
            }
        }
        System.out.println(bitno);
        int firstOdd=0;
        int secondOdd=0;
        for(int i=0; i<arr.length; i++){
            if((arr[i]&(1<<bitno))!=0){
                firstOdd^=arr[i];
            }else{
                secondOdd^=arr[i];
            }
        }
        if(firstOdd>secondOdd){
            System.out.println(firstOdd+" "+secondOdd);
        }else{
            System.out.println(secondOdd+" "+firstOdd);
        }
    }
    public static void main(String[] args) {
        OddNumbers o=new OddNumbers();
        o.find(new int[]{2, 4, 1, 3, 2, 4});
    }
}
