package SlidingWindow;

import java.util.HashMap;

public class FruitBasket {

    public void find(int[] arr){

        int k=2;
        int left=0;
        int right=0;
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        int maxFruit=0;
        while(right<n){

          map.put(arr[right],map.getOrDefault(arr[right],0)+1);

          if(map.size()>k){
              map.put(arr[left],map.get(arr[left])-1);
              if(map.get(arr[left])==0){
                  map.remove(arr[left]);
              }
              left++;
          }
          if(map.size()<=k){
                  maxFruit=Math.max(maxFruit,right-left+1);
              }

             right++;
        }
        System.out.println(maxFruit);
    }
    public static void main(String[] args) {
        FruitBasket f=new FruitBasket();
        f.find(new int[]{1 ,2 ,3 ,4});
    }
}
