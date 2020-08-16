

void reverseString(char* s, int sSize){
    
    char c;
    int n;
    int index=sSize-1;
        
    if(sSize%2==0){
        n=sSize/2;    
    }else{
        n=(sSize/2);
    }
    for(int i = 0; i<n;i++){
        c=s[i];
        s[i]=s[index];
        s[index]=c;
        index--;
    }
    return s;
}