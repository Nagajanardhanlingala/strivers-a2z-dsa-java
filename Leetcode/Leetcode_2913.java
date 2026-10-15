class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int answer = 0;

        for(int i=0;i<n;i++){
            Set<Integer> unique = new HashSet<>();
            for(int j=i;j<n;j++){
                unique.add(nums.get(j));
                int k = unique.size();
                answer += k*k;
            }
        }
        return answer;
    }
}