Pattern4:

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

Code:
class Main{
    public static void pattern4(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Main result = new Main();
        int n = 5;
        result.pattern4(n);
    }
}
