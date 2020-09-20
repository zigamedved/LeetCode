class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++){
            if(pairs.get(nums[i])==null){
                pairs.put(nums[i],1);
            }else return true;
        }
        return false;
    }
}