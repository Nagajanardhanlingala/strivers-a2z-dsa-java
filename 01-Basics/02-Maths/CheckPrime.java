7) Check Prime Number

Code:
class Main{
    public static boolean isPrimeNumber(int n){
        
        if(n<=1){
            return false;
        }
        for(int i=2;i*i <= n;i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args){
        int n = 4;
        System.out.print(isPrimeNumber(n));
    }
}
