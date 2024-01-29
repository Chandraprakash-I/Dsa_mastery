package BinarySearch.OneDArray;

public class SearchInSortedRotatedArray {

    public void  searchWithDuplicates(int[] arr,int target){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==arr[low] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }else if(arr[mid]>arr[low]){
                //left is in sorted order
                if(target>=arr[low] && target<=arr[mid-1]){
                    //and target within the sorted left part
                    high=mid-1;
                }else{
                    //not within the sorted left part
                    low=mid+1;
                }
            }else if(arr[mid]<arr[high]){
                //right is in sorted order
                if(target>=arr[mid] && target<=arr[high]){
                    //in range
                    low=mid+1;
                }else{
                    //not in range
                    high=mid-1;
                }
            }
        }
    }

    public void search(int[] arr,int target){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }else if(arr[mid]>arr[low]){
                //left is in sorted order
                if(target>=arr[low] && target<=arr[mid-1]){
                    //and target within the sorted left part
                    high=mid-1;
                }else{
                    //not within the sorted left part
                    low=mid+1;
                }
            }else if(arr[mid]<arr[high]){
                //right is in sorted order
                if(target>=arr[mid+1] && target<=arr[high]){
                    //in range
                    low=mid+1;
                }else{
                    //not in range
                    high=mid-1;
                }
            }
        }
    }
    public static void main(String[] args) {
        SearchInSortedRotatedArray s=new SearchInSortedRotatedArray();
        s.searchWithDuplicates(new int[]{7, 8, 1, 2, 3, 3, 3, 4, 5, 6},3);
    }
}
