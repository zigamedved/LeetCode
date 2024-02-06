class Solution {
    public int search(int[] nums, int target) {
        
        int low=0;
        int high = nums.length-1;
        int middle = low + (high-low)/2; 
        
        while(low<=high){
            middle=low + (high-low)/2; 
            if(nums[middle]==target)return middle;
            if(nums[middle]>target){
                high=middle-1;
            }else if(nums[middle]<target){
                low=middle+1;
            }
        }
        return -1;
    }
}
