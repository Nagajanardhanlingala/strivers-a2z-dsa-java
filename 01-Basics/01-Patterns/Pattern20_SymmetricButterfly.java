pattern20: (Symmetric-Butterfly pattern)

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
Code:
class Main{
    public static void pattern20(int n){   // upper half begins
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){             // lower half begins
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i*2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args){
        int n = 5;
        pattern20(n);
    }
}