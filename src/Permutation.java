import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Permutation {
    public void permutation(int[] arr,int index,List<ArrayList<Integer>> ans){
        if(index==arr.length){
            ArrayList<Integer> t=new ArrayList<>();
            for (int j : arr) {
                t.add(j);
            }
            ans.add(t);
            return;
        }
        for(int i=index; i<arr.length; i++){
            swap(index,i,arr);
            permutation(arr,index+1,ans);
            swap(index,i,arr);
        }

    }

    public void swap(int index,int s,int[] arr){
        int temp=arr[index];
        arr[index]=arr[s];
        arr[s]=temp;
    }
    public ArrayList<ArrayList<Integer>> permutate(int[] arr){
        ArrayList<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>();
        permutation(arr,0,ans);
        return ans;
    }
    public static void main(String[] args) {

        int[] arr=new int[]{3,2,1};
        List<Integer> arrayList2 = new ArrayList<>();
        for (Integer element : arr) {
            arrayList2.add(element);
        }

        Permutation p=new Permutation();
        ArrayList<ArrayList<Integer>> ans=p.permutate(arr);
        Collections.sort(ans, new ArrayListComparator());
        printList(ans);
        if(ans.get(0).equals(arrayList2)){
            System.out.println("answer :"+ans.get(0));
            return;
        }
        for(int i=0; i<ans.size(); i++){
            if(ans.get(i).equals(arrayList2)){
                System.out.println("answer :"+ans.get(0));
            }
        }



    }
    static class ArrayListComparator implements Comparator<ArrayList<Integer>> {
        @Override
        public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {

            int size=Math.min(list1.size(),list2.size());
            for(int i=0; i<size; i++){
                int compRes= list1.get(i).compareTo(list2.get(i));
                if(compRes!=0){
                    return compRes;
                }
            }

            return Integer.compare(list1.size(),list2.size());

        }
    }
    static void printList(ArrayList<ArrayList<Integer>> listOfLists) {
        for (ArrayList<Integer> list : listOfLists) {
            System.out.println(list);
        }
    }
}
