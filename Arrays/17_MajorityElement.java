Brute-force

import java.util.*;
class Main{
    public static int majorityElement(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        
        return nums[n/2];
    }
}
T.C = O(n log n)
S.C = O(1)
---------------------------------------------------------------
Better approach:(Using HashMap)

import java.util.*;
class Main{
    public static int majorityElement(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int target = nums.length / 2;
        
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            
            if(map.get(num) > target){
                return num;
            }
        }
        return -1;
    }
}

T.C = O(n)
S.C = O(n)
--------------------------------------------------------------------
Optimal Approach: Moore's Voting algorithm

import java.util.*;
class Solution{
    public static int majorityElement(int[] nums){
        int candidate = 0;
        int count = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            
            if(candidate == num){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}

T.C = O(n)
S.C = O(1)
