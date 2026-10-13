class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int minus = n/2;
        int plus = n-(n/2);
        
        int[] squares=new int [n];
        for(int i=0;i<n;i++){
            squares[i] = nums[i]*nums[i];
        }
        
        Arrays.sort(squares);
        long minusScore = 0;
        long plusScore = 0;
        for(int i=0;i<minus;i++){
            minusScore += (long) squares[i];
        }
        for(int i=minus;i<n;i++){
            plusScore += (long) squares[i];
        }
        
        return plusScore - minusScore;
    }
}