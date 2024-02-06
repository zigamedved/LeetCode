class Solution {
    public int findMaximumXOR(int[] nums) {
        int max=0;
        int cur;
        for(int i = 0; i<nums.length;i++){
            for(int j = 0; j<nums.length;j++){
                cur = nums[i]^nums[j];
                if(cur>max){
                    max=cur;
                }
            }
        }
        return max;
    }
}