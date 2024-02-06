/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

long reverse(long n){
    long result=0;
    while(n>0){
        result=result*10+n%10;
        n/=10;
    }
    return result;
}


struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    long sum1=0;
    long sum2=0;
    int count1=1;
    int count2=1;
    
    //vodilne nicle
    struct ListNode* nicle1=l1;
    struct ListNode* nicle2=l2;
    while(nicle1->val==0 && nicle1->next!=NULL){
        count1*=10;
        nicle1=nicle1->next;
    }
    while(nicle2->val==0 && nicle2->next!=NULL){
        count2*=10;
        nicle2=nicle2->next;
    }
    //printf("%d %d\n",count1,count2);
    
    while(l1!=NULL){
        sum1=sum1*10+l1->val;
        l1=l1->next;
        
    }
    while(l2!=NULL){
        sum2=sum2*10+l2->val;
        l2=l2->next;
    }
    
    //printf("%d %d\n",sum1,sum2);
    sum1=reverse(sum1);
    sum2=reverse(sum2);
    //pomnozi
    sum1*=count1;
    sum2*=count2;
    
    sum1+=sum2;
    //sum1=reverse(sum1);
    //printf("%d\n",sum1);
    struct ListNode* result = NULL;
    result = (struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode* pointer=result;
    
    if(sum1==0){
        result->val=0;
        result->next=NULL;
        return pointer;
    }
    
    while(sum1>0){
        result->val=sum1%10;
        sum1/=10;
        result->next=(struct ListNode*)malloc(sizeof(struct ListNode));
        
        if(sum1==0){
            break;
        }
        result=result->next;
        
    }
    result->next=NULL;

    return pointer;
}
