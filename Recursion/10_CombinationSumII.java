class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates,0,new ArrayList<>(),result,target);
        return result;
    }
    private void backtrack(int[] candidates, int index, List<Integer> current, List<List<Integer>> result, int target){
        if(target == 0){                              // base case 1
            result.add(new ArrayList<>(current));     
            return;
        }
        if(index == candidates.length || target < 0){  // base case 2
            return;
        }
        current.add(candidates[index]);
        backtrack(candidates,index + 1, current, result, target-candidates[index]);    //include

        current.remove(current.size()-1);               // backtrack
        int next = index + 1;
        while(next < candidates.length && candidates[next] == candidates[index]){
            next++;
        }
        backtrack(candidates,next,current,result,target);     //exclude
    }
}