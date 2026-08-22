class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for(int i=0;i<piles.length;i++){
            if(piles[i] >= maxPile){
                maxPile = piles[i];
            }
        }
        int low=1;
        int high=maxPile;
        while(low <= high){
            int mid = low+(high-low)/2;
            long hours = ceilOfPiles(piles,mid);
            if(hours > h){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }

    public static long ceilOfPiles(int[] piles,int mid){
        long hours = 0;
        for(int i=0;i<piles.length;i++){
            hours += (piles[i]+(mid-1))/mid;
        }
        return hours;
    }
}