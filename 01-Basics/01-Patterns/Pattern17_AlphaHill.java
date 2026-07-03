pattern17:

   A
  ABA                        
 ABCBA
ABCDCBA

Code:
class Main{
    public static void pattern17(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+j));
            }
            for(int j=i-1;j>=0;j--){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 4;
        pattern17(n);
    }
}

T.C: O(n^2)
S.C: O(1)
