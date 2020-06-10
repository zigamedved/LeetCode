class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
    
        int index=0;
        for(int i = 0; i<(2*n-1);i+=2){
            result[i]=nums[index];
            result[i+1]=nums[n+index];
            index++;
        }
        
        return result;
    }
}