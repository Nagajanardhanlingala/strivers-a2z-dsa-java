class Main {
    public static double minimiseMaxDistance(int[] stations, int k) {
        double maxGap = 0;
        for(int i=1;i<stations.length;i++){
            double gap = stations[i] - stations[i-1];
            maxGap = Math.max(maxGap,gap);
        }

        double low = 0;
        double high = maxGap;

        while(high-low > 1e-6){
            double mid = low+(high-low)/2.0;
            if(canPlace(stations,k,mid)){
                high=mid;
            }else{
                low=mid;
            }
        }
        return low;
    }

    public static boolean canPlace(int[] stations, int k, double mid) {
        int required = 0;
        for(int i=1;i<stations.length;i++){
            double gap = stations[i] -stations[i-1];
            int stationsNeeded = (int)Math.ceil(gap/mid)-1;
            required += stationsNeeded;
            if(required > k){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int [] stations ={1,2,3,4,5,6,7,8,9,10};
        int k = 1;
        System.out.println(minimiseMaxDistance(stations,k));
    }
}

T.C = O(n × log(range / precision))
S.C = O(1)