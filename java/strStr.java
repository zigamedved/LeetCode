class Solution {
    public int strStr(String haystack, String needle) {
        
        int hayLen=haystack.length();
        int neeLen=needle.length();
        
        if(neeLen==0)return 0;
        
        for(int i = 0; i<hayLen; i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                //razrezemo haystack od i-do needle.length in comparamo...
                int len=i+neeLen;
                if(len>hayLen)return -1;
                String search = haystack.substring(i,len);
                if(check(search,needle)){
                    return i;
                }
            }
        }
        return -1;
    }
    
    
    public static boolean check(String haystack, String needle){
        if(haystack.equals(needle))return true;
        return false;
    }
}
