2) Print numbers from 1 to N

Code:

class Main{
    public void printNumber(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        printNumber(i+1,n);
        
    }
    public static void main(String[] args){
        Main res = new Main();
        res.printNumber(1,5);
    }
}
