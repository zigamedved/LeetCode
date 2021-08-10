class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        //find biggest possible prefix
        int minLen=300;
        String min="";
        
        for(int i = 0; i<strs.length; i++){
            if(strs[i].length()<=minLen){
                minLen=strs[i].length();
                min=strs[i];
            }
        }
        
        //compare 1 by one with the found prefix
        String subWord="";
        for(int i = 0; i<minLen; i++){
            subWord=min.substring(0,i+1);
            
            for(int j = 0; j<strs.length; j++){
                String sub=strs[j].substring(0,i+1);
                
                if(subWord.equals(sub)){
                    continue;
                }else return subWord.substring(0,i);
            }
        }
        
        String answer="";
        answer=subWord;
        return answer;
    }
}
