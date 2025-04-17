package Heap;

import java.util.*;
import java.util.PriorityQueue;

public class HandOfStraights {

    public boolean attempt3(int[] hand,int groupSize){

        if(!(hand.length%groupSize==0)){
            return false;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> queue=new PriorityQueue<>();

        for(int i=0; i<hand.length; i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
            if(map.get(hand[i])==1){
                queue.add(hand[i]);
            }

        }

        while (!queue.isEmpty()){
            int minElement=queue.peek();
            for(int i=minElement; i<=minElement+groupSize-1; i++ ){
                if(map.containsKey(i)&& map.get(i)>0){
                    map.put(i,map.get(i)-1);
                    if(map.get(i)==0){
                        int element=queue.remove();
                        if(element!=i){
                            return false;
                        }
                    }
                }else {
                    return false;
                }

            }
        }
        return true;
    }

    public boolean againMySolution(int[] hand,int groupSize){
        if(!(hand.length%groupSize==0)){
            return false;
        }

        Arrays.sort(hand);
        int j=0;
        for(int i=0;i<(hand.length/groupSize); i++){
            while (j<groupSize){
                if(hand[j]==hand[j+1]){
                    j=j+1;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    public boolean mySolutionDidNotWorkSo(int[] hand,int groupSize){

        if(hand.length%groupSize==0){
            PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->a-b);
            HashMap<Integer,Integer> occurance=new HashMap<>();

            for(int i=0; i<hand.length; i++){

                occurance.put(hand[i],occurance.getOrDefault(hand[i],0)+1);
                if(occurance.get(hand[i])==1){
                    queue.add(hand[i]);
                }
            }

            while(!queue.isEmpty()){
                int minElement=queue.peek();
                if(occurance.containsKey(minElement)&& occurance.get(minElement)>0){
                    occurance.put(minElement,occurance.get(minElement)-1);
                }


                if (occurance.get(minElement)==0){
                    int element=queue.remove();
                    if(element!=minElement){
                        return false;
                    }
                }

                for(int i=1;i<=groupSize-1; i++){
                    if(occurance.containsKey(minElement+i) && occurance.get(minElement+i)>0){
                        occurance.put(minElement+i,occurance.get(minElement+i)-1);
                        if (occurance.get(minElement+i)==0){
                            int element=queue.remove();
                            if(element!=minElement){
                                return false;
                            }

                        }
                    }else{
                        return false;
                    }
                }
            }
            return true;
        }
            return false;



    }
//    public boolean mySolution(int[] hand,int groupSize){
//       for(int i=0;i<hand.length; i++){
//           int element=hand[i];
//           int j=1;
//
//           while(j<=groupSize){
//               boolean flag=false;
//               for(int k=0; k<hand.length; k++){
//                   if(hand[k]==hand[k]+j){
//                       flag=true;
//                       break;
//                   }
//               }
//
//           }
//       }
//    }

    public static void main(String[] args){
        int[] hand={1,2,3,6,2,3,4,7,8};
        HandOfStraights h=new HandOfStraights();
        System.out.println(h.againMySolution(hand,3));
    }
}
