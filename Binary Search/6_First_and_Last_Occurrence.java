import java.util.*;
class Main{
    public static int[] firstAndLastOccurence(int[] arr,int target){
        int first = lowerBound(arr,target);
        if(first == arr.length || arr[first] != target){
            return new int[]{-1,-1};
        }
        int last = upperBound(arr,target)-1;
        
        return new int[]{first,last};
    }
    public static int lowerBound(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        
        while(low <= high){
            int mid = low +(high-low)/2;
            if(arr[mid] >= target){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
    public static int upperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        
        while(low <= high){
            int mid = low +(high-low)/2;
            if(arr[mid] > target){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] arr={3,4,13,13,13,20,40};
        int target = 13;
        System.out.print(Arrays.toString(firstAndLastOccurence(arr,target)));
    }
}