class Solution {
    public int maxProduct(int[] nums) {
        int curr_max=0;
        int curr_min=0;
        int result=0;
        
        for(int i = 0; i<nums.length; i++){
            int product = curr_max;
            
            curr_max=Math.max(Math.max(curr_max*nums[i],curr_min*nums[i]),nums[i]);
            curr_min=Math.min(Math.min(product*nums[i],curr_min*nums[i]),nums[i]);
            
            if(curr_max>result){
                result=curr_max;
            }    
        }
        return result;
    }
}