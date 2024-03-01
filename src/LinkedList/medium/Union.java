package LinkedList.medium;

import java.util.ArrayList;

public class Union {

    public ArrayList<Integer> find(int[] arr1,int[] arr2){
        ArrayList<Integer> ans=new ArrayList<>();
        int n1=arr1.length; int n2=arr2.length;
        int i=0; int j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                if(!ans.contains(arr1[i])){
                    ans.add(arr1[i]);
                }
                i++;
            }else{
                if(!ans.contains(arr2[j])){
                    ans.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n1){
            ans.add(arr1[i]);
            i++;
        }
        while(j<n2){
            ans.add(arr2[j]);
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Union u=new Union();
        for(int a:u.find(new int[]{1,2,3,3},new int[]{4,5,6})){
            System.out.println(a);
        }
    }
}
