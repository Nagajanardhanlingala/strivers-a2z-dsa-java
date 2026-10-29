class Solution {
    public boolean checkSubsequenceSum(int[] nums, int k) {
         return solve(0,0,false,nums,k);
    }

    private boolean solve(int index, int sum, boolean picked, int[] nums,int k){
        if(sum == k && picked){
            return true;
        }
        if(index == nums.length){
            return false;
        }
        if(sum > k){
            return false;
        }
        if(solve(index+1,sum+nums[index],true,nums,k)){
            return true;
        }
        if(solve(index+1,sum,picked,nums,k)){
            return true;
        }
        return false;
    }
}