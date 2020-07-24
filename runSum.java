class Solution {
    public int[] runningSum(int[] nums) {
        int[] tab = new int[nums.length];
        int sum = 0;
        
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
            tab[i]=sum;
        }
        
        return tab;
    }
}