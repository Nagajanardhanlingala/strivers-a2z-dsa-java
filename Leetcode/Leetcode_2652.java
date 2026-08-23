class Solution {
    public int sumOfMultiples(int n) {
        return sumDivisibleBy(n, 3) 
             + sumDivisibleBy(n, 5) 
             + sumDivisibleBy(n, 7) 
             - sumDivisibleBy(n, 3 * 5) 
             - sumDivisibleBy(n, 3 * 7) 
             - sumDivisibleBy(n, 5 * 7) 
             + sumDivisibleBy(n, 3 * 5 * 7);
    }

    // Helper method to find the sum of multiples of 'k' up to 'n'
    private int sumDivisibleBy(int n, int k) {
        int m = n / k; // Total count of multiples
        return k * (m * (m + 1)) / 2; // Arithmetic progression sum formula
    }
}
