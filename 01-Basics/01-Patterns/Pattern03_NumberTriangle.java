Pattern3:

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

Code:
class Main{
    public static void pattern3(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Main result = new Main();
        int n = 5;
        result.pattern3(n);
    }
}
