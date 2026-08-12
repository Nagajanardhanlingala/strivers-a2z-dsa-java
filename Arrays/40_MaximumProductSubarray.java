class Main{
    public int maxProduct(int[] nums){
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
            
        for(int i = 1;i<nums.length;i++){
            int num = nums[i];
            int prevMax = max;
            int prevMin = min;
            
            max = Math.max(num, Math.max(prevMax * num, prevMin * num));
            min = Math.min(num, Math.min(prevMax * num, prevMin * num));
            ans = Math.max(ans,max);
        }
        return ans;
    }
}

T.C = O(n)
S.C = O(1)