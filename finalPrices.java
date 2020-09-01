class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
       for(int i = 0; i<prices.length; i++){
            int found=0;
            for(int j = i+1; j<prices.length; j++){
                if(prices[j]<=prices[i]){
                    found=1;
                    result[i]=prices[i]-prices[j];
                    break;
                }
            }
            if(found==0)result[i]=prices[i];
        }
        return result;
    }
}