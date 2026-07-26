class Solution {
    public int maximumProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        
        int minimum = Integer.MAX_VALUE;
        int secondMinimum = Integer.MAX_VALUE;
        
        for(int num : nums){
            if(num > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest){
                thirdLargest = secondLargest;
                secondLargest = num;
            }else{
                if(num > thirdLargest){
                    thirdLargest = num;
                }
            }
            if(num < minimum){
                secondMinimum = minimum;
                minimum = num;
            }else if(num < secondMinimum){
                secondMinimum = num;
            }
        }
        int product1 = largest*secondLargest*thirdLargest;
        int product2 = minimum*secondMinimum*largest;
        return Math.max(product1,product2);
    }
}