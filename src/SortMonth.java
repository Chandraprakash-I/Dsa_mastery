import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortMonth {
    public static void main(String[] args) {
        String[] arr={"January","Febraury","March","April","May","June","July","August", "September", "October",
                "November","December"};

        List<String> list=new ArrayList<>(Arrays.asList(arr)) ;
        //the above list is for reference.
        String[] randomArray={"March","April","October","December","November","September","January","May","July",
                "June","Febraury","August"};
        Arrays.sort(randomArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(list.indexOf(o1),list.indexOf(o2));
            }
        });
        System.out.println(Arrays.toString(randomArray));
    }
}
