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
        int[] tab = new int[32];
        int indeks=0;
        while (num > 0) { 
            if(num%2==0){
                tab[indeks]=0;
            }else{
                tab[indeks]=1;
                count++;
            }
            indeks++;
            num/=2;
        } 
        return count; 
    }
    
}