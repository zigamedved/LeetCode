int* convert(int z){
    int* current = (int*)calloc(32,sizeof(int));
    int count=0;
    int num = 0;
    
    while(z>0){
        if(z%2==0){
            current[count]=0;
        }else if(z%2!=0){
            current[count]=1;
        }
        count++;
        z=z/2;
    }
    return current;
}

int hammingDistance(int x, int y){
    int* first;
    int* second;
    int count=0;
    
    first=convert(x);
    second=convert(y);
    
    for(int i = 0; i<32; i++){
        if(first[i]!=second[i])count++;
    }
    
    free(first);
    free(second);
    
    return count;
}


