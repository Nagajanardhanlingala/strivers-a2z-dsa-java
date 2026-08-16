class Main{
    public static int lowerBound(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        
        while(low <= high){
            int mid = low +(high-low)/2;
            if(arr[mid] >= x){
                high = mid - 1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,4,7};
        int x = 2;
        System.out.print(lowerBound(arr,x));
    }
}
