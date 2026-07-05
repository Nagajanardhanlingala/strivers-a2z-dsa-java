8)Fibonacci Series

Code:

class Main {
    public int fib(int n){

        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        return fib(n-1) + fib(n-2);

    }

    public static void main(String[] args){
        Main res = new Main();
        int n = 5;
        System.out.print(res.fib(n));
    }
}