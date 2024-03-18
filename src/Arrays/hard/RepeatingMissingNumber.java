package Arrays.hard;

import java.util.Arrays;

public class RepeatingMissingNumber {

    public int[] find(int[]arr){
        //xor all elements in the array and elements from 1 to n
        int res=0;
        for(int i=0; i<arr.length; i++){
            res=res^arr[i];
            res=res^(i+1);
        }
        //find the results differentiating bit
        int bitNo=0;
        while(true){
            if((res & (1<<bitNo))!=0){
                break;
            }
            bitNo++;
        }
        //separate into 0 and 1 club
        int zero=0; int one=0;
        int i=0;
        while(i<arr.length){
            if(((1<<bitNo)&(arr[i]))!=0){
                one=one^arr[i];
            }else{
                zero=zero^arr[i];
            }
            i++;
        }

        for (int j = 1; j <= arr.length; j++) {
            //part of 1 group:
            if ((j & (1<<bitNo)) != 0) {
                one = one ^ j;
            }
            //part of 0 group:
            else {
                zero = zero ^ j;
            }
        }
        //verify to find the missing and repeating
        int cnt=0;
        for(int k=0; k<arr.length; k++){
            if(one==arr[k]){
                cnt++;
            }
            if(cnt==2)return new int[]{one, zero};
        }
        return new int[]{zero,one};

    }
    public static void main(String[] args) {
        int[] arr=new int[]{3,1,2,5,3};
        RepeatingMissingNumber r=new RepeatingMissingNumber();
        System.out.println(Arrays.toString(r.find(arr)));
    }
}
