Pattern 1:

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

Code: 
class Main{
    public static void pattern1(int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Main result = new Main();
        int N = 5;
        result.pattern1(N);
    }
}
