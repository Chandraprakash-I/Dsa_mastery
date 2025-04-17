package Heap;

import java.util.ArrayList;

public class MaxHeap <T extends Comparable<T>>{

    ArrayList<T> list;

    public MaxHeap(){
        list=new ArrayList<>();
    }

    public int left(int index){
        return (2*index)+1;
    }

    public int right(int index){
        return (2*index)+2;
    }

    public int head(int index){
        return (index-1)/2;
    }

    public void insert(T element){
        list.add(element);
        upHeap(list.size()-1);
    }

    public void upHeap(int index){
        if(index==0){
            return;
        }
        if(list.get(index).compareTo(list.get(head(index)))>0){
            swap(head(index),index);
            upHeap(head(index));
        }
    }

    public void swap(int first,int second){
        T temp=list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    public T remove()  throws  Exception{
        if(list.isEmpty()){
            throw new Exception("empty heap");
        }
        T value=list.get(0);
        list.set(0,list.get(list.size()-1));
        list.remove(list.size()-1);
        if(list.size()>1){
            downHeap(0);
        }
        return value;
    }

    public void downHeap(int index){
        if(left(index)>list.size()-1 && right(index)> list.size()-1){
            return;
        }

        int max = index;
        if(left(index) < list.size() && list.get(left(index)).compareTo(list.get(index)) > 0){
            max = left(index);
        }

        if(right(index) < list.size() && list.get(right(index)).compareTo(list.get(max)) > 0){ // FIXED HERE
            max = right(index);
        }
        if(max!=index){
            swap(max,index);
            downHeap(max);
        }

    }
    public static void main(String[] args) throws Exception{
        MaxHeap<Integer> m=new MaxHeap<>();
        m.insert(5);
        m.insert(3);
        m.insert(2);
        m.insert(4);
        m.insert(1);
        m.insert(6);
        System.out.println(m.remove());
        System.out.println(m.remove());
        System.out.println(m.remove());
        System.out.println(m.remove());
    }
}
