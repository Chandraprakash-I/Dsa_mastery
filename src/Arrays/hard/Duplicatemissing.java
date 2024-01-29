package Arrays.hard;

import java.util.Arrays;

public class Duplicatemissing {

    public void duplicateMissing(int[] arr){
        int[] ref=new int[arr.length+1];
        int duplicate=0;
        for(int i=0; i<arr.length; i++){
            if(ref[arr[i]]==1){
                duplicate=arr[i];
            }else{
                ref[arr[i]]=1;
            }

        }
        for(int i=1; i<ref.length; i++){
            if(ref[i]==0){
                System.out.println(duplicate);
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Duplicatemissing d=new Duplicatemissing();
        int[] arr=new int[]{3,1,2,5,4,6,7,5};
        Arrays.sort(arr);
        d.duplicateMissing(arr);
    }
}
