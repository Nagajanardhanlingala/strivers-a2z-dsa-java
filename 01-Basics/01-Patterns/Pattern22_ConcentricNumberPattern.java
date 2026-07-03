pattern22: The Number Pattern

5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5

Code:
class Main{
    public static void pattern22(int n){
        int size = 2*n-1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int top = i;
                int left=j;
                int bottom=size-1-i;
                int right=size-1-j;
                
                int layer = Math.min(Math.min(top,bottom),Math.min(left,right));
                int value=n-layer;
                System.out.print(value+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args){
        int n = 5;
        pattern22(n);
    }
}