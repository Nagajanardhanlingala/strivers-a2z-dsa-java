pattern15:(Reverse letter Triangle)

ABCDE
ABCD
ABC
AB
A

Code:
class Main{
    public static void pattern15(int n){
        for(int i=0;i<n;i++){
            char letter = 'A';
            for(int j=i;j<n;j++){
                System.out.print(letter);
                letter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 5;
        pattern15(n);
    }
}
T.C: O(n^2)
S.C: O(1)