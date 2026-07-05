4) Print sum of N numbers

Code:

Approach - 1:(Parameterized recursion)

class Main{
    public void printSum(int i, int sum,int n){
        
        if(i > n){
            System.out.println(sum);
            return;
        }
        
        printSum(i+1,sum+i,n);
    }
    public static void main(String[] args){
        Main res = new Main();
        res.printSum(1,0,5);
    }
}


Approach-2:(Functional rescursion)
class Main{
    public int printSum(int n){
        
        if(n == 1){
            return 1;
        }
        
        return n + printSum(n-1);
    }
    public static void main(String[] args){
        Main res = new Main();
        System.out.println(res.printSum(5));
    }
}