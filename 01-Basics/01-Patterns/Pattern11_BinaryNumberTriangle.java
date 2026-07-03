pattern11

1
01
101
0101
10101

code:

class Main{
    public static void pattern11(int n){
        for(int i=0;i<n;i++){
            int current;
            if(i%2==0){
                current = 1;
            }else{
                current = 0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(current);
                current = 1-current;
        }
        System.out.println();
    }
}

  public static void main(String[] args){
      int n = 5;
      pattern11(n);
  }
}

T.C: O(n^2)
S.C: O(1)
