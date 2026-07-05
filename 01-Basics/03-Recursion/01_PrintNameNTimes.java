1)Print Name 'n' times

Code:

class Main{
    public void printNumber(int i, int n){
        if(i > n){
            return;
        }
        System.out.println("Nani");
        printNumber(i+1,n);
        
    }
    public static void main(String[] args){
        Main res = new Main();
        res.printNumber(1,5);
    }
}
