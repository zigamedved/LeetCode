class WordDictionary {
    
    List<String> books = new ArrayList<String>();
    
    /** Initialize your data structure here. */
    public WordDictionary() {
       
        
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
       books.add(word);
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        
        if(word.length()==0)return false;
        char[] tab = word.toCharArray();
        char[] tab2;
        
        for (String curr : books) {
                int found = 1;
                tab2=curr.toCharArray();
                if(tab.length!=tab2.length)continue;
               //System.out.println("Current word: "+word);
                //System.out.println("Comparing:"+curr);
                for(int i = 0; i<tab.length; i++){
                   if((word.charAt(i)=='.' || tab[i]==tab2[i]) && found==1){
                            //System.out.println("THHERE IS A DOT"+word.charAt(i));
                            found=1;
                    }else{
                            found=0;
                            break;
                    }
                    if(i==(tab.length-1) && found==1)return true;
                }
            
        }
        return false;
    }
}
