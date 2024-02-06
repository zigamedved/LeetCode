class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int curr;
        for(int i = 0; i<prices.length; i++){
            for(int j = i+1; j<prices.length; j++){
                curr=prices[j]-prices[i];
                if(curr>max)max=curr;
                
            }
        }
        return max;
    }
}