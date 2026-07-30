class Solution{
    public int maxProfit(int[] prices){
        int minPrice = prices[0];
        int maximumProfit = 0;
        
        for(int price : prices){
            
            int profit = price - minPrice;
            maximumProfit = Math.max(profit,maximumProfit);
            minPrice = Math.min(minPrice,price);
        }
        return maximumProfit;
    }
}

T.C = O(n)
S.C = O(1)
