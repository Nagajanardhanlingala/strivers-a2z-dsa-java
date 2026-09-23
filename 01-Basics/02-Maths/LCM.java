class Solution {
    public int LCM(int n1, int n2) {
        if(n1 == 0 || n2 == 0){
            return 0;
        }
        return (Math.abs(n1*n2)/gcd(n1,n2));
    }
    public static int gcd(int n1,int n2){
        while(n2 != 0){
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        return n1;
    }
}