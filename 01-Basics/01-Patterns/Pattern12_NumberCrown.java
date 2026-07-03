pattern12: (Number crown pattern)

1      1
12    21
123  321
12344321

Code:
class Main{
    public static void pattern12(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print(" ");
            }
            for(int j=i+1;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 4;
        pattern12(n);
    }
}

T.c: O(n^2)
S.C: O(1)
