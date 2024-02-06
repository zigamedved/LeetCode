class Solution {
    public int[] getConcatenation(int[] nums) {
        
    int[] array = new int[nums.length*2];
    int index = 0;
        
    for(int i = 0; i < array.length; i++){
        array[i] = nums[index];
        index++;
        if(index==nums.length)index=0;
    }
    
    return array;
        
    }
}
