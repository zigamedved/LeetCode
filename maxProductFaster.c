

int maxProduct(int* nums, int numsSize){
    int max=0;
    int max2=0;
    for(int i = 0; i<numsSize; i++){
       if(nums[i]>max){
           max2=max;
           max=nums[i];
       }else if(nums[i]>max2)max2=nums[i];
    }
    return (max-1)*(max2-1);
}