class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] tab = new int[2000];
        Set<Integer> nums = new HashSet<Integer>(); 
        int num=0;
        
        for(int i = 0; i<arr.length;i++){
            num = arr[i];    
            if(num<0){
                num+=1000;
            }
            tab[num]++;
        }
        
        for(int i = 0; i<2000; i++){
            if(tab[i]==0)continue;
            if(nums.contains(tab[i])){
                return false;
            }else nums.add(tab[i]);
        }
        
        return true;
    }
}