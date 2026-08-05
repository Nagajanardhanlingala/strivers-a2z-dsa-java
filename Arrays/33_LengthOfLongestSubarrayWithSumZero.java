class Main{
    public static int longestSubarray(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int n = nums.length;
        int sum = 0;
        int maxLen = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            
            if(sum == 0){
                maxLen = i+1;
            }else if(map.containsKey(sum)){
                maxLen = Math.max(maxLen,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}

T.C = O(n)
S.C = O(1)