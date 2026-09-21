class Solution {
    public long[] resultArray(int[] nums, int k) {
        int n = nums.length;
        long[] result = new long[k];
        long[] count = new long[k];
        for(int i=0;i<n;i++){
            long[] newCount = new long[k];
            
            for (int r = 0; r < k; r++) {
                int newRemainder = (int)((long) r * nums[i] % k);
                newCount[newRemainder] += count[r];
            }
            newCount[nums[i] % k]++;
            for(int r=0;r<k;r++){
                result[r] += newCount[r];
            }
            count = newCount;
        }
        return result;
    }
}