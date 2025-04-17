package Heap;

import java.util.ArrayList;

;

public class MinHeap<T extends Comparable<T>> {

    ArrayList<T> list;

    public MinHeap(){
        list=new ArrayList<>();
    }

    public int parent(int index){
        return (index-1)/2;
    }

    public int left(int index){
        return (2*index)+1;
    }

    public int right(int index){
        return (2*index)+2;
    }

    public void insert(T element){
        list.add(element);
        upHeap(list.size()-1);
    }

    public void upHeap(int index){
        if(index==0){
            return;
        }
        if(list.get(index).compareTo(list.get(parent(index)))<0){
            swap(index,parent(index));
            upHeap(parent(index));
        }
    }

    public void swap(int first,int second){
        T temp=list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    public T remove () throws Exception {
        if(list.isEmpty()){
            throw new Exception("removing from empty heap");
        }
        T value=list.get(0);

        list.set(0,list.get(list.size()-1));
        list.remove(list.size()-1);

        if(!list.isEmpty()){
            downHeap(0);
        }
       return value;
    }

    public void downHeap(int index){
        if(left(index)>list.size()&& right(index)>list.size()){
            return;
        }
        int min=index;
        if( left(index)<list.size()&& list.get(index).compareTo(list.get(left(index)))>0){
            min=left(index);
        }
        if(right(min)<list.size() && list.get(min).compareTo(list.get(right(min)))>0){
            min=right(min);
        }

        if(min!=index){
            swap(index,min);
        }


    }


    public static void main(String[] args){
        MinHeap<Integer> h=new MinHeap<Integer>();
        h.insert(3);
        h.insert(1);
        h.insert(0);
        h.insert(-1);
        try{
            System.out.println(h.remove());
            System.out.println(h.remove());
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }

    }
}
