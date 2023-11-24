package Recursion;

import java.util.ArrayList;

public class Recursion {

    //combination sum
    public void combinationSum(int[] candidates,int start,int target,ArrayList<Integer> pos
                               ){
            if(target==0){
                for(int a:pos){
                    System.out.print(a);
                }
                System.out.println();
                return;
            }
            for(int i=start; i<candidates.length; i++){
                if(candidates[i]>target){
                    continue;
                }
                pos.add(candidates[i]);
                combinationSum(candidates,i,target-candidates[i],pos);
                pos.remove(pos.size()-1);
            }
    }

    //paranthesis generation
    public void paranthesis(String current,int left, int right , ArrayList<String > res){
        if(left==0 && right==0){
            System.out.println(current);
            res.add(current);
            return ;
        }
        if(left>0){
            paranthesis(current+"(",left-1,right,res);
        }
        if(right>left){
            paranthesis(current+")",left,right-1,res);
        }
    }

    //subset sum problem
    public boolean subset(int[] arr,int target,int n){
         if(target==0){
            return true;
        }
        if(n==0 && target!=0){
            return false;
        }
        if(arr[n-1]>target){
            return subset(arr,target,n-1);
        }
        return subset(arr,target,n-1)||subset(arr,target-arr[n-1],n-1);
    }

    //permutation of string
    public void permutation(String word,String current){
        if(word.length()==0){
            System.out.println(current);
            return;
        }
        for(int i=0; i<word.length(); i++){
            String rem=word.substring(0,i)+word.substring(i+1);
            permutation(rem,current+word.charAt(i));
        }

    }
    //merge sort
    public void merge(int[] arr,int[] temp,int start,int end,int mid){
        for(int i=0; i<arr.length; i++){
            temp[i]=arr[i];
        }
        int i=start;
        int j=mid+1;
        int k=start;
        while(i<=mid && j<=end){
            if(temp[i]<=temp[j]){
                arr[k]=temp[i];
                i++;
            }else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k]=temp[i];
            i++;
        }
    }
    public void divide(int[] arr,int[] temp,int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            divide(arr,temp,start,mid);
            divide(arr,temp,mid+1,end);
            merge(arr,temp,start,end,mid);
        }
    }
    public void mergesort(int arr[]){
        if(arr.length==0){
            System.out.println("empty array");
        }
        if(arr.length==1){
            System.out.println("already sorted");
        }
        int[] temp=new int[arr.length];
        divide(arr,temp,0,arr.length-1);
    }
    //tower of hanoi
    public void printMove(int start,int end){
        System.out.println(start +"->"+end);
    }
    public void toh(int n,int start,int end,int aux){
        if(n==1){
            printMove(start,end);
            return;
        }
        toh(n-1,start,end,aux);
        printMove(start,end);
        toh(n-1,aux,start,end);
    }
    //find element in sorted array using binary search
    public int fe(int[] arr,int n,int start,int end){
        int mid=0;
        if(start<=end){
            mid=(start+end)/2;
        }
        if(arr[mid]==n){
            return mid;
        }
        if(n>arr[mid]){
            return fe(arr,n,mid+1,end);
        }else{
            return fe(arr,n,start,mid-1);
        }

    }
    public boolean palin(String s){
        if(s.length()==0 || s.length()==1){
            return true;
        }
        return s.charAt(0)==s.charAt(s.length()-1) && palin(s.substring(s.indexOf(s.charAt(0))+1,s.length()-1));
    }
    public int pow(int a,int n){
        if(n==0){
            return 1;
        }
        return a*pow(a,n-1);
    }
    public int sod(int n){
        if(n<10){
            return n;
        }
        return n%10+sod(n/10);
    }
    public int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
