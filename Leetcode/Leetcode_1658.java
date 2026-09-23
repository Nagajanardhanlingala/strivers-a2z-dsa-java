class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }
        if(x > totalSum){
            return -1;
        }
        int target = totalSum - x;
        int left = 0;
        int right = 0;
        int sum = 0;
        int longest = 0;

        for(right=0;right<nums.length;right++){
            sum += nums[right];

            while(sum > target){
                sum -= nums[left];
                left++;
            }
            if(sum == target){
                int length = right-left+1;
                longest=Math.max(longest,length);
            }
        }
        if(longest == 0 && target > 0){
            return -1;
        }
        return nums.length - longest;
    }
}