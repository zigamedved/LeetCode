class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> tab = new ArrayList<Integer>(nums.length);
        
        for(int i = 0; i<nums.length; i++){
            tab.add(index[i],nums[i]);
        }
        
        int[] res = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            res[i]=tab.get(i);
        }
        return res;
    }
}