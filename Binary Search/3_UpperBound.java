class Main{
    public static int upperBound(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        
        while(low <= high){
            int mid = low +(high-low)/2;
            if(arr[mid] > x){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] arr={1,2,4,4,6,5};
        int x = 4;
        System.out.print(upperBound(arr,x));
    }
}