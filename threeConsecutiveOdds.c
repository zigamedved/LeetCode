

bool threeConsecutiveOdds(int* arr, int arrSize){
    int flag1=0;
    int flag2=0;
    
    for(int i = 0;i<arrSize;i++){
        if(flag1==1 && flag2==1){
            if(arr[i]%2!=0)return true;
            flag1=0;
            flag2=0;
        }else if(flag1==0 && arr[i]%2!=0){
            flag1=1;
        }else if(flag1==1 && flag2==0 && arr[i]%2!=0){
            flag2=1;
        }else if(arr[i]%2==0){
            flag1=0;
            flag2=0;
        }
    }
    return false;
}