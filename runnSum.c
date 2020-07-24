int* runningSum(int* nums, int numsSize, int* returnSize){
    if(numsSize==1)return nums; 
    int sum = 0;
   
    int* tab = (int*)calloc(numsSize,sizeof(int));
    
    for(int i = 0; i<numsSize; i++){
        sum+=nums[i];
        tab[i]=sum;
    }
    
    *returnSize=numsSize;
    return tab;
}