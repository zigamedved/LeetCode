int removeElement(int* nums, int numsSize, int val){
    
    int newSize=0;
    for(int i = 0; i<numsSize; i++){
        if(nums[i]!=val){
            nums[newSize]=nums[i];
            newSize++;
        }
    }
    
    return newSize;

}