class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m*k>bloomDay.length){
            return -1;
        }
        int minBloomDay = bloomDay[0];
        int maxBloomDay = bloomDay[0];
        for(int i=1;i<bloomDay.length;i++){
            if(bloomDay[i] < minBloomDay){
                minBloomDay = bloomDay[i];
            }
            if(bloomDay[i] > maxBloomDay){
                maxBloomDay = bloomDay[i];
            }
        }
        int low = minBloomDay;
        int high = maxBloomDay;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(canMake(bloomDay,mid,m,k)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static boolean canMake(int[] bloomDay,int mid, int m,int k){
        int count=0;
        int bouquets=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] <= mid){
                count++;
                if(count == k){
                bouquets++;
                count=0;
            }
            }else{
                count=0;
            }
        }
        return bouquets>=m;
    }
}