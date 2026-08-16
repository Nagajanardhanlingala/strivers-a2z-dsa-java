class Main{
    public static void floorAndCeil(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] <= x){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        int floor =(high >= 0) ? arr[high] : -1;
        int ceil = (low <arr.length) ? arr[low] : -1;
        System.out.print(floor+","+ceil);
    }
    public static void main(String[] args){
        int[] arr={1,2,4,6,8,10};
        int x = 5;
        floorAndCeil(arr,x);
    }
}
