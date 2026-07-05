3) Print Numbers from N to 1

Code:

class Main{
    public void printNumber(int i, int n){
        if(i < 1){
            return;
        }
        System.out.println(i);
        printNumber(i-1,n);
        
    }
    public static void main(String[] args){
        Main res = new Main();
        res.printNumber(5,5);
    }
}
