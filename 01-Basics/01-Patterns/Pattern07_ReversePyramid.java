Pattern7:

    *
   ***
  *****
 *******
*********

Code:

class Main{
    public static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Main result = new Main();
        int n = 5;
        result.pattern7(n);
    }
}
