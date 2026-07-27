Better approach: Sorting and Two-Pointers

import java.util.*;
class Main{
public static String twoSum(int n, int[] arr, int target){
    Arrays.sort(arr);
    int left = 0;
    int right = n-1;
    
    while(left < right){
        if(arr[left] + arr[right] < target){
            left++;
        }else if(arr[left] + arr[right] > target){
            right--;
        }else if(arr[left] + arr[right] == target){
            return "YES";
        }
    }
    return "NO";
}
public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 10};
        int target = 12;

        System.out.println(twoSum(arr.length, arr, target));

    }

}
-----------------------------------------------------------------------
Optimal Approach: Using HashMap

import java.util.*;
class Main{
    public static String twoSum(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int value = target - arr[i];
            if(set.contains(value)){
                return "YES";
            }
            set.add(arr[i]);
        }
        return "NO";
    }
    public static void main(String[] args){
        int [] arr = {1,3,5,7,10};
        int target = 12;
        System.out.print(twoSum(arr,target));
    }
}
