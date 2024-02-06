bool* kidsWithCandies(int* candies, int candiesSize, int extraCandies, int* returnSize){
    int max=0;
    for(int i = 0; i<candiesSize; i++){
     if(candies[i]>max)max=candies[i];   
    }
    
    *returnSize=candiesSize;
    
    bool* res = (bool*)malloc(*returnSize*sizeof(bool));
    
    for(int i = 0; i<candiesSize; i++){
        if(candies[i]==max){
            res[i]=true;
            continue;
        }else if((candies[i]+extraCandies)>=max){
            res[i]=true;
            continue;
        }else
            res[i]=false;
    }
    return res;
}