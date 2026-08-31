class Main{
    public static int findPages(int[] arr,int m){
        if(m > arr.length){
            return -1;
        }
        int sum = 0;
        int large = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > large){
                large = arr[i];
            }
            sum += arr[i];
        }
        int low = large;
        int high = sum;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(canAllocate(arr,m,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static boolean canAllocate(int[] arr,int m,int mid){
        int currentPages = 0;
        int students = 1;
        
        for(int i=0;i<arr.length;i++){
            int pages = arr[i];
            if(pages > mid){
            return false;
        }
            if(currentPages + pages <= mid){
                currentPages += pages;
            }else{
                students++;
                currentPages = pages;
                if(students > m){
                  return false;
                }
            }
        }
        return true;
    }
}

T.C = O(n log (sum(arr)))
S.C = O(1)