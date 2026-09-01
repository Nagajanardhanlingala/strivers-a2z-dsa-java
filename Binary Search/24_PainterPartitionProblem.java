class Main{
    public static int findLargestMinDistance(int[] boards,int k){
        int sum = 0;
        int max = boards[0];
        for(int i=0;i<boards.length;i++){
            if(boards[i] > max){
                max = boards[i];
            }
            sum += boards[i];
        }
        int low = max;
        int high = sum;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(canPaint(boards,k,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static boolean canPaint(int[] boards,int k, int mid){
        int painters = 1;
        int currentWork = 0;
        for(int i=0;i<boards.length;i++){
            
            if(currentWork + boards[i] <= mid){
                currentWork += boards[i];
            }else{
                painters++;
                currentWork = boards[i];
                if(painters > k){
                    return false;
                }
            }
        }
        return true;
    }
}

T.C = O(n log(sum-max))
S.C = O(1)
