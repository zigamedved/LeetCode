class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(i==j)continue;
                if(Math.abs(i-j)<=k && Math.abs(1L*nums[i]- nums[j])<=t){
                    return true;
                }
            }
        }
        return false;
    }
}