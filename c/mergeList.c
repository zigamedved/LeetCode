/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2){
    
    if(l1==NULL)return l2;
    if(l2==NULL)return l1;
    if(l1==NULL && l2==NULL)return NULL;
    
    struct ListNode* start;
    struct ListNode* res;
    
    if(l1->val<l2->val){
        start=l1;
        l1=l1->next;
    }else{
        start=l2;
        l2=l2->next;
    }
    
    res=start;
    
    while(l1!=NULL && l2!=NULL){
        if(l1->val<l2->val){
            start->next=l1;
            l1=l1->next;
        }else{
            start->next=l2;
            l2=l2->next;
        }
        
        start=start->next;
    }
    
    if(l1==NULL){
        if(l2){
            start->next=l2;
        }
    }else if(l2==NULL){
        if(l1){
            start->next=l1;
        }
    }
    
    return res;
  
}