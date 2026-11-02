class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        getPerms(0,nums,result);
        return result;
    }
    
    private void getPerms(int index, int[] nums, List<List<Integer>> result){
        // base case
        if(index == nums.length){
            List<Integer> current = new ArrayList<>();
            for(int num : nums){
                current.add(num);
            }
            result.add(current);
            return;
        }
        
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            getPerms(index+1,nums,result);
            swap(nums,index,i);
        }
    }
    
    private void swap(int[] nums, int a , int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}