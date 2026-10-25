class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Step 1: Sort the array to bring duplicates together
        Arrays.sort(nums);
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Every state we reach is a valid subset, so add it to the result
        result.add(new ArrayList<>(current));
        
        for (int i = start; i < nums.length; i++) {
            // Step 2: Skip duplicates at the same recursion level
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Include nums[i]
            current.add(nums[i]);
            // Recurse with the next index
            backtrack(i + 1, nums, current, result);
            // Backtrack: remove the element to try the next choice
            current.remove(current.size() - 1);
        }
    }
}
