
bool isAnagram(char * s, char * t){
    
    if(strlen(s)!=strlen(t))return false;
    
    //int* letters = (int*)calloc(26,sizeof(int));
    
    int letters[26];
    for(int i = 0; i<26; i++){
        letters[i]=0;
    }
    
    char curr;
    for(int i = 0; i<strlen(s); i++){
        curr=s[i];
        letters[curr-'a']++;
    }
    
    for(int i = 0; i<strlen(t); i++){
            curr=t[i];
            letters[curr-'a']--;
    }
    
    for(int i = 0; i<26; i++){
        if(letters[i]>0)return false;
    }
    
    //free(letters);
    
    return true;
}