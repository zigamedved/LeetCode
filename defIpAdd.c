

char * defangIPaddr(char * address){
    int len = 0;
    while(address[len]!='\0'){
        len++;
    }
    
    char* res = (char*)malloc((len+6)*sizeof(char));
    
    int i = 0;
    int j = 0;
    char c;
    
    while(address[i]!='\0'){
        c=address[i];
        if(c=='.'){
            j++;
            res[j]='.';
            res[j-1]='[';
            res[j+1]=']';
            j+=2;
        }else{
            res[j]=c;
            j++;
        }
        i++;
    }
    
    for(int i = 0; i<len+6; i++){
        printf("%c",res[i]);
    }
  
    return res;
}