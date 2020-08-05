

int maxProduct(int* nums, int numsSize){
    if(numsSize==1)return (nums[0]-1);
    int max=0;
    int product=0;
    for(int i = 0; i<numsSize; i++){
        for(int j = i+1; j<numsSize; j++){
            product=(nums[i]-1)*(nums[j]-1);
            if(product>max){
                max=product;
            }
        }
    }
    return max;
}