
class Solution {
    public double myPow(double x, int n) {
        long exponent = n;

        if (exponent < 0) {
            x = 1.0 / x;
            exponent = -exponent;
        }

        return power(x, exponent);
    }

    private double power(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }
}
