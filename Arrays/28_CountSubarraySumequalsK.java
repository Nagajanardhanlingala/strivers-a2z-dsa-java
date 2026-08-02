class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;
        int prefixSum = 0;
         

        map.put(0,1);

        for(int i=0;i<n;i++){
            prefixSum += nums[i];

            int requiredPrefix = prefixSum - k;
            if(map.containsKey(requiredPrefix)){
                count += map.get(requiredPrefix);
            }

            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}