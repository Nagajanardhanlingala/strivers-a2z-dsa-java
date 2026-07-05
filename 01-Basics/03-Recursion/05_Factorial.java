5)Factorial of a Number

Code:

class Main{
    public int Fact(int n){
        
        if(n == 1){
            return 1;
        }
        
        return n * Fact(n-1);
    }
    public static void main(String[] args){
        Main res = new Main();
        System.out.println(res.Fact(5));
    }
}
