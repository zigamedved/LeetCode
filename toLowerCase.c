

char * toLowerCase(char * str){
    int index=0;
    while(str[index]!='\0'){
        if(str[index]>='A'&& str[index]<='Z'){
            str[index]=str[index]+('a'-'A');
        }
        index++;
    }
    return str;
}