class Main{
    public static int aggressiveCows(int[] stalls, int k){
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length-1] - stalls[0];
        while(low <= high){
            int mid = low+(high-low)/2;
            if(canWePlace(stalls,k,mid)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    
    private static boolean canWePlace(int[] stalls, int k, int distance){
        int lastCow = stalls[0];
        int count=1;
        for(int i=1;i<stalls.length;i++){
            if(stalls[i] - lastCow >= distance){
                lastCow = stalls[i];
                count++;
            }
        }
        if(count >= k){
            return true;
        }
        return false;
    }
}

T.C = O(n log + n log range)
S.c = O(1)