class Main{
    public static int floorSqrt(int n){
        int low = 1;
        int high=n;
        int answer = 0;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(mid <= n / mid){
                answer = mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return answer;
    }
    
    public static void main(String[] args){
        int n = 27;
        System.out.println(floorSqrt(n));
    }
}
