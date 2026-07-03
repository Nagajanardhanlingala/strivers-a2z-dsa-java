pattern19: symmetric-void pattern

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

Code:
class Main{
    public static void pattern19(int n){            // upper half begins
        for(int i=0;i<n;i++){        // for rows
            for(int j=0;j<n-i;j++){  // for left stars
                System.out.print("*");
            }
            for(int j=0;j<i*2;j++){  // for spaces
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){  // for right stars
                System.out.print("*");
            }
            System.out.println();  // for nextline
        }                                            // lower half begins
        for(int i=0;i<n;i++){     // for rows
            for(int j=0;j<=i;j++){
                System.out.print("*");// for left stars
            }
            for(int j=0;j<2*(n-i-1);j++){  // for spaces
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){        // for right stars
                System.out.print("*");
            }
            System.out.println();   // for next line
        }
        
    }
    public static void main(String[] args){
        int n = 5;
        pattern19(n);
    }
}