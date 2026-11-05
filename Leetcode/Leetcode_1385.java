class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int distanceValue = 0;
        for(int val : arr1){
            int lowerBound = val - d;
            int upperBound = val + d;

            if(!hasCloseElement(arr2,lowerBound,upperBound)){
                distanceValue++;
            }
        }
        return distanceValue;
    }
    private boolean hasCloseElement(int[] arr,int lower, int upper){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left+(right-left)/2;

            if(arr[mid] >= lower && arr[mid] <= upper){
                return true;
            }else if(arr[mid] < lower){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }
}