Pattern10:
*
**
***
****
*****
****
***
**
*

Code:

class Main{
    public static void pattern10(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(); //upper part
        }
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println(); //lower part
        }
    }
    public static void main(String[]args){
        Main result = new Main();
        int n =5;
        result.pattern10(n);
    }
}
