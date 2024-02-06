class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> pairs = new HashMap<Integer, Integer>();
        
        for(int i = 0; i<nums.length; i++){
            if((pairs.get(nums[i])==null)){
                pairs.put(nums[i],1);
            }else{
                int value=pairs.get(nums[i]);
                pairs.put(nums[i],value+1);        
            }
        }
        for (Integer i : pairs.keySet()) {
            if(pairs.get(i)>(nums.length/3))result.add(i);
        }   
        return result;
    }
}