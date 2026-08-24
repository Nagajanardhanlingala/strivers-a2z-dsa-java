class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxValue = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] > maxValue){
                maxValue = nums[i];
            }
        }
        int low = 1;
        int high = maxValue;
        while(low <= high){
            int mid = low+(high-low)/2;
            long sum = sumOfDivisors(nums,mid);
            if(sum > threshold){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    public static long sumOfDivisors(int[] nums,int mid){
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += (nums[i]+(mid-1))/mid;
        }
        return sum;
    }
}