

bool isPalindrome(char * s){
    
    if(strlen(s)==0)return true;
    char* new = (char*)malloc(strlen(s)*sizeof(char));
    
    
    int size=0;
    int indeks=0;
    char c;
    
    while(s[indeks]!='\0'){
        c=s[indeks];
        if(c>='A' && c<='Z'){
            c+=32;
            new[size]=c;
            size++;
        }else if(c>='a' && c<='z'){
            new[size]=c;
            size++;
        }else if(c>='0' && c<='9'){
            new[size]=c;
            size++;
         }
        
        indeks++;
    }
    
    if(size==0)return true;
    if(size==2){
        if(new[0]!=new[1])return false;
        if(new[1]==new[0])return true;
    }
    
    
    int n = size-1;
    
    for(int i = 0; i<=size/2; i++){
        if(new[i]!=new[n]){
            return false;
        }    
        n--;
    }
    return true;

}