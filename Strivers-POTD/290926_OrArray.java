class Solution {
    public List<Integer> orArray(List<Integer> A) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<A.size()-1;i++){
            int value = A.get(i) | A.get(i+1);
            result.add(value);
        }
        return result;
    }
}