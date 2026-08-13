class Main{
    public static void bubbleSort(int[] arr, int n){
        if(n == 1){
            return;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                swap(arr,i,i+1);
            }
        }
        bubbleSort(arr,n-1);
    }
    
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args){
        int[] arr = {4,2,7,3,1,6,5};
        int n = arr.length;
        bubbleSort(arr,n);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}

T.C = O(n^2)
S.C = O(n)