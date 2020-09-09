class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        
        for(int i = 0; i<=num; i++){
            result[i]=bits(i);
        }    
        return result; 
    }
    
    private int bits(int num){
        int count = 0; 
        while (num > 0) { 
            count += num & 1; 
            num >>= 1; 
        } 
        return count; 
    }
    
}