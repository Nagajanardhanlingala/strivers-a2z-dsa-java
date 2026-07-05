6)Reverse an array

Code:

class Main{
    public void reverse(int arr[],int left,int right){
        
        if(left >= right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
        reverse(arr,left+1,right-1);
        
    }
    public static void main(String[] args){
        Main res = new Main();
        int [] arr ={1,2,3,4,5};
        int n = arr.length;
        int left = 0;
        int right = n-1;
        res.reverse(arr,left,right);
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
        }
    }
}