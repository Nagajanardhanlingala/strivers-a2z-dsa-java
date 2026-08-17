class Main{
    public static int lowerBound(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low +(high-low)/2;
            if(arr[mid] >= x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    
    public static int upperBound(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low +(high-low)/2;
            if(arr[mid] > x){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
    
    public static void main(String[] args){
        int[] arr={2,2,3,3,3,3,4};
        int x = 5;
        int count = upperBound(arr,x) - lowerBound(arr,x);
        System.out.print(count);
    }
}

T.C = O(log n)
S.C = O(1)
