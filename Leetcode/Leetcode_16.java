class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = 0;
        int closestDifference = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                int difference = Math.abs(target-sum);
                if(difference < closestDifference){
                    closestDifference = difference;
                    closestSum = sum;
                }
                if(sum == target){
                    return sum;
                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closestSum;
    }
}