Pattern13: (Increasing number triangle)/(Continuous counter problem)
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

Code:
class Main{
    public static void pattern13(int n){
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 5;
        pattern13(n);
    }
}
