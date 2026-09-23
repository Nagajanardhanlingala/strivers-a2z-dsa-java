class Solution {
    public int primeUptoN(int n) {
        int count=0;
        for(int num = 2;num<=n;num++){
            boolean isPrime = true;
            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        return count;
    }
}