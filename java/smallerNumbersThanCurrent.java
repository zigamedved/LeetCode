class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int count=0;
        for(int i = 0;i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(i==j)continue;
                if(nums[i]>nums[j])count++;
            }
            res[i]=count;
            count=0;
        }
        return res;
    }
}