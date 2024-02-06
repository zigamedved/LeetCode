class Solution {
    public String restoreString(String s, int[] indices) {
        String res = s;
        char[] curr = res.toCharArray();
       
        for(int i = 0; i<indices.length; i++){
            curr[indices[i]]=res.charAt(i);
        
        }
        
        res = String.valueOf(curr);
        return res;
    }
}