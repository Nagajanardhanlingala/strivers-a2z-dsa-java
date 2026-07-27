class Solution {
    public int maxProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }else if(nums[i] > secondLargest){
                secondLargest = nums[i];
            }
        }
        
        return (largest -1)*(secondLargest-1);
    }
    
    public static void main(String[] args){
        int [] nums = {3,4,5,2};
        Solution result = new Solution();
        System.out.print(result.maxProduct(nums));
    }
}