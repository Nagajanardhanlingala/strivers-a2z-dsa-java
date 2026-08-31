class Solution {
    public int splitArray(int[] nums, int k) {
        int large = nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > large){
                large = nums[i];
            }
            sum += nums[i];
        }
        int low = large;
        int high = sum;
        while(low <= high){
            int mid = low +(high-low)/2;
            if(canSplit(nums,k,mid)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static boolean canSplit(int[] nums,int k,int mid){
        int currentSum = 0;
        int subArrays = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > mid){
                return false;
            }
            if(currentSum + nums[i] <= mid){
                currentSum += nums[i];
            }else{
                subArrays++;
                currentSum = nums[i];
                if(subArrays > k){
                    return false;
                }
            }
        }
        return true;
    }
}

T.C = O(n log(sum(nums)))
S.C = O(1)