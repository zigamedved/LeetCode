class Solution {
    public int findMin(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return nums[0];
        
        int min=nums[0];
       
        //O(n)
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        
        return min;
        
        
    }
}