package Recursion.patterns;

public class SubArrayWIthKsum {

    public boolean find(int[] arr, int sum, int currentSum, int index){

        if(sum==currentSum){
            return true;
        }
    if(index==arr.length){

        return false;
    }
    if(currentSum>sum){
        return false;
    }


        boolean left=find(arr,sum,currentSum+arr[index],index+1);
        if(left){
            return left;
        }

        boolean right=find(arr,sum,currentSum,index+1);
        if(right){
            return right;
        }
    return false;
    }
    public static void main(String[] args) {
        SubArrayWIthKsum s=new SubArrayWIthKsum();
       boolean ans=s.find(new int[]{1,2,3,1,1,1},11,0,0);

            System.out.println(ans);

    }
}
