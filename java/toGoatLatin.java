class Solution {
    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        String result ="";
        String word;
        
        for(int i = 0; i<words.length; i++){
            word=words[i];
            char first = word.charAt(0);
            char res = first;
            first=Character.toLowerCase(first);
            
            if(first=='a' || first=='e' ||first=='i'||first=='o'|| first=='u'){
                word=word+"ma";
            }else{
                word = word.substring(1,word.length());
                word=word+res+"ma";
            }
            String a="a";
            for(int j = 0;j<i;j++){
                a=a+"a";
            }
            word=word+a;
            words[i]=word;
            result=result+word+" ";
        }
        return result.substring(0,(result.length()-1));
    }
}