class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1,n,k,new ArrayList<>(),result);
        return result;
    }
    private void backtrack(int index, int n, int k, List<Integer> current, List<List<Integer>> result){
        if(current.size() == k){
            if(n == 0){
                result.add(new ArrayList<>(current));
            }
            return;
        }
        if(n < 0){
            return;
        }
        for(int i=index;i<=9;i++){
            if(i > n){
                break;
            }
            current.add(i);
            backtrack(i+1,n-i,k,current,result);
            current.remove(current.size()-1);
        }
    }
}