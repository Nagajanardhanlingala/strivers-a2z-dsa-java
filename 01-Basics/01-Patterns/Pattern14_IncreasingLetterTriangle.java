pattern14:(Increasing Letter Triangle)

A
AB
ABC
ABCD
ABCDE

Code:
class Main{
    public static void pattern14(int n){
        for(int i=0;i<n;i++){
            char letter = 'A';
            for(int j=0;j<=i;j++){
                System.out.print(letter);
                letter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 5;
        pattern14(n);
    }
}

T.C: O(n^2)
S.C: O(1)
