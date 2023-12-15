import java.util.Arrays;
import java.util.Comparator;
class Item{
    int value;
    int weight;
    Item(int value,int weight){
        this.value=value;
        this.weight=weight;
    }
}
public class FractionalKnackSnap {

    public void maxValue(int[] values,int[] weight,int w){
        Item[] arr=new Item[values.length];
        for(int i=0; i<arr.length; i++){
            arr[i]=new Item(values[i],weight[i]);
        }
        Arrays.sort(arr,new Com());
        for(Item i: arr){
            System.out.print(i.value);
        }
        System.out.println();
        int currBagWeight=0;
        double val=0;
        for(int i=0; i<values.length; i++){
            if(currBagWeight+arr[i].weight<=w){
                currBagWeight+=arr[i].weight;
                val+=arr[i].value;
            }else{
                int remWeight=w-currBagWeight;
                val+=(double)arr[i].value/arr[i].weight*remWeight;
                break;
            }
        }
        System.out.println(val);
    }
    public static void main(String[] args) {
        FractionalKnackSnap f=new FractionalKnackSnap();

        int N = 3;
        int W = 50;
        int[] values = {100,60,120};
        int[] weight = {20,10,30};

        f.maxValue(values,weight,W);
    }
}
class Com implements Comparator<Item>{

    @Override
    public int compare(Item o1, Item o2) {
        double val1= (double) o1.value/o1.weight;
        double val2= (double) o2.value/o2.weight;
        if(val1<val2){
            return 1;
        }else if(val1>val2){
            return -1;
        }
        return 0;
    }
}