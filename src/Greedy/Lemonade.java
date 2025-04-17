package Greedy;

public class Lemonade {

    public static boolean striversApproach(int[] arr){
        int five=0; int ten=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==5){
                five++;
            }else if(arr[i]==10){
                if(five>0){
                    five--;
                    ten++;
                }else{
                    return false;
                }
            }else{
                if(ten>0&&five>0){
                    ten--;
                    five--;
                }else if(five>=3){
                    five-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean canIGiveChange(int[] arr){
        int five=0;
        int ten=0;
        int twenty=0;

        for(int i=0; i<arr.length; i++){
            int note=arr[i];
            if(note-5==0){
                five++;
                continue;
            }
            int change=note-5;
            while(twenty>0 && 20<=change){
                change-=20;
                twenty--;
            }
            while(ten>0 && 10<=change){
                change-=10;
                ten--;
            }
            while (five>0 && 5<=change){
                change-=5;
                five--;
            }
            if(change!=0){
                return false;
            }
            if(arr[i]==10){
                ten++;
            }else if(arr[i]==20){
                twenty++;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr={5,5,10,10,20};
        System.out.println(canIGiveChange(arr));
    }
}
