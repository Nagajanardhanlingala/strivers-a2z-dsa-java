class Solution {
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        return solve(0,0,false,nums,k);
    }

    private int solve(int index, int sum, boolean picked, int[] nums,int k){
        
        if(index == nums.length){
            return(sum == k && picked) ? 1 : 0;
        }
        if(sum > k){
            return 0;
        }
        int include = solve(index+1,sum+nums[index],true,nums,k);

        int exclude = solve(index+1,sum,picked,nums,k);

        return include + exclude;
    }
}