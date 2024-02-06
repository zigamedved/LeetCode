
int findDuplicate(int* nums, int numsSize){
    int* tab = (int*)calloc((numsSize+1),sizeof(int));
    int index;
    
    for(int i = 0; i<numsSize; i++){
        index=nums[i];
        tab[index]++;
        if(tab[index]>1)return index;
    }
    
    return 0;
}