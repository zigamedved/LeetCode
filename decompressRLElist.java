class Solution {
    public int[] decompressRLElist(int[] nums) {
        int length=0;
        for(int i = 0; i<nums.length; i+=2){
            length+=nums[i];
        }
        int[] res = new int[length];
        int count=0;
        int freq,val;
        for(int i = 0; i<nums.length; i+=2){
            freq=nums[i];
            val=nums[i+1];
            for(int j = 0; j<freq; j++){
                res[count]=val;
                count++;
            }
        }
        
        return res;
    }
}