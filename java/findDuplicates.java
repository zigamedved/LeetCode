class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int[] tab = new int[nums.length];
        
        for(int i = 0; i<nums.length; i++){
            tab[(nums[i]-1)]+=1;
        }
        for(int i = 0; i<nums.length; i++){
            //System.out.printf("%d,",tab[i]);
            if(tab[i]==2){
                res.add(i+1);
                //System.out.printf("%d,",(i+1));
            }
        }
        return res;
    }
}