Selection sort

Code:
class Main{
    public static void selectionSort(int[] arr, int n){
        for(int i=0;i<n;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    
    public static void main(String[] args){
        int n = 6;
        int[] arr= {13,46,24,52,20,9};
        selectionSort(arr,n);
    }
}
