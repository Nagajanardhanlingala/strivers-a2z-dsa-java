class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates,0,new ArrayList<>(),result,target);
        return result;
    }
    private void backtrack(int[] candidates,int index, List<Integer> current, List<List<Integer>> result, int target){
        if(target == 0){
            result.add(new ArrayList<>(current));  // base case 1
            return;
        }
        if(index == candidates.length || target < 0){    // base case 2
            return;
        }
        current.add(candidates[index]);
        backtrack(candidates,index,current,result,target-candidates[index]);   // include once and multiple
        
        current.remove(current.size()-1);  // backtrack
        backtrack(candidates,index+1,current,result,target);   //exclude
    }
}