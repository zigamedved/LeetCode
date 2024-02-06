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
    
    
    struct ListNode* result;
    struct ListNode* temp;
    
    if(l1->val>l2->val){
        result=l2;
        l2=l2->next;
    }else{
        result=l1;
        l1=l1->next;
    }
    
    temp=result;
    
    while(l1 && l2){
        if(l1->val<l2->val){
            temp->next=l1;
            temp=temp->next;
            l1=l1->next;
        }else{
            temp->next=l2;
            temp=temp->next;
            l2=l2->next;
        }
    }
    
    if(l1==NULL){
        temp->next=l2;
    }else if(l2==NULL){
        temp->next=l1;
    }
    
    
    
    
    
    
    return result;
}