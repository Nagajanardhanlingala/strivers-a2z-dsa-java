pattern18:(Alpha-Triangle Pattern)
E
DE
CDE
BCDE
ABCDE

Code:
class Main{
    public static void pattern18(int n){
        for(int i=0;i<n;i++){
            char letter = (char)('A'+(n-i-1));
            for(int j=0;j<=i;j++){
                System.out.print(letter);
                letter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 5;
        pattern18(n);
    }
}
T.C: O(n^2)
S.C: O(1)
