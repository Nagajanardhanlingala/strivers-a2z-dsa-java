class Main{
    public static int countInversions(int[] arr){
        return mergeSort(arr,0,arr.length-1);
    }
    
    public static int mergeSort(int[] arr, int low, int high){
        int count = 0;
        if(low >= high){
            return 0;
        }
        int mid = low + (high-low)/2;
        count += mergeSort(arr,low,mid);
        count += mergeSort(arr,mid+1,high);
        count += merge(arr,low,mid,high);
        
        return count;
    }
    
    public static int merge(int[] arr,int low, int mid, int high){
        
        ArrayList<Integer> temp = new ArrayList<>();
        
        int i = low;
        int j = mid+1;
        int count = 0;
        
        while(i<= mid && j <= high){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                count += mid-i+1;
                temp.add(arr[j]);
                j++;
            }
        }
        
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=high){
            temp.add(arr[j]);
            j++;
        }
        for(int k=low;k<=high;k++){
            arr[k]=temp.get(k-low);
        }
        return count;
    }
}

T.C = O(n log n)
S.C = O(n)