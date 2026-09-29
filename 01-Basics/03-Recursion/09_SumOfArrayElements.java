import java.util.*;
class Solution {
    public int arraySum(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        return nums[0]+arraySum(Arrays.copyOfRange(nums,1,nums.length));
    }
}