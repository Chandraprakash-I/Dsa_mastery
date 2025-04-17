package Greedy;

import java.util.Arrays;

public class AssignCookie {

    public static int assign(int[] children,int[] cookie){
        Arrays.sort(children);
        Arrays.sort(cookie);

        int curCookieGiven=0;int count=0;
        for(int i=0; i<children.length; i++){
            for(int j=curCookieGiven; j<cookie.length; j++){
                if(cookie[j]>=children[i]){
                    count++;
                    curCookieGiven=j+1;
                    break;
                }
            }
        }

        return count;
    }
    public static void main(String[] args){
        int[] arr1={1,2};
        int[] arr2={1,2,3};
        System.out.println(assign(arr1,arr2));
    }
}
