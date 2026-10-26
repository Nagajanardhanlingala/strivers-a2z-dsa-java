class Solution {
    public int maximumWealth(int[][] accounts) {
        int answer = 0;
        for(var e : accounts){
            int sum = 0;
            for(int v : e){
                sum += v;
            }
            answer = Math.max(sum,answer);
        }
        return answer;
    }
}