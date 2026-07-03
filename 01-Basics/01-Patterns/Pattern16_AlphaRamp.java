pattern16: (Alpha-Ramp pattern)
A
BB
CCC
DDDD
EEEEE

Code:
class Main{
    public static void pattern16(int n){
        
        for(int i=0;i<n;i++){
            char letter = (char)('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(letter);
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 5;
        pattern16(n);
    }
}
T.C: O(n^2)
S.C:O(1)