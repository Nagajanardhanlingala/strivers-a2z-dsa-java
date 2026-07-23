Approach - 1

class Main{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int d = 3;
        int n = arr.length;
        int [] temp = new int[d];
        
        d = d%n;
        if(d == 0){
            return;
        }
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        
        for(int i = 0; i < n - d; i++){
           arr[i] = arr[i + d];
        }
        
        for(int i = 0; i < d; i++){
            arr[n - d + i] = temp[i];
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
    }
} 

Approach - 2 (Optimal)

class Main{
    public static void reverse(int[] arr, int start, int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    
    
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int d = 2;
        
        int n = arr.length;
        d = d % n;
        if(d == 0 || n == 1)
          return;
          
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
