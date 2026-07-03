pattern21: Hollow Rectangle Pattern

****
*  *
*  *
****

Code:
class Main{
    public static void pattern21(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args){
        int n = 5;
        pattern21(n);
    }
}