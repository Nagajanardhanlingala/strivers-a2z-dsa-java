class Solution {
    static final long MOD = 1_000_000_007L;

    public int countGoodNumbers(long n) {
        long even = fastPower(5,(n+1)/2);
        long odd = fastPower(4,n/2);

        return (int) ((even * odd) % MOD);    
    }

    private long fastPower(long a, long b){
        long result = 1;
        while(b > 0){
            if(b % 2 == 1){
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }
        return result;
    }
}


Time : O(log n)
Space : O(1)